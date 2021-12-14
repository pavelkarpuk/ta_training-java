package sweets;

import types.IngredientType;
import types.NutType;
import types.SweetType;

import java.util.Objects;

public class ChocolateBar extends AbstractSweet {

    private IngredientType ingredientType;
    private NutType nutType;
    private int numberOfBarsInOnePack;

    public ChocolateBar(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories,
                        IngredientType ingredientType, NutType nutType, int numberOfBarsInOnePack) {
        super(sweetType, name, weight, amountOfSugar, amountOfCalories);
        this.ingredientType = ingredientType;
        this.nutType = nutType;
        this.numberOfBarsInOnePack = numberOfBarsInOnePack;
    }

    public ChocolateBar(SweetType sweetType, String name, int weight, int amountOfSugar, int amountOfCalories,
                        IngredientType ingredientType, int numberOfBarsInOnePack) {
        super(sweetType, name, weight, amountOfSugar, amountOfCalories);
        this.ingredientType = ingredientType;
        this.numberOfBarsInOnePack = numberOfBarsInOnePack;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public NutType getNutType() {
        return nutType;
    }

    public int getNumberOfBarsInOnePack() {
        return numberOfBarsInOnePack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChocolateBar that = (ChocolateBar) o;
        return numberOfBarsInOnePack == that.numberOfBarsInOnePack && ingredientType == that.ingredientType && nutType == that.nutType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ingredientType, nutType, numberOfBarsInOnePack);
    }

    @Override
    public String toString() {
        return "ChocolateBar{" +
                "ingredientType=" + ingredientType +
                ", nutType=" + nutType +
                ", numberOfBarsInOnePack=" + numberOfBarsInOnePack +
                '}';
    }
}
