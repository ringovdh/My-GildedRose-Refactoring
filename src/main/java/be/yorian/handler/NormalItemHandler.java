package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.decreaseQualityUntilMinimum;
import static be.yorian.util.GildedRoseUtils.isSellInDatePassed;

public class NormalItemHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    /**
     * Calculates the new quality of the item.
     * lost 1 if sellIn date is not passed,
     * lost 2 if sellIn date is passed
     * quality has a min value of 0
     *
     * @param item a normalItem
     * @return new calculated quality value
     */
    private int calculateQuality(Item item) {
        int qualityLost = isSellInDatePassed(item.sellIn) ? 2 : 1;
        return decreaseQualityUntilMinimum(item.quality, qualityLost);
    }
}