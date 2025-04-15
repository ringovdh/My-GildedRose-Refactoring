package be.yorian.util;

public class GildedRoseUtils {

    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    public static final int PASSED_SELLIN = 0;

    public static boolean isSellInDatePassed(int sellIn) {
        return sellIn < PASSED_SELLIN;
    }

    public static int decreaseQuality(int quality, int decreaseValue) {
        return Math.max(quality - decreaseValue, MIN_QUALITY);
    }

    public static int increaseQuality(int quality, int increaseValue) {
        return Math.min(quality + increaseValue, MAX_QUALITY);
    }

}