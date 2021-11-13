package bars;

import java.util.Objects;

public class Bounty extends BarBase {

    private int numberOfBarsInOnePack;

    public Bounty(String name, int weight, int amountOfSugar, int amountOfCalories, int numberOfBarsInOnePack) {
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
        Bounty bounty = (Bounty) o;
        return numberOfBarsInOnePack == bounty.numberOfBarsInOnePack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfBarsInOnePack);
    }

    @Override
    public String toString() {
        return "Bounty{" +
                "numberOfBarsInOnePack=" + numberOfBarsInOnePack +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
