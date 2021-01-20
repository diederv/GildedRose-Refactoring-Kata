package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemConfig

/*
 * The InventoryManager that updates the sellIn and quality for AgedBrie
 */
class AgedBrieBaseInventoryManager : BaseInventoryManager() {

    override fun updateItemQuality(item: Item) {
        item.updateQuality()
    }

    private fun Item.updateQuality() {
        quality = quality.inc().coerceIn(ItemConfig.QUALITY_RANGE)
    }
}