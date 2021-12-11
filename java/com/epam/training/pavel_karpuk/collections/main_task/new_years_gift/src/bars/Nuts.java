package bars;

public class Nuts extends BarBase {

    public Nuts(String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "Nuts{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
