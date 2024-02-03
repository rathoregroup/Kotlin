fun main(){
//    val a = 5L; //representing long
//    val b = 5566256156; //representing int
//    val c = 5; //representing byte
//    val e = 2.7182818284 // Double
//    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    val nums : Int = 5;
    val numByte : Byte = nums.toByte()
//    In many cases, there is no need for explicit conversions because the type
//    is inferred from the context, and arithmetical operations are overloaded for
//    appropriate conversions, for example:
    val l = 1L + 3
    val x = 5 / 2.toDouble()
    println(x == 2.5)
}