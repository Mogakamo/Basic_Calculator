fun main() {
    // write your code here
    val (hours, minutes, seconds) = readLine()!!.split(' ')
    val (day, month, year) = readLine()!!.split(' ')

    val time = "$hours:$minutes:$seconds"
    val date = "$day/$month/$year"

    println("$time $date")
}