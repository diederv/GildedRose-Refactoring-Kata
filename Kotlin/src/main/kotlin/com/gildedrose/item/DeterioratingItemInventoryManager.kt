package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemConfig

/*
 * The InventoryManager that updates the sellIn and quality for DeterioratingItems
 */
open class DeterioratingItemInventoryManager : BaseInventoryManager() {

    override fun updateItemQuality(item: Item) {
        item.updateQuality()
    }

    open fun Item.updateQuality() {
        when {
            sellIn < 0 -> quality -= 2
            quality in ItemConfig.QUALITY_RANGE -> quality -= 1
        }
        quality = quality.coerceIn(ItemConfig.QUALITY_RANGE)
    }
}