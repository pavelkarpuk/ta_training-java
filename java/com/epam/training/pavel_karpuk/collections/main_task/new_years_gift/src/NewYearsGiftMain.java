import sweets.*;
import giftbox.GiftBox;
import types.IngredientType;
import types.LollipopTasteType;
import types.NutType;
import types.SweetType;

import java.util.Arrays;
import java.util.List;

public class NewYearsGiftMain {
    static List<AbstractSweet> sweets = Arrays.asList(
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Snickers",50, 52, 483, IngredientType.NUT, NutType.ALMOND, 1),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Snickers",83, 52, 483, IngredientType.NUT, NutType.HAZELNUT, 2),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Snickers",50, 52, 483, IngredientType.NUT, NutType.PEANUT, 1),
            new ChocolateBar(SweetType.CHOCOLATE_BAR,"Kit Kat", 42, 47, 521, IngredientType.WAFFLE, 1),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Mars", 51, 63, 445, IngredientType.NOUGAT, 1),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Milky Way", 26, 60, 453, IngredientType.NOUGAT, 1),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Bounty", 83, 48, 487, IngredientType.COCONUT, 3),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Bounty", 55, 48, 487, IngredientType.COCONUT, 2),
            new ChocolateBar(SweetType.CHOCOLATE_BAR, "Twix", 75, 48, 495, IngredientType.COOKIE, 2),
            new Chocolate(SweetType.CHOCOLATE, "Alpen Gold", 85, 48, 527),
            new Chocolate(SweetType.CHOCOLATE, "Alpen Gold", 85, 42, 525, NutType.HAZELNUT),
            new Chocolate(SweetType.CHOCOLATE, "Nestle", 82, 52, 539),
            new Chocolate(SweetType.CHOCOLATE, "Nestle", 80, 48, 541, NutType.HAZELNUT),
            new Lollipop(SweetType.LOLLIPOP, "Roshen", 5, 63, 394, LollipopTasteType.BARBERRY),
            new Lollipop(SweetType.LOLLIPOP, "Roshen", 6, 72, 435, LollipopTasteType.APPLE),
            new Lollipop(SweetType.LOLLIPOP, "Roshen", 7, 76, 446, LollipopTasteType.CHERRY),
            new Lollipop(SweetType.LOLLIPOP, "Roshen", 5, 63, 394, LollipopTasteType.LEMON),
            new Lollipop(SweetType.LOLLIPOP, "Roshen", 6, 72, 415, LollipopTasteType.ORANGE)
    );

    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox(sweets);
        System.out.println("Total weight of the gift: " + giftBox.getGiftBoxWeight() + " grams");
        System.out.println();

        giftBox.sortByWeight();
        System.out.println("Sorted sweets by weight: ");
        for (AbstractSweet sweet : sweets) {
            System.out.println(sweet.getName() + " " + sweet.getWeight() + " grams ");
        }
        System.out.println();

        List<AbstractSweet> listWithAMountOfSugarInRange = giftBox.getSweetsWithAmountOfSugarInRange(30, 50);
        System.out.println("Sweets in a given range of sugar: ");
        for (AbstractSweet sweet : listWithAMountOfSugarInRange)
            System.out.println(sweet.getName() + " " + sweet.getAmountOfSugar() + " grams in 100 grams");
    }
}