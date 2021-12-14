package sweets;

import types.SweetType;

import java.util.Objects;

public abstract class AbstractSweet {

    private SweetType sweetType;
    private String name;
    private int weight;
    private int amountOfSugar;
    private int amountOfCalories;

    public AbstractSweet(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories) {
        this.sweetType = sweetType;
        this.name = name;
        this.weight = weight;
        this.amountOfSugar = amountOfSugar;
        this.amountOfCalories = amountOfCalories;
    }

    public SweetType getSweetType() {
        return sweetType;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSweet that = (AbstractSweet) o;
        return weight == that.weight && amountOfSugar == that.amountOfSugar && amountOfCalories == that.amountOfCalories && sweetType == that.sweetType && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetType, name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "AbstractSweet{" +
                "sweetType=" + sweetType +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
