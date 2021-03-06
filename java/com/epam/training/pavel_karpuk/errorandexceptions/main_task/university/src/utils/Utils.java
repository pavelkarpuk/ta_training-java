package utils;

import java.util.Collection;
import java.util.List;

public class Utils {
    public static double calculateAverageGrade(Collection<List<Integer>> CollectionOfAllGrades) {
        int sumOfGrades = 0;
        int numberOfGrades = 0;
        double averageGrade;
        for (List<Integer> listOfGrades : CollectionOfAllGrades) {
            for (Integer grade : listOfGrades) {
                numberOfGrades++;
                sumOfGrades += grade;
            }
        }
        averageGrade = Math.round(((double) sumOfGrades / numberOfGrades) * 10.0) / 10.0;
        return averageGrade;
    }
}
