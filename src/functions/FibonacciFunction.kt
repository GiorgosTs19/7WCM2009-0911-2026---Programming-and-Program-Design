package functions

// Student number: 24181003

/**
 * Asks for input from the user and validates it.
 *
 * Prompts the user to enter a natural number between 1 and 91 (91 because Long can only represent numbers up to a point before it overflows
 * could use BigInteger to allow for larger values).
 * - if the input is blank, it prompts again and shows an error.
 * - if the input isn't a natural number and within the desired range, it prompts again and shows an error.
 *
 * @return the input if it is a valid natural number.
 */
fun askForInput(): Long {
    print("Enter a natural number between 1 and 91 : ")
    // Need a Long number because the fibonacci numbers grow very quickly.
    var n = readln()

    // If the item is invalid, keep asking.
    while(n.isBlank() || n.toLongOrNull() == null || n.toLong() !in 1..91) {
        if(n.isBlank()) {
            print("Error: Input cannot be empty, please enter a natural number between 1 and 91 :")
        } else if(n.toLongOrNull() == null) {
            print("Error: invalid input (not a number), please enter a natural number between 1 and 91 : ")
        }
        else if(n.toLong() !in 1..91) {
            print("Error: Number outside the 1-91 range, please enter a natural number between 1 and 91 : ")
        }
        else {
            print("Error: Invalid number, please enter a natural number between 1 and 91 : ")
        }
        n = readln()
    }

    return n.toLong()
}

/**
 * Calculates the sum of the first n fibonacci numbers and prints it.
 *
 * Asks the user for some input (n) until it is valid. When the input is valid,
 * it calculates the sum of the first n fibonacci numbers.
 */
fun fibonacci() {
    val n = askForInput()

    fun calculate(a: Long, b: Long, remaining: Long): Long {
        if (remaining == 0L) return 0L

        return a + calculate(b, a + b, remaining - 1)
    }

    val sum = calculate(0L, 1L, n)

    println("The sum of the first $n Fibonacci numbers is $sum")
}