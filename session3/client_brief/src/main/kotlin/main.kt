fun main(){
    val design1 = Course("Design1","Maaike", "Illustrator, Photoshop",1,  5)
    val dev1 = Course("Development1","Joni", "javaScript", 1,  5)
    val motion = Course("Motion", "Dennis", "Premiere Pro",1,  5)

    println("The course ${design1.courseName} was taught by ${design1.teacher}")
    println("We learnt to work with ${motion.lesson} in ${motion.courseName}")
    println("The language you learn in ${dev1.courseName} is ${dev1.lesson}")
}