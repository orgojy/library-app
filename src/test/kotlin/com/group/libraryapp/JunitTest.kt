package com.group.libraryapp

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    @BeforeEach
    fun beforeEach() {
        println("beforeEach")
    }

    @Test
    fun test1() {
        println("test1")
    }

    @Test
    fun test2() {
        println("test2")
    }
}
