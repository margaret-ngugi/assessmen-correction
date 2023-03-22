fun main() {
    //Q5.
////    var num = calculator(10,5,30)
//    num.addition()
//    num.subtraction()
//    num.multiplication()
//    num.division()
//    //Q1.
    println(words("anna","banana"))
    println(words("georgia","kisumu"))
    //Q2.
    val result =arraysNumbers(arrayOf(1,2,3,4,5,6,7))
    println(result.average)
    //Q4.
//    println(people())




}
//Q1.
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun words(sri1:String,str2:String):Char{
    if (sri1.length>=str2.length){
        return sri1[0]
    }
    else{return str2[0] }
}
//Q2.
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
data class MinMaxAv(val min:Int,val max:Int,val average:Double)
fun arraysNumbers(numbers:Array<Int>):MinMaxAv{
    val min=numbers.min()
    val max=numbers.max()
    val average=numbers.average()
    val result= MinMaxAv(max,min,average)
    return result
}
//Q3.
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3
fun people(name:String){

}
//Q4.
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun people(x:Array<String>):String{
    var output = ""









//Q5.
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
/////(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class calculator(var num1: Int, var num2: Int,  var num3: Int){
    fun addition(){
        var sum =num1+num2
        println(sum)
    }
    fun subtraction(){
        var difference = num3-num2
        println(difference)
    }
    fun multiplication(){
        var product = num1*num3
        println(product)
    }
    fun division(){
        var result = num3/num2
        println(result)
        }
