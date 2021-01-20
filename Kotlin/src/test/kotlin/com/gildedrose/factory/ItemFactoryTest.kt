package com.gildedrose.factory

import com.gildedrose.config.ItemTypes
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ItemFactoryTest {

    @Test
    fun `the itemfactory returns an item with the expected name when requested an agedBrieItem`() {

        // Arrange and Act
        val item = ItemFactory.createAgedBrieItem(0,0)
        // Assert
        Assertions.assertEquals(ItemTypes.agedBrie, item.name)
    }

    @Test
    fun `the itemfactory returns an item with the expected name when requested a backstagePassItem`() {

        // Arrange and Act
        val item = ItemFactory.createBackstagePassItem(0,0)
        // Assert
        Assertions.assertEquals(ItemTypes.backstagePasses, item.name)
    }

    @Test
    fun `the itemfactory returns an item with the expected name when requested a conjuredItem`() {

        // Arrange and Act
        val item = ItemFactory.createConjuredItem(0,0)
        // Assert
        Assertions.assertEquals(ItemTypes.conjured, item.name)
    }

    @Test
    fun `the itemfactory returns an item with the expected name when requested a sulfurasItem`() {

        // Arrange and Act
        val item = ItemFactory.createSulfurasItem(0,0)
        // Assert
        Assertions.assertEquals(ItemTypes.sulfuras, item.name)
    }

}