package com.gildedrose.config

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ItemTypesTest {

    @Test
    fun `the typed value of agedBrie is as expected`() {

        //Assert
        Assertions.assertEquals("Aged Brie", ItemTypes.agedBrie)
    }

    @Test
    fun `the typed value of backstagePasses is as expected`() {

        //Assert
        Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", ItemTypes.backstagePasses)
    }

    @Test
    fun `the typed value of sulfuras is as expected`() {

        //Assert
        Assertions.assertEquals("Sulfuras, Hand of Ragnaros", ItemTypes.sulfuras)
    }

    @Test
    fun `the typed value of conjured is as expected`() {

        //Assert
        Assertions.assertEquals("Conjured Mana Cake", ItemTypes.conjured)
    }

}