class Comedian (override val name:String):Person(name) {
    override fun talk() {
        tellJoke()
    }
    fun tellJoke(){
        println("Let me tell you a joke...")
    }
}