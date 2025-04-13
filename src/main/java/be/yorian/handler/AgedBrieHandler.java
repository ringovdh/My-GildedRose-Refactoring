package be.yorian.handler;

import be.yorian.Item;

public class AgedBrieHandler extends ItemHandler {


    @Override
    public void updateItem(Item item) {
        if (item.quality < QUALITY_MAX) {
            if (item.sellIn < 0) {
                item.quality += 2;
            } else {
                item.quality += 1;
            }
        }
        item.sellIn--;
    }
}
