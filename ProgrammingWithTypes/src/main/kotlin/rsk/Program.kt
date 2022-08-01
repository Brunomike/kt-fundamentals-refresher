package rsk

fun main(args: Array<String>) {
    var kevin=ProgramStudent(1,"Kevin")
    var jones=ProgramStudent(1,"Kevin")

    println(kevin)
        //.equals

    if (kevin==jones){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var newKevin=kevin.copy(name="Robert")
    println(newKevin)
}

data class ProgramStudent(val id:Int,val name:String){

}