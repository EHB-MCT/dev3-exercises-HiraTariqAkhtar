fun main(){
    println("Hello world")
    sayHello()
}

fun sayHello(){
    var person = arrayOf("Hira", "David", "Amina", "Kevser", "Niko")
    for(name in person){
        println("Hello $name")
    }
}
