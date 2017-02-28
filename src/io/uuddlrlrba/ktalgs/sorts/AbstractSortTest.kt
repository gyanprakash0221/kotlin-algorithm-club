package io.uuddlrlrba.ktalgs.sorts

import org.junit.Assert
import org.junit.Test

abstract class AbstractSortTest<out T: AbstractSortStrategy>(val strategy: T) {
    @Test
    fun emptyTest() {
        val arr = arrayOf<Int>()
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf<Int>(), arr)
    }

    @Test
    fun singletonTest() {
        val arr = arrayOf(1)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(1), arr)
    }

    @Test
    fun naiveTest() {
        val arr = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }
}
