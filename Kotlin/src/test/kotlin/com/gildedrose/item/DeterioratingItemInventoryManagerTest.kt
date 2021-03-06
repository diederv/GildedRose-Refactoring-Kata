package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemConfig
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DeterioratingItemInventoryManagerTest {

    @Test
    fun `when the updated and decreased sellIn is less than zero then the quality is decreased by two within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 0
        val item = Item("normal item", sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(quality -2, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is less than zero then the quality is decreased by two within the range (2)`() {

        // Arrange
        val quality = 0
        val sellIn = 0
        val item = Item("normal item", sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.start, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is zero or more then the quality is decreased by one within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 1
        val item = Item("normal item", sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(quality -1, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is zero or more then the quality is decreased by one within the range (2)`() {

        // Arrange
        val quality = 0
        val sellIn = 1
        val item = Item("normal item", sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.start, item.quality)
    }

}