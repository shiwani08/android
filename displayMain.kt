fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "shiwanisoni29082002@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(n: String, m: String) {
    println("There's a new sign-in request on $n for your Google Account $m.")
}
