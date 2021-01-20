package com.gildedrose.factory

import com.gildedrose.Item
import com.gildedrose.config.ItemTypes

class ItemFactory {

    companion object {

        /*
        * @param sellIn the number of day before the advised selling day
        * @param quality the quality of the product
        * @returns the Item with the reserved name for Aged Brie
        */
        fun createAgedBrieItem(sellIn: Int, quality: Int): Item {
            return Item(ItemTypes.agedBrie, sellIn, quality)
        }

        /*
        * @param sellIn the number of day before the concert day
        * @param quality the quality of the product
        * @returns the Item with the reserved name for a Backstage Pass
        */
        fun createBackstagePassItem(sellIn: Int, quality: Int): Item {
            return Item(ItemTypes.backstagePasses, sellIn, quality)
        }

        /*
        * @param sellIn the number of day before the advised selling day, which for Sulfuras is meaningless
        * @param quality the quality of the product
        * @returns the Item with the reserved name for Sulfuras
        */
        fun createSulfurasItem(sellIn: Int, quality: Int): Item {
            return Item(ItemTypes.sulfuras, sellIn, quality)
        }

        /*
        * @param sellIn the number of day before the advised selling day
        * @param quality the quality of the product
        * @returns the Item with the reserved name for Conjured Mana Cake
        */
        fun createConjuredItem(sellIn: Int, quality: Int): Item {
            return Item(ItemTypes.conjured, sellIn, quality)
        }
    }
}