fun main(){
   // chatroulette1()
    chatroulette2()
}

fun chatroulette1(){
    val persons = arrayOf(Person("Hira"), Person("Umer"))
    val randomPerson = persons.random()
    randomPerson.introduce()

    // OF persons.random().introduce()
}

fun chatroulette2(){
    val persons = arrayOf(Teacher("Bert"), Student("Hira"), Comedian("comedian"))
    val chatPartner = persons.random()
    chatPartner.introduce()
    chatPartner.talk()
}