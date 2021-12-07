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
        println("Elk woord heeft een standaard moeilijkheidsgraad")
        println("Indien jij juist antwoordt, wordt de moeilijkheidsgraad verminderd met 1")
        println("Indien jij fout antwoordt, wordt de moeilijkheidsgraad vermeerderd met 2")

        val randomWords = words.shuffled().take(roundSize).toMutableSet()
        // .shuffled => zodat we niet elke keer dezelfde hebben
        // .take() => aantal items nemen (waarde tussen haakjes = aantal)
        // toMutableSet => zodat een item kan worden weggehaald

        while (randomWords.isNotEmpty()){
            // .isNotEmpty => totdat er nog woorden over zijn in randomWords
            val selectedWord = randomWords.random()
            println(selectedWord.original)
            println("-- Moeilijkheidsgraad van het woord : ${selectedWord.difficulty} --")
            val answer = readLine()

            if (answer == selectedWord.translated){
                randomWords.remove(selectedWord)
                println("Je antwoord is juist")

                // moeilijkheidsgraad verminderen met 1
                selectedWord.difficulty -=1
                println("Moeilijkheidsgraad van het woord voor speler: "+selectedWord.difficulty)
            } else{
                println("Je antwoord is fout")
                println("Het juiste antwoord was ${selectedWord.translated}")
                println("--Dit woord zal later opnieuw komen--")

                // moeilijkheidsgraad vermeerderen met 2
                selectedWord.difficulty +=2
                println("Moeilijkheidsgraad van het woord voor speler: "+selectedWord.difficulty)
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