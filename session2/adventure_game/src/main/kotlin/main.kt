fun main(){
    println("What is your name?")
    val user = readLine()
    println("What's your best friends name?")
    val friend = readLine()
    println("Oh no, ${friend} is missing!")
    println("Would you be able to find ${friend}?")
    println("You start by going to ${friend}'s house")
    println("Best of luck ${user}!")
    challengeOne(friend)
}

fun challengeOne(friend:String?){
    println("Solve the following riddle to continue the search:")
    val options = listOf("strawberry", "watermelon", "raspberry")
    println("You find a plate on the dining table, it has red spots on it.")
    println("Which fruit do you think ${friend} was eating?")
    val answer = readLine()
    if (answer == "") {
        println("Please fill a fruitname in")
        readLine()
    }
    if (answer == options[0] || answer == options[1] || answer == options[2]){
        println("This is certainly possible, watch around to find more clues")
        challengeTwo(friend)
    } else{
        gameOver(friend)
    }
}

fun gameOver(friend:String?){
    println("You've given the wrong answer")
    println("Your search stops here, you couldn't find ${friend}")
}