package be.yorian.arguments;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static be.yorian.mother.ItemMother.createAgedBrieItem;
import static be.yorian.mother.ItemMother.createBackstagePassesItem;
import static be.yorian.mother.ItemMother.createConjuredItem;
import static be.yorian.mother.ItemMother.createNormalItem;
import static be.yorian.mother.ItemMother.createSulfurasItem;

public class GildedRoseItemArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(createConjuredItem(10, 5), createConjuredItem(4, 2), "ConjuredItemHandler"),
                Arguments.of(createBackstagePassesItem(10, 5), createBackstagePassesItem(8, 7), "BackstagePassesHandler"),
                Arguments.of(createNormalItem(10, 5), createNormalItem(4, 2), "NomralItemHandler"),
                Arguments.of(createAgedBrieItem(8, 2), createAgedBrieItem(10, 1), "AgedBrieHandler"),
                Arguments.of(createSulfurasItem(10, 80), createSulfurasItem(4, 80), "SulfurasHandler")

                );
    }

}
