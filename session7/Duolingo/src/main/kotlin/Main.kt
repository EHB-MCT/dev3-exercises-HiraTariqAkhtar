fun main(){
    val game = Duolingo()
    println("Hoeveel woorden zou je willen vertalen?")
    println("Kies een getal tussen 5 en 10")
    val roundSize = readLine()!!.toInt()
    println("Kies taal:")
    println("eng of fr?")
    val lang = readLine().toString()
    game.play(roundSize,lang)
}