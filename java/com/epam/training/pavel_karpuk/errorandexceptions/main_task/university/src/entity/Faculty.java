package entity;

import constants.FacultyEnum;
import exception.FacultyHasNoGroupsException;

import java.util.List;
import java.util.Objects;

public class Faculty {

    private FacultyEnum faculty;
    private List<Group> listOfGroups;

    public Faculty(FacultyEnum faculty, List<Group> listOfGroups) throws FacultyHasNoGroupsException {
        if (listOfGroups == null || listOfGroups.isEmpty()) throw new FacultyHasNoGroupsException("There is no any groups at the faculty.");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty1 = (Faculty) o;
        return faculty == faculty1.faculty && Objects.equals(listOfGroups, faculty1.listOfGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, listOfGroups);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty=" + faculty +
                ", listOfGroups=" + listOfGroups +
                '}';
    }
}
