package entity;

import constants.GroupEnum;
import exception.GroupHasNoStudentsException;

import java.util.List;
import java.util.Objects;

public class Group {

    private GroupEnum group;
    private List<Student> listOfStudents;

    public Group(GroupEnum group, List<Student> listOfStudents) throws GroupHasNoStudentsException {
        if (listOfStudents == null || listOfStudents.isEmpty()) throw new GroupHasNoStudentsException("There is no any students at the group.");
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
