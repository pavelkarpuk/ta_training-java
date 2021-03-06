package entity;

import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import exception.NoEntityException;
import exception.FacultyHasNoGroupsException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Faculty {

    private FacultyEnum faculty;
    private List<Group> listOfGroups;

    public Faculty(FacultyEnum faculty, List<Group> listOfGroups) throws FacultyHasNoGroupsException {
        if (listOfGroups == null || listOfGroups.isEmpty())
            throw new FacultyHasNoGroupsException("There is no any groups at the faculty.");
        this.faculty = faculty;
        this.listOfGroups = listOfGroups;
    }

    public FacultyEnum getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEnum faculty) {
        this.faculty = faculty;
    }

    public List<Group> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    public Student getStudentByName(String firstName, String lastName) throws NoEntityException {
        Student student = null;
        for (Group group : listOfGroups) {
            try {
                student = group.getStudentByName(firstName, lastName);
            } catch (NoEntityException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        if (student == null) throw new NoEntityException("No such student:" + firstName + " " + lastName + " in Faculty: " + faculty.name());
        return student;
    }

    public Group getGroupByName(GroupEnum groupEnum) throws NoEntityException {
        for (Group group : listOfGroups) {
            if (group.getGroup().equals(groupEnum)) {
                return group;
            }
        }
        throw new NoEntityException("There is no such Group: " + groupEnum.name() + ".");
    }

    public double getAverageGradeForSubjectInGroup(SubjectEnum subjectEnum, GroupEnum groupEnum) throws NoEntityException {
        return getGroupByName(groupEnum).getAverageGradeForSubjectInGroup(subjectEnum);
    }

    public Collection<List<Integer>> getAllGradesForSubjectInFaculty(SubjectEnum subjectEnum) {
        Collection<List<Integer>> allGradesForSubjectInFaculty = new ArrayList<>();
        for (Group group : listOfGroups) {
            allGradesForSubjectInFaculty.addAll(group.getAllGradesForSubjectInGroup(subjectEnum));
        }
        return allGradesForSubjectInFaculty;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty=" + faculty +
                ", listOfGroups=" + listOfGroups +
                '}';
    }
}
