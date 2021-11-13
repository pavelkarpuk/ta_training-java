import bars.*;
import giftbox.GiftBox;

import java.util.Arrays;
import java.util.List;

public class Main {
    static List<BarBase> bars = Arrays.asList(
            new Bounty("Bounty",83, 48, 487, 3),
            new KitKat("Kit Kat", 42, 47, 521),
            new Mars("Mars", 51, 63, 445),
            new MilkyWay("Milky Way", 26, 60, 453),
            new Nuts("Nuts", 66, 20, 485),
            new Picnic("Picnic", 76, 47, 480),
            new Snickers("Snickers", 50, 52, 483),
            new Twix("Twix", 75, 48, 495, 2)
    );

    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox(bars);
        System.out.println("Total weight of the gift: " + giftBox.getGiftBoxWeight() + " grams");
        System.out.println();

        giftBox.sortByWeight();
        System.out.println("Sorted bars by weight: ");
        for (BarBase bar : bars) {
            System.out.println(bar.getName() + " " + bar.getWeight() + " grams ");
        }
        System.out.println();

        List<BarBase> listWithAMountOfSugarInRange = giftBox.getBarsWithAmountOfSugarInRange(30, 50);
        System.out.println("Bars in a given range of sugar: ");
        for (BarBase bar : listWithAMountOfSugarInRange)
            System.out.println(bar.getName() + " " + bar.getAmountOfSugar() + " grams in 100 grams");
    }
}