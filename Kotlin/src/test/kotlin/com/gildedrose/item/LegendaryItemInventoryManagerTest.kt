package com.gildedrose.item

import com.gildedrose.config.ItemConfig
import com.gildedrose.factory.ItemFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LegendaryItemInventoryManagerTest {

    @Test
    fun `when the sellIn is updated with any value then the quality remains the same`() {

        // Arrange
        val days = 20
        val item = ItemFactory.createSulfurasItem(10)
        val quality = item.quality

        // Assert
        Assertions.assertEquals(ItemConfig.SULFURAS_QUALITY, quality)

        repeat(days) {
            // Act
            InventoryManager.updateItem(item)
            // Assert
            Assertions.assertEquals(ItemConfig.SULFURAS_QUALITY, item.quality)
        }
    }
}