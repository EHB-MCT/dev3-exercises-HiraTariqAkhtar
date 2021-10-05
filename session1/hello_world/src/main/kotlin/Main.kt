fun main(){
    println("Hello world")
    var person = arrayOf("Hira", "David", "Amina", "Kevser", "Niko")
    for(name in person){
        sayHello(name)
    }}

fun sayHello(name: String){
    println("Hello $name")
}

