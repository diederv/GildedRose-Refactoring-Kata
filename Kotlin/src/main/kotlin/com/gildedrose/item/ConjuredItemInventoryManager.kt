package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemConfig

/*
 * The InventoryManager that updates the sellIn and quality for ConjuredItems
 */
class ConjuredItemInventoryManager : DeterioratingItemInventoryManager() {

    override fun Item.updateQuality() {
        when {
            sellIn < 0 -> quality -= 4
            quality in ItemConfig.QUALITY_RANGE -> quality -= 2
        }
        quality = quality.coerceIn(ItemConfig.QUALITY_RANGE)
    }
}