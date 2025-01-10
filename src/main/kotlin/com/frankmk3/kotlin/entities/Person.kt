package com.frankmk3.com.frankmk3.kotlin.entities

data class Person(val name: String, val age: Int) {
  fun isAdult(): Boolean {
    return age >= 18
  }
}