package be.yorian.handler;

import be.yorian.Item;

import static be.yorian.util.GildedRoseUtils.increaseQuality;

public class BackstagePassesHandler implements ItemHandler {

    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        item.quality = calculateQuality(item);
    }

    /**
     * Calculates the new quality of the item.
     * add 1 if sellIn is greater than 10,
     * add 2 if sellIn is between 5 and 10,
     * add 3 if sellIn is between 0 and 5
     * quality is 0 if sellIn is 0
     * quality has a max value of 50
     *
     * @param item
     * @return new calculated quality value
     */
    private int calculateQuality(Item item) {
        int qualityGained;
        if (item.sellIn > 10) {
            qualityGained = 1;
        } else if (item.sellIn > 5) {
            qualityGained = 2;
        } else if (item.sellIn > 0) {
            qualityGained = 3;
        } else {
            return 0;
        }
        return increaseQuality(item.quality, qualityGained);
    }


}
