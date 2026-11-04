package functions

// Student number: 24181012

/**
 * Asks for input from the user and validates it.
 *
 * @param name [String] - the name of the variable to ask the user.
 *
 * Prompts the user to enter a positive integer.
 * - if the input is blank, it prompts again and shows an error.
 * - if the input isn't a positive integer, it prompts again and shows an error.
 *
 * @return the input if it is a valid positive integer.
 */
fun validateInteger(name: String) : Int {
    print("Enter a positive integer $name: ")
    var n = readln()

    while(n.isBlank() || n.toIntOrNull() == null || n.toInt() <= 0) {
        if(n.isBlank()) {
            print("Error: Input can't be empty, please enter a positive integer: ")
        } else {
            print("Error: Invalid input, please enter a positive integer: ")
        }

        n = readln()
    }

    return n.toInt()
}

/**
 * Calculates the greatest common divisor of 2 given positive integers and prints it.
 *
 * Asks the user for two positive integers a and b until they're valid. When the input is valid,
 * it calculates the greatest common divisor of the two.
 */
fun gcd() {
    val a = validateInteger("a")
    val b = validateInteger("b")

   var x = a
   var y = b


   // Repeat until the remainder becomes zero.
   while (y != 0) {
       val remainder = x % y
       x = y
       y = remainder
   }

   // The last non-zero divisor is the GCD.
   println("The greatest common divisor of $a and $b is $x")
}
