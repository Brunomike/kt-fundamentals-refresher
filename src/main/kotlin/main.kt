import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello, Michael")

    var kelvin = Person("Kelvin")
    println("Name is ${kelvin.Name}")
    kelvin.Name="Kevin"
    kelvin.display()
    kelvin.displayWithLambda(::printName)


}

fun printName(name:String){
    println(name)
}