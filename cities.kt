fun main() {
    cities("Ankara", 27, 31, 82)
    cities("Tokyo", 25, 30, 90)
    cities("Cape Town", 23, 35, 80)
    cities("Guatemala City", 20, 30, 85)

}

fun cities (name : String, minTemp : Int, maxTemp : Int, percent : Int) {
    println("City: $name")
    println("Low temperature: $minTemp, High temperature: $maxTemp")
    println("Chance of rain: $percent%")
    println()
}