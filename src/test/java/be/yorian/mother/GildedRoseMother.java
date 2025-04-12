package be.yorian.mother;

import be.yorian.GildedRose;
import be.yorian.Item;

public class GildedRoseMother {

    public static GildedRose createGildedRoseWithNormalItem(int sellIn, int quality) {
        Item[] items = new Item[]{ new Item("Basic Item", sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithAgedBrie(int sellIn, int quality) {
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithSulfuras(int sellIn, int quality) {
        Item[] items = new Item[]{ new Item("Sulfuras, Hand of Ragnaros", sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithBackstagePasses(int sellIn, int quality) {
        Item[] items = new Item[]{ new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        return new GildedRose(items);
    }
}
