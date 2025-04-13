package be.yorian.handler;

import be.yorian.Item;

public class BackstagePassesHandler extends ItemHandler {

    @Override
    public void updateItem(Item item) {
        if (item.quality < QUALITY_MAX) {
            item.quality = item.quality + 1;
        }
        if (item.sellIn < 11) {
            if (item.quality < QUALITY_MAX) {
                item.quality = item.quality + 1;
            }
        }
        if (item.sellIn < 6) {
            if (item.quality < QUALITY_MAX) {
                item.quality = item.quality + 1;
            }
        }
        if (item.sellIn < 1) {
            item.quality = 0;
        }
        item.sellIn--;
    }
}
