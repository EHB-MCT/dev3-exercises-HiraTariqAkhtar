class Duolingo(val roundSize : Int = 5, val lang: String = "eng"){
    var words = mutableSetOf<Word>(
        //Frans
        FrenchWord("maison", "huis"),
        FrenchWord("fille", "meisje"),
        FrenchWord("garçon", "jongen"),
        FrenchWord("nom", "naam"),
        FrenchWord("vache", "koe"),
        FrenchWord("chat", "kat"),
        FrenchWord("chien", "hond"),
        FrenchWord("bras", "arm"),
        FrenchWord("pied", "voet"),
        FrenchWord("chaise", "stoel"),

        //Engels
        EnglishWord("house", "huis"),
        EnglishWord("girl", "meisje"),
        EnglishWord("boy", "jongen"),
        EnglishWord("name", "naam"),
        EnglishWord("cow", "koe"),
        EnglishWord("cat", "kat"),
        EnglishWord("dog", "hond"),
        EnglishWord("arm", "arm"),
        EnglishWord("foot", "voet"),
        EnglishWord("chair", "stoel")
        )

    init{
         words = words.filter { it.language == lang }.toMutableSet()
        // toMutableSet => we krijgen een list na de filter
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