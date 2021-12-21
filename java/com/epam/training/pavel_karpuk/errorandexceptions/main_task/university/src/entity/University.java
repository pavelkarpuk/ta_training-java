package entity;

import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import exception.NoEntityException;
import exception.UniversityHasNoFacultiesException;
import utils.Utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class University {

    private List<Faculty> listOfFaculties;

    public University(List<Faculty> listOfFaculties) throws UniversityHasNoFacultiesException {
        if (listOfFaculties == null || listOfFaculties.isEmpty())
            throw new UniversityHasNoFacultiesException("There is no any faculties at the university");
        this.listOfFaculties = listOfFaculties;
    }

    public List<Faculty> getListOfFaculties() {
        return listOfFaculties;
    }

    public void setListOfFaculties(List<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }

    public double getAverageGradeForStudent(String firstName, String lastName) throws NoEntityException {
        Student student = null;
        for (Faculty faculty : listOfFaculties) {
            try {
                student = faculty.getStudentByName(firstName, lastName);
            } catch (NoEntityException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        if (student == null)
            throw new NoEntityException("Student " + firstName + " " + lastName + " doesn't study at this university.");
        return student.getAverageGrade();
    }

    public Faculty getFacultyByName(FacultyEnum facultyEnum) throws NoEntityException {
        for (Faculty faculty : listOfFaculties) {
            if (faculty.getFaculty().equals(facultyEnum)) {
                return faculty;
            }
        }
        throw new NoEntityException("There is no such Faculty: " + facultyEnum.name() + ".");
    }

    public double getAverageGradeForSubjectInGroup(SubjectEnum subjectEnum, GroupEnum groupEnum, FacultyEnum facultyEnum) throws NoEntityException {
        return getFacultyByName(facultyEnum).getAverageGradeForSubjectInGroup(subjectEnum, groupEnum);
    }

    public Collection<List<Integer>> getAllGradesForSubjectInUniversity(SubjectEnum subjectEnum) throws NoEntityException {
        Collection<List<Integer>> allGradesForSubjectInUniversity = new ArrayList<>();
        for (Faculty faculty : listOfFaculties) {
            allGradesForSubjectInUniversity.addAll(faculty.getAllGradesForSubjectInFaculty(subjectEnum));
        }
        if (allGradesForSubjectInUniversity.isEmpty())
            throw new NoEntityException("There is no such subject in this university.");
        return allGradesForSubjectInUniversity;
    }

    public double getAverageGradeForSubjectInUniversity(SubjectEnum subjectEnum) throws NoEntityException {
        return Utils.calculateAverageGrade(getAllGradesForSubjectInUniversity(subjectEnum));
    }

    @Override
    public String toString() {
        return "University{" +
                "listOfFaculties=" + listOfFaculties +
                '}';
    }
}
