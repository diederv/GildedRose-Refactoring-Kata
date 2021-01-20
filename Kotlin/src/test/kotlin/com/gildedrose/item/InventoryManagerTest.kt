package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemTypes
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InventoryManagerTest {

    @Test
    fun `the mapping of the inventoryManager with typed name agedBrie to type works as expected`() {

        // Arrange and Act
        val inventoryManager = InventoryManager.getInventoryManager(
                Item(ItemTypes.agedBrie, 0, 0)
        )

        // Assert
        Assertions.assertTrue(inventoryManager is AgedBrieInventoryManager)
    }

    @Test
    fun `the mapping of the inventoryManager with typed name backstagePasses to type works as expected`() {

        // Arrange and Act
        val inventoryManager = InventoryManager.getInventoryManager(
                Item(ItemTypes.backstagePasses, 0, 0)
        )

        // Assert
        Assertions.assertTrue(inventoryManager is BackstagePassInventoryManager)
    }

    @Test
    fun `the mapping of the inventoryManager with typed name conjured to type works as expected`() {

        // Arrange and Act
        val inventoryManager = InventoryManager.getInventoryManager(
                Item(ItemTypes.conjured, 0, 0)
        )

        // Assert
        Assertions.assertTrue(inventoryManager is ConjuredItemInventoryManager)
    }

    @Test
    fun `the mapping of the inventoryManager with typed name sulfuras to type works as expected`() {

        // Arrange and Act
        val inventoryManager = InventoryManager.getInventoryManager(
                Item(ItemTypes.sulfuras, 0, 0)
        )

        // Assert
        Assertions.assertTrue(inventoryManager is LegendaryItemInventoryManager)
    }

    @Test
    fun `the mapping of the inventoryManager with any other name to type works as expected`() {

        // Arrange and Act
        val inventoryManager = InventoryManager.getInventoryManager(
                Item("any name", 0, 0)
        )

        // Assert
        Assertions.assertTrue(inventoryManager is DeterioratingItemInventoryManager)
    }
}