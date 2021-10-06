fun main(){
    val choices = arrayOf("rock", "paper", "scissors")
    val computerChoice = choices.random()
    val userChoice = "paper"

    println("You chose $userChoice")
    println("Computer chose $computerChoice")
    determineWinner(computerChoice,userChoice)
}


fun determineWinner(computerChoice: String, userChoice: String){
    if (computerChoice == userChoice){
        println("It's a draw")
    }

    val winMsg = "You won =)"
    val loseMsg = "You Lose =("

    if ((computerChoice == "rock" && userChoice == "paper")||(computerChoice == "paper" && userChoice == "scissors")||(computerChoice == "scissors" && userChoice == "rock")){
        println(winMsg)
    }

    if ((computerChoice == "rock" && userChoice == "scissors")||(computerChoice == "paper" && userChoice == "rock")||(computerChoice == "scissors" && userChoice == "paper")){
        println(loseMsg)
    }
}
