import java.time.LocalDate

fun printGreeting(){
    println("Hello, User")
}

fun getGreeting():String{
    return "Hello, User"
}

// No type is needed if the return type is inferred
// Single expression function
// The return type is inferred to be a String
fun getGreeting(name:String) = "Hello, $name"


fun getGreeting(text:String, name:String) = "$text, $name"

// Default Paramaters
fun getGst(amount:Double, taxRate:Double = 16.5) = amount + amount * taxRate/100

// Default Parameters
fun getBill(amount: Double, modeOfPayment:String = "Cash"):Double{
    var bill:Double = 0.0;
    if(modeOfPayment == "Cash"){
        bill = getGst(amount)
    }
    else if(modeOfPayment == "Card"){
        bill = getGst(amount, 5.toDouble())
    }
    return bill
}


fun promoteCardPayments(amount:Double):String{
    var saved:Double = 0.0;
    val billOnCash = getBill(amount.toDouble())
    val billOnCard = getBill(amount.toDouble(), "Card")
    saved = billOnCash - billOnCard
    return "You have saved saved $saved PKR"
}

// Unit function
fun printMessage() = println("Hello, welcome to the Kotlin Masterclass")

// Function types
var greetingFunction: () -> Unit = {
    println("Hello Kotlin!!!")
}

var repeat : (String) -> String = { text ->
    "$text $text"
}

// Higher Order Function
fun printCalculatedValue(value1:Int, value2:Int, calculator: (Int,Int) -> Int){
    println("The value is: ${calculator(value1,value2)}")
}


// Write a higher order function printFormattedName that takes two parameters firstName, lastName
// The function wil take in the functional paramter
// The functional paramter shall take two Strings
// printFormattedName should print the result of calling the format function

fun printFormattedName(firstName:String, lastName:String, formatter: (String, String) -> String){
    println("The formatted name is: ${formatter(firstName, lastName)}")
}

val basicFormatter: (String, String) -> String = { firstName, lastName ->
    "$firstName $lastName"
}

val fancyFormatter: (String, String) -> String = { firstName, lastName ->
    "First name is: $firstName\nLast name is: $lastName"
}




// Main function return type is Unit => Unit means non-meaningful return type
fun main(){
    printGreeting()
    val greeting = getGreeting()
    println(greeting)
    println(getGreeting("Ahmed"))
    printMessage()
    // Local function is a function that is defined inside another function
    // A local function can only be called from with in its enclosing function
    // by default all function are public
    fun getCurrentDate() = LocalDate.now()
    println(getCurrentDate())

    println(getGreeting("Adaab", "Ahmed"))

    val amount:Double = 1500.00
    println("Your Bill on Cash is: ${getBill(amount)}")
    println("Your Bill on Card is: ${getBill(amount,"Card")}")
    println(promoteCardPayments(amount))

    // Function type
    greetingFunction()

    greetingFunction = {
        println("Greeting! I am changed now")
    }

    greetingFunction.invoke()

    repeat("Kotlin") // value returned not picked
    println(repeat("Kotlin"))
    println(repeat.invoke("Python"))

    // Calling Higher Order Function
    printCalculatedValue(5, 2, {value1, value2 ->
        value1 + value2
    })

    printCalculatedValue(8, 4, {value1, value2 ->
        value1 - value2
    })

    // Trailing Lambda Syntax
    printCalculatedValue(10, 2) {value1, value2 ->
        value1 * value2
    }

    printFormattedName("Ahmed", "Bashir", basicFormatter)
    printFormattedName("Ahmed", "Bashir", fancyFormatter)
    printFormattedName("Ahmed", "Bashir") {first, last ->
        "\n$first $last\n${"-".repeat(first.length + last.length)}"


    }
}

