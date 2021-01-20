package com.gildedrose.item

import com.gildedrose.Item
import com.gildedrose.config.ItemTypes

/*
 * The InventoryManager that delegates each task to the appropriate specialised instance
 */
class InventoryManager : BaseInventoryManager() {

    companion object {

        private val backstagePassInventoryManager = BackstagePassInventoryManager()
        private val agedBrieInventoryManager = AgedBrieInventoryManager()
        private val conjuredItemInventoryManager = ConjuredItemInventoryManager()
        private val deterioratingItemInventoryManager = DeterioratingItemInventoryManager()
        private val timelessItemInventoryManager = LegendaryItemInventoryManager()

        val instance = InventoryManager()

        internal fun getInventoryManager(item: Item): BaseInventoryManager {
            return when (item.name) {
                ItemTypes.backstagePasses -> backstagePassInventoryManager
                ItemTypes.agedBrie -> agedBrieInventoryManager
                ItemTypes.conjured -> conjuredItemInventoryManager
                ItemTypes.sulfuras -> timelessItemInventoryManager
                else -> deterioratingItemInventoryManager
            }
        }

        internal fun updateItem(item: Item) {
            instance.update(item)
        }
    }

    override fun updateItemQuality(item: Item) {
        getInventoryManager(item).updateItemQuality(item)
    }
}