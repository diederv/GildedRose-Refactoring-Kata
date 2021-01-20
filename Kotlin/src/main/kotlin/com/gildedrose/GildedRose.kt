package com.gildedrose

import com.gildedrose.item.InventoryManager

class GildedRose(var items: Array<Item>) {

    /*
     * Decreases the sellIn value with 1 and updates the quality according to the specifications of every item
     */
    fun updateQuality() {
        items.forEach { item -> InventoryManager.updateItem(item) }
    }

}

