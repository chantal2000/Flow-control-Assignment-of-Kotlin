fun main(){
     Odd()
    println(LNames("Chantal","Anne","Peter"))
    Robot(8)
    Robot(4)
    Robot(50)
    Number()
}
fun Odd(){
    for(num in 1..100){
        if(num%2!==0){
            println(num)
        }
    }
}
fun LNames(name1:String,name2:String,num3:String):Int {
    var x = arrayOf("Chantal", "Niyonkuru", "JeanPierre")
    for (name in x) {
        if (name.length > 5) {
            return x.count()
        }
        }
}


    fun Robot(guestAge: Int) {
        if (guestAge < 6) {
            println("serve a glass of milk")
        } else if (guestAge < 15 && guestAge > 6) {
            println("the robot serves a bottle of fanta orange.")
        } else {
            println("gets a bottle of coca cola.")
        }
    }

    fun Number() {
        for (num in 1..100) {
            if (num % 3 == 0) {
                println("Fizz")
            } else if (num % 5 == 0) {
                println("Buzz")
            } else if (num % 3 == 0 && num % 5 == 0) {
                println("FizzBuzz")
            } else {
                println(num)
            }
        }
    }
