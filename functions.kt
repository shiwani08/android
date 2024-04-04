// this does not have a return value
fun greet() {
    println("hello happy day to you")
    println("this is under the greet func")
}

// takes an Int as an input and returns a string
fun name(name: Int) : String {
    var n: String = "shiwani"
    var age: Int = 22
    return "$n\n$age"
}

fun main() {
    greet()
    var n: String = name(22)
    println(name(22))
    println("this is the main func")
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// function can be below main()
fun add(n: Int, m: Int) : Int {
    val ans : Int = n + m
    return ans
}