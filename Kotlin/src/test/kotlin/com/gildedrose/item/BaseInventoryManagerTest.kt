package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.factory.ItemFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BaseInventoryManagerTest {

    @Test
    fun `update after any number of days should decrease sellIn by number of days`() {

        // Arrange
        val initialSellIn = 99
        val item = Item("Any Item", initialSellIn, 10)
        val inventoryManager = object: BaseInventoryManager() {
            override fun updateItemQuality(item: Item) {
                // No Implementation required
            }
        }
        val days = 66

        // Act
        repeat(days) {
            inventoryManager.update(item)
        }

        // Assert
        Assertions.assertEquals(initialSellIn - days, item.sellIn )
    }

}