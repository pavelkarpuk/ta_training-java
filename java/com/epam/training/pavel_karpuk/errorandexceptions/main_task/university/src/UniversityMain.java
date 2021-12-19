import constants.FacultyEnum;
import constants.GroupEnum;
import constants.SubjectEnum;
import entity.Faculty;
import entity.Group;
import entity.Student;
import entity.University;
import utils.Utils;

import java.util.*;

public class UniversityMain {

    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        List<Student> listOfCivilEngineeringGroup1 = Arrays.asList(
            new Student("Katie", "Moody", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_1,
                    new HashMap <>(Map.of(
                            SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 8)),
                            SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(5, 9, 6)),
                            SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(4, 4, 6)),
                            SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(9, 9, 9, 8))))),
            new Student("Leroy", "Johnson", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_1,
                    new HashMap <>(Map.of(
                            SubjectEnum.MATH, new ArrayList<>(Arrays.asList(2, 4)),
                            SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(6, 6)),
                            SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(6, 6, 6)),
                            SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(8, 9, 8))))),
            new Student("John", "Jones", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_1,
                    new HashMap <>(Map.of(
                            SubjectEnum.MATH, new ArrayList<>(Arrays.asList()),
                            SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(5)),
                            SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(6, 8)),
                            SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(6, 8, 9))))),
            new Student("Mark", "Brown", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_1,
                    new HashMap <>(Map.of(
                            SubjectEnum.MATH, new ArrayList<>(Arrays.asList(4, 5, 6, 7)),
                            SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(7, 7)),
                            SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(5, 5, 5)),
                            SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(9, 7))))),
            new Student("Derrick", "Willis", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_1,
                    new HashMap <>(Map.of(
                            SubjectEnum.MATH, new ArrayList<>(Arrays.asList(9, 9, 9)),
                            SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 9)),
                            SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(10)),
                            SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(10, 8, 9)))))
        );

        List<Student> listOfCivilEngineeringGroup2 = Arrays.asList(
                new Student("Mary", "Douglas", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9)),
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7)),
                                SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(10, 10, 7))))),
                new Student("Victor", "Bailey", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(4, 4)),
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(4, 4)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(4, 4)),
                                SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(4, 4))))),
                new Student("Philip", "Simmons", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9)),
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(7, 8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 6)),
                                SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(5, 6, 8))))),
                new Student("Allison", "Martinez", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(4, 5, 6)),
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 8)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(9, 9, 10)),
                                SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(8, 10))))),
                new Student("Anita", "Robinson", FacultyEnum.CIVIL_ENGINEERING, GroupEnum.CIVIL_ENGINEERING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(9, 9, 9)),
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 9)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(10, 5, 4)),
                                SubjectEnum.RESISTANCE_OF_MATERIALS, new ArrayList<>(Arrays.asList(10, 8, 9)))))
        );

        List<Student> listOfArchitectureGroup1 = Arrays.asList(
                new Student("Floyd", "Wilson", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8, 9)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList())))),
                new Student("Gloria", "Walters", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8, 9)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7,4,9))))),
                new Student("Lydia", "Lydia", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(6, 6)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(6, 6)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 6))))),
                new Student("Kent", "Farmer", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 5)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(5, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(5, 8, 3))))),
                new Student("Charlene", "Todd", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(4, 4, 4)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 8, 7, 6)))))
        );

        List<Student> listOfArchitectureGroup2 = Arrays.asList(
                new Student("Jason", "Flores", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(4, 4)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(4, 4, 4)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(4, 4))))),
                new Student("Janet", "Fields", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(10, 9, 8)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(10, 6, 8))))),
                new Student("Christopher", "Garrett", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(4, 9)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(8, 6, 9)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 8, 9, 10))))),
                new Student("James", "Ingram", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(4, 9, 10)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(6, 9, 8)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 8, 9))))),
                new Student("Claire", "Bryant", FacultyEnum.ARCHITECTURE, GroupEnum.ARCHITECTURE_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(4, 2)),
                                SubjectEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(10, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(7, 6, 5)))))
        );

        List<Student> listOfInstrumentMakingGroup1 = Arrays.asList(
                new Student("William", "Medina", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 9, 4, 6)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(5, 8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 5, 5))))),
                new Student("Chester", "Padilla", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 6, 8)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(5, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 5, 5))))),
                new Student("Lori", "Ellis", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 8, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 10, 10))))),
                new Student("Carol", "Brown", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(6, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 6, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 6, 10))))),
                new Student("Larry", "Davis", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 10, 10)))))
        );

        List<Student> listOfInstrumentMakingGroup2 = Arrays.asList(
                new Student("Mary", "Stanley", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(4, 9, 6)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(7, 8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 5, 9))))),
                new Student("Frank", "Brown", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(5, 7)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(5, 6, 8, 9, 10)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 5, 9))))),
                new Student("Edna", "Rodriguez", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList()),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(5, 6)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 10))))),
                new Student("Maxine", "Lawson", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(6, 7, 8, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 6, 7)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(10, 9))))),
                new Student("Anna", "Turner", FacultyEnum.INSTRUMENT_MAKING, GroupEnum.INSTRUMENT_MAKING_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(4, 5, 6)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(7, 9, 7)),
                                SubjectEnum.CONSTRUCTION_MECHANICS, new ArrayList<>(Arrays.asList(7, 6, 10)))))
        );

        List<Student> listOfEnergyGroup1 = Arrays.asList(
                new Student("Elizabeth", "Ingram", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(6, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 9)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6))))),
                new Student("Grace", "Hall", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(6, 8)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(10, 9, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 8, 9))))),
                new Student("Judith", "Collins", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 9, 6)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 7, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6, 10))))),
                new Student("Michael", "Moran", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(7, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 4, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6, 10))))),
                new Student("Linda", "Lyons", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(8, 8, 7)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 7, 8)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8, 6, 7)))))
        );

        List<Student> listOfEnergyGroup2 = Arrays.asList(
                new Student("Roger", "Chandler", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(4, 7, 4)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(4, 4, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 4, 4))))),
                new Student("Julie", "Clark", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 8, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 7, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6, 9))))),
                new Student("Anthony", "Maxwell", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(4, 8, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 4, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 10, 10))))),
                new Student("Dorothy", "Quinn", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(10, 10, 10)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(10, 10, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(10, 10, 10))))),
                new Student("Lisa", "Davis", FacultyEnum.ENERGY, GroupEnum.ENERGY_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.PHYSICS, new ArrayList<>(Arrays.asList(5, 9)),
                                SubjectEnum.CHEMISTRY, new ArrayList<>(Arrays.asList(8, 5, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6, 9)))))
        );

        List<Student> listOfEconomicGroup1 = Arrays.asList(
                new Student("Marcia", "Thompson", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(4, 9, 6)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 6, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 6, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 4, 7))))),
                new Student("Douglas", "Rodriguez", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(10, 9, 8)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8, 10, 9))))),
                new Student("Darrell", "Hale", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(4, 9, 7)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(7, 9, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 7)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList())))),
                new Student("John", "Tate", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(4, 9, 4)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 6)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 4, 6))))),
                new Student("Suzanne", "Brown", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_1,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(4, 9, 6)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 10, 4)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 6, 8)))))
        );

        List<Student> listOfEconomicGroup2 = Arrays.asList(
                new Student("Terry", "Jones", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(4, 9, 7)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 7, 10, 5)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 10, 5)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 5, 5))))),
                new Student("Alexander", "Carter", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(8, 9, 7, 9)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(10, 5)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(6, 7, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(8, 6, 7))))),
                new Student("Kenneth", "Holmes", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(5, 9)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 9, 4)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 4)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 4))))),
                new Student("James", "Vargas", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(8, 9, 10, 8)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 9, 10, 8)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 8, 8, 9, 10)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 8, 9, 10))))),
                new Student("Don", "White", FacultyEnum.ECONOMIC, GroupEnum.ECONOMIC_GROUP_2,
                        new HashMap <>(Map.of(
                                SubjectEnum.MACROECONOMICS, new ArrayList<>(Arrays.asList(7, 6, 8, 9)),
                                SubjectEnum.MICROECONOMICS, new ArrayList<>(Arrays.asList(8, 10)),
                                SubjectEnum.MATH, new ArrayList<>(Arrays.asList(8, 9, 8)),
                                SubjectEnum.RUSSIAN, new ArrayList<>(Arrays.asList(7, 8, 8)))))
        );

        Group civilEngineeringGroup1 = new Group(GroupEnum.CIVIL_ENGINEERING_GROUP_1, listOfCivilEngineeringGroup1);
        Group civilEngineeringGroup2 = new Group(GroupEnum.CIVIL_ENGINEERING_GROUP_2, listOfCivilEngineeringGroup2);
        Group ArchitectureGroup1 = new Group(GroupEnum.ARCHITECTURE_GROUP_1, listOfArchitectureGroup1);
        Group ArchitectureGroup2 = new Group(GroupEnum.ARCHITECTURE_GROUP_2, listOfArchitectureGroup2);
        Group InstrumentMakingGroup1 = new Group(GroupEnum.INSTRUMENT_MAKING_GROUP_1, listOfInstrumentMakingGroup1);
        Group InstrumentMakingGroup2 = new Group(GroupEnum.INSTRUMENT_MAKING_GROUP_2, listOfInstrumentMakingGroup2);
        Group EnergyGroup1 = new Group(GroupEnum.ENERGY_GROUP_1, listOfEnergyGroup1);
        Group EnergyGroup2 = new Group(GroupEnum.ENERGY_GROUP_2, listOfEnergyGroup2);
        Group EconomicGroup1 = new Group(GroupEnum.ECONOMIC_GROUP_1, listOfEconomicGroup1);
        Group EconomicGroup2 = new Group(GroupEnum.ECONOMIC_GROUP_2, listOfEconomicGroup2);

        Faculty civilEngineeringFaculty = new Faculty(FacultyEnum.CIVIL_ENGINEERING, new ArrayList<>(Arrays.asList(civilEngineeringGroup1, civilEngineeringGroup2)));
        Faculty ArchitectureFaculty = new Faculty(FacultyEnum.ARCHITECTURE, new ArrayList<>(Arrays.asList(ArchitectureGroup1, ArchitectureGroup2)));
        Faculty InstrumentMakingFaculty = new Faculty(FacultyEnum.INSTRUMENT_MAKING, new ArrayList<>(Arrays.asList(InstrumentMakingGroup1, InstrumentMakingGroup2)));
        Faculty EnergyFaculty = new Faculty(FacultyEnum.ENERGY, new ArrayList<>(Arrays.asList(EnergyGroup1, EnergyGroup2)));
        Faculty EconomicFaculty = new Faculty(FacultyEnum.ECONOMIC, new ArrayList<>(Arrays.asList(EconomicGroup1, EconomicGroup2)));

        University universityBNTU = new University(new ArrayList<>(Arrays.asList(civilEngineeringFaculty, ArchitectureFaculty, InstrumentMakingFaculty, EnergyFaculty, EconomicFaculty)));

        System.out.println("Average grade of the student: " + universityBNTU.getAverageGradeForStudent("Darrell", "Hale"));
        System.out.println("Average grade on the " + SubjectEnum.MATH + " in the group: " +
                universityBNTU.getAverageGradeForSubjectInGroup(SubjectEnum.MATH, GroupEnum.ECONOMIC_GROUP_1, FacultyEnum.ECONOMIC));
        System.out.println("Average grade on the " + SubjectEnum.MATH + " in the university: " +
                universityBNTU.getAverageGradeForSubjectInUniversity(SubjectEnum.MATH));
    }
}
