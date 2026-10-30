package main

import functions.fibonacci
import functions.gcd

fun selectFunction(): Int {
    print("Please select a function (1:Sum, 2:GCD, 3:Fibonacci, 4:Exit) : ")
    var n = readln().toInt()

    // If the item is invalid, keep asking.
    while(n !in 1..4) {
        print("Please select a function (1:Sum, 2:GCD, 3:Fibonacci, 4:Exit) : ")
        n = readln().toInt()
    }

    return n
}

fun main() {
    // Ask the user to provide a number (make a selection from the menu),

    var selection = selectFunction()

    while (selection !== 4) {
        when(selection) {
            //  1 -> sum()
            //  2 -> gcd()
            3 -> fibonacci()
        }
        selection = selectFunction()
    }
}