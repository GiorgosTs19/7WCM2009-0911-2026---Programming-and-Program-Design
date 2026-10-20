fun gcd(a: Int, b: Int): Int {
   var x = a
   var y = b


   // Repeat until the remainder becomes zero.
   while (y != 0) {
       val remainder = x % y
       x = y
       y = remainder
   }


   // The last non-zero divisor is the GCD.
   return x
}


// adding main function for testing purpose
fun main() {
   println(gcd(12, 8))    // Expected: 4
   println(gcd(15, 25))   // Expected: 5
   println(gcd(7, 9))     // Expected: 1
   println(gcd(20, 20))   // Expected: 20
   println(gcd(100, 25))  // Expected: 25
}
