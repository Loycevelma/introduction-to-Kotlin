fun main(){
number()
names("Cate","Loycevelma","Sophy","Akal","KendyG")
robot(4)
    robot(12)
    robot(34)
    value()
}

fun number(){
    for(numbers in 1..100)
if(numbers%2!=0)
println(numbers)

}
fun names(i:String,j:String,k:String,l:String,m:String):Array<String>{
    var a= arrayOf(i,j,k,l,m)
        for (b in a)
            if(b.length>5){
            println(b)
    }
    return a
}
fun robot(age:Int){
    if(age < 5) {
        println("Milk")
    }
    else if(age > 6 && age < 15) {
        println("Fanta Orange")
    }
    else{
        println("Coca COla")
    }
}
fun value() {
    for (values in 1..100) {
        println(values)
    }

    for (values in 1..100) {
        if (values % 3 == 1) {
            println("Fizz")
        }
        if (values % 5 == 1) {
                println("Buzz")
            }
        if (values % 3 == 1 && values % 5 == 1) {
            println("FizzBuzz")
        }

    }
}