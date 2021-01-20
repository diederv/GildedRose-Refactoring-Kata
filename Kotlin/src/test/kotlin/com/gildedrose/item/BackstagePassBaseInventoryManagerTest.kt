package com.gildedrose.item

import com.gildedrose.config.ItemConfig
import com.gildedrose.factory.ItemFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BackstagePassBaseInventoryManagerTest {

    @Test
    fun `when the updated and decreased sellIn is less than zero then the quality is set to zero`() {

        // Arrange
        val quality = 10
        val sellIn = -10
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(0, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is between zero and five then the quality is increased with 3 within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 1
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertTrue(sellIn.dec() in 0..5)
        Assertions.assertEquals(quality +3, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is between zero and five then the quality is increased with 3 within the range (2)`() {

        // Arrange
        val quality = 10
        val sellIn = 6
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertTrue(sellIn.dec() in 0..5)
        Assertions.assertEquals(quality +3, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is between five and ten then the quality is increased with 2 within the range (1)`() {

        // Arrange
        val quality = 10
        val sellIn = 7
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertTrue(sellIn.dec() in 5..10)
        Assertions.assertEquals(quality +2, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is between five and ten then the quality is increased with 2 within the range (2)`() {

        // Arrange
        val quality = 10
        val sellIn = 11
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertTrue(sellIn.dec() in 5..10)
        Assertions.assertEquals(quality +2, item.quality)
    }

    @Test
    fun `when the updated and decreased sellIn is higher than 10 then the quality is increased with 1 within the range`() {

        // Arrange
        val quality = 10
        val sellIn = 12
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertTrue(sellIn > 10)
        Assertions.assertEquals(quality +1, item.quality)
    }

    @Test
    fun `when the value of quality is about to be increased with any number above the range then its value will be set to the max value of that range`() {

        // Arrange
        val quality = ItemConfig.QUALITY_RANGE.last
        val sellIn = 1
        val item = ItemFactory.createBackstagePassItem(sellIn, quality)

        // Act
        InventoryManager.updateItem(item)

        // Assert
        Assertions.assertEquals(ItemConfig.QUALITY_RANGE.last, item.quality)
    }
}