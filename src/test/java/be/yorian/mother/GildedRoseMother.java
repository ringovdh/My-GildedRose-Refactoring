package be.yorian.mother;

import be.yorian.GildedRose;
import be.yorian.Item;

import static be.yorian.mother.ItemMother.createAgedBrieItem;
import static be.yorian.mother.ItemMother.createBackstagePassesItem;
import static be.yorian.mother.ItemMother.createNormalItem;
import static be.yorian.mother.ItemMother.createSulfurasItem;

public class GildedRoseMother {

    public static GildedRose createGildedRoseWithNormalItem(int sellIn, int quality) {
        Item[] items = new Item[]{ createNormalItem(sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithAgedBrie(int sellIn, int quality) {
        Item[] items = new Item[] { createAgedBrieItem(sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithSulfuras(int sellIn, int quality) {
        Item[] items = new Item[]{ createSulfurasItem(sellIn, quality) };
        return new GildedRose(items);
    }

    public static GildedRose createGildedRoseWithBackstagePasses(int sellIn, int quality) {
        Item[] items = new Item[]{ createBackstagePassesItem(sellIn, quality) };
        return new GildedRose(items);
    }
}
