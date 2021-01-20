package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemConfig

/*
 * The InventoryManager that updates the sellIn and quality for BackstagePasses
 */
class BackstagePassInventoryManager : BaseInventoryManager() {

    override fun updateItemQuality(item: Item) {
        item.updateQuality()
    }

    private fun Item.updateQuality() {
        when {
            sellIn < 0 -> quality = 0
            sellIn <= 5 -> quality += 3
            sellIn <= 10 -> quality += 2
            else -> quality += 1
        }
        quality = quality.coerceIn(ItemConfig.QUALITY_RANGE)
    }
}