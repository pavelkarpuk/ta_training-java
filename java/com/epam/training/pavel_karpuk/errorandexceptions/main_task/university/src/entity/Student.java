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
    private HashMap<SubjectEnum, ArrayList<Integer>> subjectsWithGrades;

    public Student(String firstName, String lastName, FacultyEnum faculty, GroupEnum group, HashMap<SubjectEnum, ArrayList<Integer>> subjectsWithGrades) throws StudentHasNoSubjectsException, WrongGradeException {
        if (subjectsWithGrades == null || subjectsWithGrades.isEmpty()) throw new StudentHasNoSubjectsException("Student does not have any subjects.");
        for (SubjectEnum subject : subjectsWithGrades.keySet()) {
            for (Integer grade : subjectsWithGrades.get(subject)) {
                if (grade < 0 || grade > 10) throw new WrongGradeException("The grade cannot be lower than 0 or higher than 10.");
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

    public HashMap<SubjectEnum, ArrayList<Integer>> getSubjectsWithGrades() {
        return subjectsWithGrades;
    }

    public void setSubjectsWithGrades(HashMap<SubjectEnum, ArrayList<Integer>> subjectsWithGrades) {
        this.subjectsWithGrades = subjectsWithGrades;
    }

    public double getAverageGrade(){
        return Utils.calculateAverageGrade(subjectsWithGrades.values());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && faculty == student.faculty && group == student.group && Objects.equals(subjectsWithGrades, student.subjectsWithGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, faculty, group, subjectsWithGrades);
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
