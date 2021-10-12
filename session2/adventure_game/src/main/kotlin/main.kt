fun main(){
    println("What is your name?")
    val user = readLine()
    println("What's your best friends name?")
    val friend = readLine()
    println("Oh no, ${friend} is missing!")
    println("Would you be able to rescue ${friend}?")
    println("Best of luck ${user}!")
    challengeOne(friend)
}

fun challengeOne(friend:String?){
    println("You start by going to ${friend}'s house")
    println("Solve the following riddle to continue your search:")
    val options = setOf("strawberry", "watermelon", "raspberry")
    println("You find a plate on the dining table, it has red spots on it.")
    println("Which fruit do you think ${friend} was eating?")
    val answer = readLine()
    if (options.contains(answer)){
        println("You guessed it right!")
        println("You find another clue near the terrace door.")
        println("There, you find a note with an adress of where your friend is being held")
        challengeTwo(friend)
    } else{
        gameOver(friend)
    }
}

fun challengeTwo(friend:String?){
    println("You find ${friend} roped on a chair as soon as you get there, but you have to get through your worse enemy first")
    println("Firstly, you have to predict a dice roll")
    println("If you guess it right, you're one step closer at rescuing your best friend")
    println("If not, you can't get further")
    rollDice(friend)
}
fun rollDice(friend:String?){
    println("What's it gonna be?")
    println("Low(1-3) or high(4-6)?")
    val userAnswer = readLine()
    val randomNumber = (1..6).random()
    if (userAnswer == "low" && (1..3).contains(randomNumber)){
            challengeThree(friend)
        } else if(userAnswer == "high" && (4..6).contains(randomNumber)){
            challengeThree(friend)
    } else {
        gameOver(friend)
    }
}

fun challengeThree(friend:String?){
    println("Congratulations. You are one more step closer to rescue ${friend}")
}

fun gameOver(friend:String?){
    println("You've given the wrong answer")
    println("Your search stops here, you couldn't rescue ${friend}")
}