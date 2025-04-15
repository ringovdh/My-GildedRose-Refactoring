package be.yorian.mother;

import be.yorian.Item;

public class ItemMother {

    public static Item createNormalItem(int sellIn, int quality) {
        return new Item("Basic Item", sellIn, quality);
    }

    public static Item createAgedBrieItem(int sellIn, int quality) {
        return new Item("Aged Brie", sellIn, quality);
    }

    public static Item createSulfurasItem(int sellIn, int quality) {
        return new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    public static Item createBackstagePassesItem(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }
}
