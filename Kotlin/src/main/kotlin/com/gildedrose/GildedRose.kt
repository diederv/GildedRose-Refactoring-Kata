package com.gildedrose

import com.gildedrose.item.InventoryManager

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        items.forEach { item -> InventoryManager.updateItem(item) }
    }

}

