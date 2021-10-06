fun main(){
    val choices = arrayOf("rock", "paper", "scissors")
    val computerChoice = choices.random()
    val userChoice = choose(computerChoice)

}

fun choose(computerChoice:String){
    println("Rock, paper or scissors??")
    val answer = readLine()
    checkAnswer(answer, computerChoice)
}

fun checkAnswer(answer:String?, computerChoice:String){

    if ((answer == "rock") ||(answer == "paper")||(answer == "scissors") ) {
        determineWinner(computerChoice, answer)
    } else{
        println("$answer is not an option. Try again")
        choose(computerChoice)
    }
}


fun determineWinner(computerChoice: String, userChoice: String){

    println("You chose $userChoice")
    println("Computer chose $computerChoice")

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
