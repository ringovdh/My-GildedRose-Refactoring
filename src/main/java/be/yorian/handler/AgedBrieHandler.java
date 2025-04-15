package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.increaseQuality;
import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class AgedBrieHandler implements ItemHandler {


    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    /**
     * Calculates the new quality of the item.
     * add 1 if sellIn date is not passed,
     * add 2 if sellIn date is passed
     * quality has a max value of 50
     *
     * @param item
     * @return new calculated quality value
     */
    private int calculateQuality(Item item) {
        int qualityGained = isSellInDatePassed(item.sellIn) ? 2 : 1;
        return increaseQuality(item.quality, qualityGained);
    }
}
