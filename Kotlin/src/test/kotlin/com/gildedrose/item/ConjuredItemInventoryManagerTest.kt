package com.gildedrose.item

import com.gildedrose.config.ItemConfig
import com.gildedrose.factory.ItemFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConjuredItemInventoryManagerTest {

    @Test
    fun `when the updated and decreased sellIn is less than zero then the quality is decreased by four within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 0
        val item = ItemFactory.createConjuredItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(quality -4, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is less than zero then the quality is decreased by four within the range (2)`() {

        // Arrange
        val quality = 0
        val sellIn = 0
        val item = ItemFactory.createConjuredItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.start, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is zero or more then the quality is decreased by two within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 1
        val item = ItemFactory.createConjuredItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(quality -2, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is zero or more then the quality is decreased by two within the range (2)`() {

        // Arrange
        val quality = 0
        val sellIn = 1
        val item = ItemFactory.createConjuredItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.start, item.quality)
    }

}