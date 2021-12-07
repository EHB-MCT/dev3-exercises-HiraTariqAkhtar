fun main(){
    println("Kies taal:")
    println("eng of fr?")
    val lang = readLine().toString()

    // enkel keuze tussen eng en fr => al de rest krijgt een error
    if (lang != "fr" && lang != "eng"){
        throw error("${lang} is geen optie, je hebt de keuze tussen fr en eng")
    }

    println("Hoeveel woorden zou je willen vertalen?")
    println("Kies een getal tussen 5 en 10")
    val roundSize = readLine()!!.toInt()

    val game = Duolingo(roundSize,lang)
    game.play()
}