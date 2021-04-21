fun main(){
    var gari= Car("Toyota","Zalon","blue",6)
    var big = Bus("isuzu","sealon","red",4)
    gari.carry(6)
    gari.identity()
    println(gari.calculateParkingFees(4))
    println(big.maxTripFare(200.0))
    println(big.calculateParkingFees(6))


}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {

    fun carry(people: Int) {
        var people = capacity
        if (people <= capacity) {
            println("Carrying $people passenger")
        } else {
            var x = people
            (x > capacity)
            println("Over capacity by $x people")
        }
    }
    fun identity() {
            println("I am $color $make $model")
        }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
}
class Bus(make: String, model: String, color: String, capacity: Int):Car (make, model, color, capacity){
    fun maxTripFare(fare: Double): Double {
        var product = fare * capacity
        return product }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }


    }

