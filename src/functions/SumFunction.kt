package functions

// Student number: 21025177

/**
 * Calculates the 1 + ½ + ⅓ + ⋯ + 1⁄n sum for a given natural number n.
 *
 * @param n [Int] - A natural number.
 *
 * Calculates the 1 + ½ + ⅓ + ⋯ + 1⁄n sum for the given number n.
 */
fun calculateSum(n: Int): Double {
    var sum: Double = 0.0

    for (i: Int in 1..n) {
        sum = sum + 1.0 / i
    }

    return sum
}

/**
 * Asks for input from the user and validates it.
 *
 * Prompts the user to enter a natural number.
 * - if the input is blank, it prompts again and shows an error.
 * - if the input isn't a natural number, it prompts again and shows an error.
 *
 * @return the input if it is a valid natural number.
 */
fun askForSumInput() : Int {
    print("Enter a natural number: ")
    var n = readln()

    while(n.isBlank() || n.toIntOrNull() == null || n.toInt() <= 0) {
        if(n.isBlank()) {
            print("Error: Input can't be empty, please enter a natural number: ")
        } else {
            print("Error: Invalid natural number, please enter a natural number: ")
        }

        n = readln()
    }

    return n.toInt()
}

/**
 * Calculates the 1 + ½ + ⅓ + ⋯ + 1⁄n sum for a given natural number n and prints it.
 *
 * Asks the user for some input, validates, and if it's a valid input,
 * calculates the 1 + ½ + ⅓ + ⋯ + 1⁄n sum for a given natural number n and prints it
 */
fun processSum() {
   val n = askForSumInput()

    val result = calculateSum(n)
    println("Sum = $result")
}
