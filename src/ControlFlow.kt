import java.time.LocalDateTime


fun main(){
    // Conditional Logic
    // if statement
    if (true) println("Yes")

    if (true) {
        val message = "Complex Logic"
        println(message)
    }

    var a = 6
    var b = 9
    if (a > 3){
        println("$a is greater than 3")
    }

    if (a > b){
        println("$a is greater than $b")
    }
    else{
        println("$a is less than $b")
    }

    print("Enter payment type: ")
    var paymentType:String = readLine().toString()
    if (paymentType.lowercase() == "cash"){
        println("16% GST will be applied")
    }
    else if(paymentType.lowercase() == "card"){
        println("5% GST will be applied")
    }
    else{
        println("Invalid payment type")
    }

    // When - when can be used as a replacement of if else
    when{
        paymentType.lowercase() == "cash" -> println("16% GST will be applied")
        paymentType.lowercase() == "card" -> println("5% GST will be applied")
        else -> println("Invalid payment type")
    }

    val grade: Char = 'A'
    when(grade){
        'A' -> println("Brilliant")
        'B' -> println("Good")
        'C' -> println("Satisfactory")
    }

    val marks:Int = readln().toInt()
    when(marks){
        in 1..100 -> println("Valid")
        !in 10..100 -> println("Invalid")
    }
    val hour = LocalDateTime.now().hour
    val timeOfDay:String = when (hour) {
        in 5..11 -> "Good Morning"
        in 12..15 -> "Good Afternoon"
        in 17..21 -> "Good Evening"
        else -> {
            "Good Night"
        }
    }
    println(timeOfDay)

}