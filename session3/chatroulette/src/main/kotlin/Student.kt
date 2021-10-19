class Student (override val name:String):Person(name) {
    override fun talk() {
        gossip()
    }
    fun gossip(){
        println("You won't believe what just happened....")
    }
}