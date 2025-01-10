package com.frankmk3.com.frankmk3.kotlin.variables

import com.frankmk3.com.frankmk3.kotlin.entities.Person
import org.junit.jupiter.api.Test

class VariableTest {

  @Test
  fun `template - should return the amount in a string`() {
    val variables = Variables()
    val amount = 5
    val result = variables.variableTemplate(amount)
    assert(result == "The amount is 5")
  }

  @Test
  fun `template nested - should return the person name and if it is an adult or a minor`() {
    val variables = Variables()
    val person = Person("John", 25)
    val result = variables.variableTemplateNested(person)
    assert(result == "The person is John and is an adult")
  }
}