package com.gildedrose.item

import com.gildedrose.config.ItemConfig
import com.gildedrose.factory.ItemFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AgedBrieInventoryManagerTest {

    @Test
    fun `update after any number of days should increase quality with that same number if within the QUALITY_RANGE`() {

        // Arrange
        val initialQuality =  10
        val item = ItemFactory.createAgedBrieItem(99, initialQuality)
        val days = 12

        // Act
        repeat(days) {
            InventoryManager.updateItem(item)
        }

        // Assert
        val expectedQuality = initialQuality + days
        Assertions.assertTrue(expectedQuality in ItemConfig.QUALITY_RANGE)
        Assertions.assertEquals(expectedQuality, item.quality)
    }

    @Test
    fun `update after any number of days should increase quality with that same number limited by MAX of the QUALITY_RANGE`() {

        // Arrange
        val initialQuality =  40
        val item = ItemFactory.createAgedBrieItem(99, initialQuality)
        val days = 12

        // Act
        repeat(days) {
            InventoryManager.updateItem(item)
        }

        // Assert
        val expectedUnlimitedQuality = initialQuality + days

        Assertions.assertTrue(expectedUnlimitedQuality !in ItemConfig.QUALITY_RANGE)
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.last, item.quality)
    }
}
