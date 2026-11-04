package main

import functions.fibonacci
import functions.gcd
import functions.processSum

// Student number: 21025177
// Student number: 24181003
// Student number: 24181012

/**
 * Prompts the user to select a function to run.
 *
 * Prints the menu, and asks for the user's input.
 * It expects a number between 1 and 4.
 * - Option 1 : Calls the Sum function.
 * - Option 2 : Calls the GCD function.
 * - Option 3 : Calls the Fibonacci function.
 * - Option 4 : Exits the program.
 */
fun selectFunction(): Int {
    print("Please select a function (1:Sum, 2:GCD, 3:Fibonacci, 4:Exit) : ")
    var n = readln()

    // If the item is invalid, keep asking.
    while(n.isBlank() || n.toIntOrNull() == null || n.toInt() !in 1..4) {
        print("Please select a function (1:Sum, 2:GCD, 3:Fibonacci, 4:Exit) : ")
        n = readln()
    }

    return n.toInt()
}

fun main() {
    // Ask the user to provide a number (make a selection from the menu),

    var selection = selectFunction()

    while (selection != 4) {
        when(selection) {
            1 -> processSum()
            2 -> gcd()
            3 -> fibonacci()
        }
        selection = selectFunction()
    }
}