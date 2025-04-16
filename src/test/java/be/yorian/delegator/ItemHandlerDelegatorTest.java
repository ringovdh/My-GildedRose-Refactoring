package be.yorian.delegator;

import be.yorian.Item;
import be.yorian.arguments.GildedRoseItemArgumentsProvider;
import be.yorian.handler.AgedBrieHandler;
import be.yorian.handler.BackstagePassesHandler;
import be.yorian.handler.ConjuredItemHandler;
import be.yorian.handler.NormalItemHandler;
import be.yorian.handler.SulfurasHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static be.yorian.mother.ItemMother.createAgedBrieItem;
import static be.yorian.mother.ItemMother.createBackstagePassesItem;
import static be.yorian.mother.ItemMother.createConjuredItem;
import static be.yorian.mother.ItemMother.createNormalItem;
import static be.yorian.mother.ItemMother.createSulfurasItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ItemHandlerDelegatorTest {

    private ItemHandlerDelegator delegator;

    @BeforeEach
    void setup() {
        this.delegator = new ItemHandlerDelegator();
    }

    @Test
    void getHandlerForNormalItem_test() {
        assertInstanceOf(NormalItemHandler.class,
                delegator.getHandler(createNormalItem(10, 10)));
    }

    @Test
    void getHandlerForAgedBrieItem_test() {
        assertInstanceOf(AgedBrieHandler.class,
                delegator.getHandler(createAgedBrieItem(10, 5)));
    }

    @Test
    void getHandlerForSulfurasItem_test() {
        assertInstanceOf(SulfurasHandler.class,
                delegator.getHandler(createSulfurasItem(10, 80)));
    }

    @Test
    void getHandlerForBackstagePassesItem_test() {
        assertInstanceOf(BackstagePassesHandler.class,
                delegator.getHandler(createBackstagePassesItem(10, 5)));
    }

    @Test
    void getHandlerForConjuredItem_test() {
        assertInstanceOf(ConjuredItemHandler.class,
                delegator.getHandler(createConjuredItem(10, 5)));
    }

    @ParameterizedTest(name = "compare handlers test {index} => {2}")
    @ArgumentsSource(GildedRoseItemArgumentsProvider.class)
    void getHandlerForConjuredItem_returnsSameInstance_test(Item item1, Item item2, String title) {
        assertEquals(delegator.getHandler(item1), delegator.getHandler(item2));
    }

}