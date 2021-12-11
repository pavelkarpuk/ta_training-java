package bars;

public class Mars extends BarBase {

    public Mars(String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "Mars{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
