package entity;

import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import exception.EmptyCollectionException;
import exception.UniversityHasNoFacultiesException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class University {

    private List<Faculty> listOfFaculties;

    public University(List<Faculty> listOfFaculties) throws UniversityHasNoFacultiesException {
        if (listOfFaculties == null || listOfFaculties.isEmpty()) throw new UniversityHasNoFacultiesException("There is no any faculties at the university");
        this.listOfFaculties = listOfFaculties;
    }

    public List<Faculty> getListOfFaculties() {
        return listOfFaculties;
    }

    public void setListOfFaculties(List<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(listOfFaculties, that.listOfFaculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfFaculties);
    }

    @Override
    public String toString() {
        return "University{" +
                "listOfFaculties=" + listOfFaculties +
                '}';
    }

    public Collection<ArrayList<Integer>> getAllStudentGrades(String studentName, String studentLastName) throws EmptyCollectionException {
        Collection<ArrayList<Integer>> allStudentGrades = new ArrayList<>();
        for (Faculty faculty : listOfFaculties) {
            for (Group group : faculty.getListOfGroups()) {
                for (Student student : group.getListOfStudents()) {
                    if (studentName.equals(student.getStudentName()) && studentLastName.equals(student.getStudentLastName())) {
                        allStudentGrades = student.getSubjectsWithGrades().values();
                    }
                }
            }
        }
        if (allStudentGrades.isEmpty()) throw new EmptyCollectionException("There is no such student.");
        return allStudentGrades;
    }

    public Collection<ArrayList<Integer>> getAllGradesForSubjectInGroup(SubjectEnum subjectEnum, GroupEnum groupEnum, FacultyEnum facultyEnum) throws EmptyCollectionException {
        Collection<ArrayList<Integer>> allGradesForSubjectInGroup = new ArrayList<>();
        for (Faculty faculty : listOfFaculties) {
            if (faculty.getFaculty().equals(facultyEnum)) {
                for (Group group : faculty.getListOfGroups()) {
                    if (group.getGroup().equals(groupEnum)) {
                        for (Student student : group.getListOfStudents()) {
                            if (student.getSubjectsWithGrades().containsKey(subjectEnum)) {
                                allGradesForSubjectInGroup.add(student.getSubjectsWithGrades().get(subjectEnum));
                            }
                        }
                    }
                }
            }
        }
        if (allGradesForSubjectInGroup.isEmpty()) throw new EmptyCollectionException("There is no such subject in this group.");
        return allGradesForSubjectInGroup;
    }

    public Collection<ArrayList<Integer>> getAllGradesForSubjectInUniversity(SubjectEnum subjectEnum) throws EmptyCollectionException {
        Collection<ArrayList<Integer>> allGradesForSubjectInUniversity = new ArrayList<>();
        for (Faculty faculty : listOfFaculties) {
            for (Group group : faculty.getListOfGroups()) {
                for (Student student : group.getListOfStudents()) {
                    if (student.getSubjectsWithGrades().containsKey(subjectEnum)) {
                        allGradesForSubjectInUniversity.add(student.getSubjectsWithGrades().get(subjectEnum));
                    }
                }
            }
        }
        if (allGradesForSubjectInUniversity.isEmpty()) throw new EmptyCollectionException("There is no such subject in this university.");
        return allGradesForSubjectInUniversity;
    }
}
