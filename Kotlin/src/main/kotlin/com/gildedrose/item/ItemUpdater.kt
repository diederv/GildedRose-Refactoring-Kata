package com.gildedrose.item

import com.gildedrose.Item

interface ItemUpdater {

    /*
     * @param The Item that needs an update for sellIn and quality
     */
    fun update(item: Item)

}