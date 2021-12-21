package entity;

import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import exception.StudentHasNoSubjectsException;
import exception.WrongGradeException;
import utils.Utils;

import java.util.*;

public class Student {

    private String firstName;
    private String lastName;
    private FacultyEnum faculty;
    private GroupEnum group;
    private Map<SubjectEnum, List<Integer>> subjectsWithGrades;

    public Student(String firstName, String lastName, FacultyEnum faculty, GroupEnum group, Map<SubjectEnum, List<Integer>> subjectsWithGrades) throws StudentHasNoSubjectsException, WrongGradeException {
        if (subjectsWithGrades == null || subjectsWithGrades.isEmpty())
            throw new StudentHasNoSubjectsException("Student does not have any subjects.");
        for (SubjectEnum subject : subjectsWithGrades.keySet()) {
            for (Integer grade : subjectsWithGrades.get(subject)) {
                if (grade < 0 || grade > 10)
                    throw new WrongGradeException("The grade cannot be lower than 0 or higher than 10.");
            }
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.group = group;
        this.subjectsWithGrades = subjectsWithGrades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FacultyEnum getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEnum faculty) {
        this.faculty = faculty;
    }

    public GroupEnum getGroup() {
        return group;
    }

    public void setGroup(GroupEnum group) {
        this.group = group;
    }

    public Map<SubjectEnum, List<Integer>> getSubjectsWithGrades() {
        return subjectsWithGrades;
    }

    public void setSubjectsWithGrades(Map<SubjectEnum, List<Integer>> subjectsWithGrades) {
        this.subjectsWithGrades = subjectsWithGrades;
    }

    public double getAverageGrade() {
        return Utils.calculateAverageGrade(subjectsWithGrades.values());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty=" + faculty +
                ", group=" + group +
                ", subjectsWithGrades=" + subjectsWithGrades +
                '}';
    }
}
