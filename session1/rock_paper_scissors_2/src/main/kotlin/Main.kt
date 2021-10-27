fun main(){
    val choices = arrayOf("rock", "paper", "scissors")
    val computerChoice = choices.random()
    choose(computerChoice)
}

fun choose(computerChoice:String){
    println("Rock, paper or scissors??")
    val userChoice = readLine()
    checkAnswer(userChoice, computerChoice)
}

fun checkAnswer(userChoice:String?, computerChoice:String){

    if ((userChoice == "rock") ||(userChoice == "paper")||(userChoice == "scissors") ) {
        determineWinner(computerChoice, userChoice)
    } else if(userChoice == ""){
        println("Please fill something in")
        choose(computerChoice)
    }else{
        println("$userChoice is not an option. Try again")
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

    playAgain()

}
fun playAgain(){
    println("Do you want to play again?")
    val resp = readLine()
    if(resp == "yes" || resp == "Yes"){
        main()
    } else{
        println("GAME OVER")
    }
}
