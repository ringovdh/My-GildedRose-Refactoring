import be.yorian.GildedRose;
import be.yorian.Item;
import org.junit.jupiter.api.Test;

import static be.yorian.mother.GildedRoseMother.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void normalItem_decreasesInQuality_test() {
        GildedRose app = createGildedRoseWithNormalItem(5, 10);
        app.updateQuality();
        assertEquals(9, app.getItems()[0].quality);
    }

    @Test
    void normalItem_doNotDecreasesInQuality_whenNegative_test() {
        GildedRose app = createGildedRoseWithNormalItem(5, -1);
        app.updateQuality();
        assertEquals(-1, app.getItems()[0].quality);
        assertEquals(4, app.getItems()[0].sellIn);
    }

    @Test
    void normalItem_decreasesTwiceInQuality_whenSellInIsPassed_test() {
        GildedRose app = createGildedRoseWithNormalItem(0, 10);
        app.updateQuality();
        assertEquals(8, app.getItems()[0].quality);
    }

    @Test
    void normalItem_doNotDecreasesQuality_whenQualityIsPassed_test() {
        GildedRose app = createGildedRoseWithNormalItem(0, 0);
        app.updateQuality();
        assertEquals(0, app.getItems()[0].quality);
        assertEquals(-1, app.getItems()[0].sellIn);
    }

    @Test
    void agedBrie_increasesInQuality_test() {
        GildedRose app = createGildedRoseWithAgedBrie(2, 10);
        app.updateQuality();
        assertEquals(11, app.getItems()[0].quality);
    }

    @Test
    void agedBrie_MaxQualityIs50_test() {
        GildedRose app = createGildedRoseWithAgedBrie(2, 50);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].quality);
    }

    @Test
    void agedBrie_MaxQualityIs50_whenSellInIsPassed_test() {
        GildedRose app = createGildedRoseWithAgedBrie(0, 50);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].quality);
    }

    @Test
    void agedBrie_IncreaseQualityByTwo_whenSellInIsPassed_test() {
        GildedRose app = createGildedRoseWithAgedBrie(-1, 10);
        app.updateQuality();
        assertEquals(12, app.getItems()[0].quality);
        assertEquals(-2, app.getItems()[0].sellIn);
    }

    @Test
    void agedBrie_decreasesSellIn_test() {
        GildedRose app = createGildedRoseWithAgedBrie(2, 10);
        app.updateQuality();
        assertEquals(1, app.getItems()[0].sellIn);
    }

    @Test
    void sulfuras_qualityNeverChanges_test() {
        GildedRose app = createGildedRoseWithSulfuras(2, 80);
        app.updateQuality();
        assertEquals(80, app.getItems()[0].quality);
        assertEquals(2, app.getItems()[0].sellIn);
    }

    @Test
    void sulfuras_qualityNeverChanges_whenSellInIsPassed_test() {
        GildedRose app = createGildedRoseWithSulfuras(-1, 80);
        app.updateQuality();
        assertEquals(80, app.getItems()[0].quality);
        assertEquals(-1, app.getItems()[0].sellIn);
    }

    @Test
    void backstagePasses_decreasesSellIn_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(2, 10);
        app.updateQuality();
        assertEquals(1, app.getItems()[0].sellIn);
    }

    @Test
    void backstagePasses_increasesQualityBy2_whenSellInBetween10And5_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(8, 6);
        app.updateQuality();
        assertEquals(8, app.getItems()[0].quality);
        assertEquals(7, app.getItems()[0].sellIn);
    }

    @Test
    void backstagePasses_increasesQualityBy3_whenSellInLowerThan5_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(4, 6);
        app.updateQuality();
        assertEquals(9, app.getItems()[0].quality);
        assertEquals(3, app.getItems()[0].sellIn);
    }

    @Test
    void backstagePasses_increasesQualityBy1_whenSellInHigherThan10_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(11, 6);
        app.updateQuality();
        assertEquals(7, app.getItems()[0].quality);
        assertEquals(10, app.getItems()[0].sellIn);
    }

    @Test
    void backstagePasses_maxQualityIs50_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(4, 49);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].quality);
    }

    @Test
    void backstagePasses_qualityIs0AfterConcert_test() {
        GildedRose app = createGildedRoseWithBackstagePasses(0, 10);
        app.updateQuality();
        assertEquals(0, app.getItems()[0].quality);
    }
}
