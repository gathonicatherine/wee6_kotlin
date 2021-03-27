fun main() {
var mtu = Human("Fredrick",21,23.45)
mtu.eat(32,23.45)
    mtu.speak("Hello World!")
    mtu.birthday()

var user = User("Catherine","Wanjiku","catherrinewanjiku@gmail,com",97894876,23785)
    println(user.firstName)
println(user.password)
}
class Human(var name: String, var age:Int, var weight:Double){
    fun eat (foodWeight: Int, weight: Double) {
        println("I am eating $foodWeight kgs of food")

        var totalWeight = foodWeight + weight
        println(totalWeight)
    }

        fun speak(speech: String){
            println(speech)
        }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class User( var firstName:String, var lastName: String ,var email:String,  var phoneNumber:Int, var password:Int)
