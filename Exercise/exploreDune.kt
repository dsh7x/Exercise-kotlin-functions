fun exploreDune (height: Double, climbRate: Double): Double {
    return height / climbRate
}
fun main (){
    val requiredTime = exploreDune(climbRate = 3.0, height = 20.0)
    print("Time to Climb the Dune: %.2f hours".format(requiredTime))
}