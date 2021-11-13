package bars;

public class Picnic extends BarBase {

    public Picnic(String name, int weight, int amountOfSugar, int amountOfCalories) {
        super(name, weight, amountOfSugar, amountOfCalories);
    }

    @Override
    public String toString() {
        return "Picnic{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfCalories=" + amountOfCalories +
                '}';
    }
}
