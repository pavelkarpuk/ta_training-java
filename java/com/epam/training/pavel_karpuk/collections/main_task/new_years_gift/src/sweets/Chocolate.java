package sweets;

import types.NutType;
import types.SweetType;

import java.util.Objects;

public class Chocolate extends AbstractSweet{

    private NutType nutType;

    public Chocolate(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(sweetType, name, weight, amountOfSugar, amountOfCalories);
    }

    public Chocolate(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories, NutType nutType) {
        super(sweetType, name, weight, amountOfSugar, amountOfCalories);
        this.nutType = nutType;
    }

    public NutType getNutType() {
        return nutType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chocolate that = (Chocolate) o;
        return nutType == that.nutType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nutType);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "nutType=" + nutType +
                '}';
    }
}
