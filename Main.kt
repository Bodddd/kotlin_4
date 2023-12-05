fun main() {
    printEvenNumbers(1, 100)
    recursivePrintEvenNumbers(1, 100)

    printFactorial(7)
    println("Factorial 7 = ${recursiveFactorial(7)}")

    printFibonacciNumbers(100)
    recursivePrintFibonacciNumbers(100)
}

fun printEvenNumbers(startValue: Int, endValue: Int) {
    for (i in startValue..endValue) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

fun recursivePrintEvenNumbers(startValue: Int, endValue: Int) {
    if (startValue <= endValue) {
        if (startValue % 2 == 0) {
            println(startValue)
        }
        recursivePrintEvenNumbers(startValue + 1, endValue)
    }
}

fun printFactorial(value: Int) {
    if (value < 0) {
        println("Factorial must be greater than 0")
        return
    }
    var factorial = 1;
    for (i in 2 .. value) {
        factorial *= i
    }
    println("Factorial $value = $factorial" )
}

fun recursiveFactorial(value: Int): Int {
    if (value < 0) {
        throw IllegalArgumentException("Factorial is not defined for negative numbers")
    }
    if (value == 0 || value == 1) {
        return 1
    }
    return value * recursiveFactorial(value - 1)
}

fun printFibonacciNumbers(limit: Int) {
    if (limit < 0) {
        return
    }
    var firstNum = 0
    var secondNum = 1
    println(firstNum)
    while (secondNum < limit) {
        println(secondNum)
        secondNum += firstNum
        firstNum = secondNum - firstNum
    }
}

fun recursivePrintFibonacciNumbers(limit: Int) {
    if (limit < 0) {
        return
    }
    fun recursivePrint(firstNum: Int, secondNum: Int) {
        if (firstNum <= limit) {
            println(firstNum)
            recursivePrint(secondNum, firstNum + secondNum)
        }
    }
    recursivePrint(0, 1)
}
