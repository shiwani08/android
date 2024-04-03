fun main() {
    println("hello world")

    // val CANNOT be changed
    // var CAN be changed

    var n: Int = 5
    //val name: data type = value
    val str = "shiwani"
    println("the value is: "+n)
    println("my name is: $n "+str)
    n = 10
    println("the value is: "+n)
    println("my name is: $n "+str)

    n++
    println("the value is: "+n)
    println("my name is: $n "+str)


}