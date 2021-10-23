fun main(){
    println("What is your name?")
    val user = readLine()
    println("What's your best friends name?")
    val friend = readLine()
    println("Oh no, ${friend} is missing!")
    println("Would you be able to rescue ${friend}?")
    println("Best of luck ${user}!")
    challengeOne(friend, user)
}

fun challengeOne(friend:String?, user:String?){
    println("You start by going to ${friend}'s house")
    println("Solve the following riddle to continue your search:")
    val options = setOf("strawberry", "watermelon", "raspberry", "cherry")
    println("You find a plate on the dining table, it has red spots on it.")
    println("Which fruit do you think ${friend} was eating?")
    println("Note: if you give the wrong answer, your adventure will stop here")
    val answer = readLine()
    if (options.contains(answer)){
        println("You guessed it right!")
        println("You find another clue near the terrace door.")
        println("There, you find a note with an adress of where your friend is being held")
        challengeTwo(friend, user)
    } else{
        println("Wrong answer")
        gameOver(friend, user)
    }
}

fun challengeTwo(friend:String?, user:String?){
    println("You find ${friend} roped on a chair as soon as you get there, but you have to get through your worse enemy first")
    println("Firstly, you have to predict a dice roll")
    println("If you guess it right, you're one step closer at rescuing your best friend")
    println("If not, you can't go further")
    rollDice(friend, user)
}
fun rollDice(friend:String?, user:String?){
    println("What's it gonna be?")
    println("Low(1-3) or high(4-6)?")
    val userAnswer = readLine()
    val randomNumber = (1..6).random()
    if (userAnswer == "low" && (1..3).contains(randomNumber)){
            challengeThree(friend, user)
        } else if(userAnswer == "high" && (4..6).contains(randomNumber)){
            challengeThree(friend, user)
    } else {
        println("${userAnswer} is unfortunately the wrong answer")
        gameOver(friend, user)
    }
}

fun challengeThree(friend:String?, user:String?){
    println("Your choice is now going to be crucial for ${friend}'s rescue")
    println("What will you choose?")
    println("Run away, find a distraction or fight?")
    val answer = readLine()
    if (answer == "run away"){
        println("You've let your friend down. What a disloyal friend you are! Shame on you!")
        gameOver(friend, user)
    } else if(answer == "find a distraction"){
        distractionChoice(friend, user)
    } else if(answer == "fight"){
        println("You chose to fight your enemy")
        println("Get ready for your next challenge")
        challengeFour(friend, user)
    }else{
        gameOver(friend, user)
    }
}

fun distractionChoice(friend:String?, user:String?){
    println("You look around to find a distraction")
    println("You see a dog and a painting on the wall")
    println("What will you do?")
    println("Ask about the painting or throw something at the dog?")
    val answer = readLine()
    if (answer == "ask about the painting"){
        println("You begin to ask questions about the painting")
        println("While your enemy is answering your questions you carefully go towards your friend ")
        println("You almost reached ${friend} but your enemy saw you")
        println("You get one more chance")
        println("You have to predict the roll dice again")
        println("Note: if you get it wrong now, all your chances to rescue your friend will be gone...")
        rollDice(friend, user)
    } else if(answer == "throw something at the dog"){
        println("You find a rock on the ground and you throw it at the dog")
        println("The dog gets angry and starts to bark very loudly")
        println("The dog is so out of control that your enemy has to go to him to check what's wrong")
        println("You run to ${friend}, get him out of the chair and run back home")
        success(friend, user)
    }

}

fun challengeFour(friend:String?, user:String?){
    
}

fun gameOver(friend:String?, user:String?){
    println("Your adventure stops here, you couldn't rescue ${friend}")
}

fun success(friend:String?, user:String?){
    println("Congratulations ${user}, you have successfully rescued ${friend}")
}