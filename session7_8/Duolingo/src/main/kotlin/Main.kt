fun main(){
    println("Kies taal:")
    println("eng of fr?")
    val lang = readLine().toString()

    println("Hoeveel woorden zou je willen vertalen?")
    println("Kies een getal tussen 5 en 10")
    val roundSize = readLine()!!.toInt()

    val game = Duolingo(roundSize,lang)
    game.play()
}