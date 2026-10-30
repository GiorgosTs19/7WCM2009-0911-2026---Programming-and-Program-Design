package functions

fun askForInput(): Long {
    print("Enter a positive integer between 1 and 100 : ")
    // We need a Long number because the fibonacci numbers grow very quickly.
    var n = readln().toLong()

    // If the item is invalid, keep asking.
    while(n !in 1..100) {
        print("Enter a positive integer between 1 and 100 : +")
        n = readln().toLong()
    }

    return n
}

fun fibonacci() {
    val n = askForInput()

    fun calculate(a: Long, b: Long, remaining: Long): Long {
        if (remaining == 0L) return 0L

        return a + calculate(b, a + b, remaining - 1)
    }

    val sum = calculate(0L, 1L, n)

    println("The sum of the first $n Fibonacci numbers is $sum")
}