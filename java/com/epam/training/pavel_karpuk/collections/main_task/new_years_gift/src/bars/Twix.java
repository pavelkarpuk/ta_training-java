package bars;

import java.util.Objects;

public class Twix extends BarBase {

    private int numberOfBarsInOnePack;

    public Twix(String name, int weight, int amountOfSugar, int amountOfCalories, int numberOfBarsInOnePack) {
        super(name, weight, amountOfSugar, amountOfCalories);
        this.numberOfBarsInOnePack = numberOfBarsInOnePack;
    }

    public int getNumberOfBarsInOnePack() {
        return numberOfBarsInOnePack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Twix twix = (Twix) o;
        return numberOfBarsInOnePack == twix.numberOfBarsInOnePack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfBarsInOnePack);
    }

    @Override
    public String toString() {
        return "Twix{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                ", numberOfBarsInOnePack=" + numberOfBarsInOnePack +
                '}';
    }
}
