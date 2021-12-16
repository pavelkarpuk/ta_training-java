package entity;

import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import exception.StudentHasNoSubjectsException;
import exception.WrongGradeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Student {

    private String studentName;
    private String studentLastName;
    private FacultyEnum faculty;
    private GroupEnum group;
    private HashMap<SubjectEnum, ArrayList<Integer>> subjectsWithGrades;

    public Student(String studentName, String studentLastName, FacultyEnum faculty, GroupEnum group, HashMap<SubjectEnum, ArrayList<Integer>> subjectsWithGrades) throws StudentHasNoSubjectsException, WrongGradeException {
        if (subjectsWithGrades == null || subjectsWithGrades.isEmpty()) throw new StudentHasNoSubjectsException();
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.faculty = faculty;
        this.group = group;
        this.subjectsWithGrades = subjectsWithGrades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(studentLastName, student.studentLastName) && faculty == student.faculty && group == student.group && Objects.equals(subjectsWithGrades, student.subjectsWithGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentLastName, faculty, group, subjectsWithGrades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", faculty=" + faculty +
                ", group=" + group +
                ", subjectsWithGrades=" + subjectsWithGrades +
                '}';
    }
}
