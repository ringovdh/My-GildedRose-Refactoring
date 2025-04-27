package be.yorian.util;

public class GildedRoseUtils {

    public static final int PASSED_SELLIN = 0;

    public static boolean isSellInDatePassed(int sellIn) {
        return sellIn < PASSED_SELLIN;
    }

}