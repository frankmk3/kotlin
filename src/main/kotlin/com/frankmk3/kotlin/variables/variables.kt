package com.frankmk3.com.frankmk3.kotlin.variables

import com.frankmk3.com.frankmk3.kotlin.entities.Person

class Variables {
  fun regular() {
    //      val can be assigned only once
    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    //      if we try to reassign a val, we will get an error
    //      popcorn = 3       // Error: Val cannot be reassigned
    //var can be reassigned
    var customers = 10 // There are 10 customers in the queue

    // Some customers leave the queue
    customers = 8
  }

  fun variableTemplate(amount: Int): String {
    return "The amount is $amount"
  }

  fun variableTemplateNested(person: Person): String {
    return "The person is ${person.name} and is ${if (person.isAdult()) "an adult" else "a minor"}"
  }
}

