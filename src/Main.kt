import kotlin.math.pow
import kotlin.math.roundToLong

fun main() {
    val name : String = "Ahmed Bashir"
    val isMarried : Boolean = true;
    println(name)
    println(isMarried)
    var currentCompany : String = "PrescribeNow"
    println(currentCompany)
    currentCompany = "Masterschool";
    println(currentCompany)
    println(isMarried)

    val radius: Double = 5.5
    var area = Math.PI * radius.pow(2.0);
    println("Area of circle is ${area.roundToLong()}")

    println(6 == 4)
    println(10 > 5)
    println(10.2 == 10.2)

    // conversion
    println(10.5.toInt())
    println(5.toDouble())

    // Char and String
    val grade:Char = 'A';
    val numericCharacter: Char = '0';
    val newLine:Char = '\n';

    val sString:String = "Kotlin"
    val escaped:String = "Hello \n World"
    println(escaped)

    val rawString = """
        Some 
        multi 
        line
    """
    println(rawString)
    println(rawString.trimIndent())

    val contactString:String = "Hello" + " World"
    val differentTypes:String = "Number " + 2
    println(differentTypes)

    val age = 32
    val contactTemplate = " age is $age"
    println("Right now $contactTemplate")
    println("Next year it would be ${age + 1}")


}