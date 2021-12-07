class Duolingo(val roundSize : Int = 5, val lang: String = "eng"){
    var words = mutableSetOf<Word>(
        //Frans
        Word("maison", "huis", "fr"),
        Word("fille", "meisje", "fr"),
        Word("garçon", "jongen", "fr"),
        Word("nom", "naam", "fr"),
        Word("vache", "koe", "fr"),
        Word("chat", "kat", "fr"),
        Word("chien", "hond", "fr"),
        Word("bras", "arm", "fr"),
        Word("pied", "voet", "fr"),
        Word("chaise", "stoel", "fr"),

        //Engels
        Word("house", "huis", "eng"),
        Word("girl", "meisje", "eng"),
        Word("boy", "jongen", "eng"),
        Word("name", "naam", "eng"),
        Word("cow", "koe", "eng"),
        Word("cat", "kat", "eng"),
        Word("dog", "hond", "eng"),
        Word("arm", "arm", "eng"),
        Word("foot", "voet", "eng"),
        Word("chair", "stoel", "eng")
        )
    
    init{
         words = words.filter { it.language == lang }.toMutableSet()
    }

    fun play(){
        println("Vertaal de volgende woorden naar het Nederlands:")
        println("Veel succes!!")

        val randomWords = words.shuffled().take(roundSize).toMutableSet()
        // .shuffled => zodat we niet elke keer dezelfde hebben
        // .take() => aantal items nemen (waarde tussen haakjes = aantal)
        // toMutableSet => zodat een item kan worden weggehaald

        while (randomWords.isNotEmpty()){
            // .isNotEmpty => totdat er woorden over zijn
            val selectedWord = randomWords.random()
            println(selectedWord.original)
            val answer = readLine()

            if (answer == selectedWord.translated){
                randomWords.remove(selectedWord)
                println("Je antwoord is juist")
            } else{
                println("Je antwoord is fout")
                println("Het juiste antwoord was ${selectedWord.translated}")
                println("--Dit woord zal later opnieuw komen--")
            }

            if(randomWords.count() > 1){
                println("Er blijven nog ${randomWords.count()} woorden over")
            } else if(randomWords.count() == 1) {
                println("Er blijft nog ${randomWords.count()} woord over")
            } else{
                println("Er blijven geen woorden meer over")
                println("EINDE")
            }
        }
    }
}