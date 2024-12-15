val name:String="Note"
var greeting:String?=null

fun main(){
println(greeting)
println(name)
main1()
}
fun main1(){
when(greeting){
null -> println("hi")
else -> println(greeting)
}
println(name)
}
