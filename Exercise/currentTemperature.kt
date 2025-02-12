fun currentTemperature (morningTemperature: Int , afternoonTemperature: Int): Int {
    return (morningTemperature + afternoonTemperature) / 2
}
fun main (){
    val averageTemperature = currentTemperature(25, 40)
    println("Average Temperature: $averageTemperature")
}
