package com.gildedrose.item

import com.gildedrose.Item

/*
 * The abstract InventoryManager that updates the sellIn value of every item
 */
abstract class BaseInventoryManager : ItemUpdater {

    final override fun update(item: Item) {
        item.sellIn -= 1
        updateItemQuality(item)
    }

    /*
     * @param the item that needs an update of its quality
     */
    abstract fun updateItemQuality(item: Item)

}