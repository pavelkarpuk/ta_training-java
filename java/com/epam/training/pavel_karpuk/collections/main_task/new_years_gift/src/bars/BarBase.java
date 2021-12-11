package bars;

import java.util.Objects;

public abstract class BarBase {

    String name;
    int weight;
    int amountOfSugar;
    int amountOfCalories;

    public BarBase(String name, int weight, int amountOfSugar, int amountOfCalories) {
        this.name = name;
        this.weight = weight;
        this.amountOfSugar = amountOfSugar;
        this.amountOfCalories = amountOfCalories;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    @Override
    public String toString() {
        return "BarBase{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BarBase barBase = (BarBase) o;
        return weight == barBase.weight &&
                amountOfSugar == barBase.amountOfSugar &&
                amountOfCalories == barBase.amountOfCalories &&
                name.equals(barBase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, amountOfSugar, amountOfCalories);
    }
}