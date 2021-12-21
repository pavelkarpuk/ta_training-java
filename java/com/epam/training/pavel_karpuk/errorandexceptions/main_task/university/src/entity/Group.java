package entity;

import constants.GroupEnum;
import constants.SubjectEnum;
import exception.NoEntityException;
import exception.GroupHasNoStudentsException;
import utils.Utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Group {

    private GroupEnum group;
    private List<Student> listOfStudents;

    public Group(GroupEnum group, List<Student> listOfStudents) throws GroupHasNoStudentsException {
        if (listOfStudents == null || listOfStudents.isEmpty())
            throw new GroupHasNoStudentsException("There is no any students at the group.");
        this.group = group;
        this.listOfStudents = listOfStudents;
    }

    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public Student getStudentByName(String firstName, String lastName) throws NoEntityException {
        for (Student student : listOfStudents) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        throw new NoEntityException();
    }

    public double getAverageGradeForSubjectInGroup(SubjectEnum subjectEnum) throws NoEntityException {
        double averageGradeForSubjectInGroup = Utils.calculateAverageGrade(getAllGradesForSubjectInGroup(subjectEnum));
        if (averageGradeForSubjectInGroup == 0.0)
            throw new NoEntityException("There is no such subject in Group: " + group.name() + ".");
        return averageGradeForSubjectInGroup;
    }

    public Collection<List<Integer>> getAllGradesForSubjectInGroup(SubjectEnum subjectEnum) {
        Collection<List<Integer>> allGradesForSubjectInGroup = new ArrayList<>();
        for (Student student : getListOfStudents()) {
            if (student.getSubjectsWithGrades().containsKey(subjectEnum)) {
                allGradesForSubjectInGroup.add(student.getSubjectsWithGrades().get(subjectEnum));
            }
        }
        return allGradesForSubjectInGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group1 = (Group) o;
        return group == group1.group && Objects.equals(listOfStudents, group1.listOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, listOfStudents);
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}
