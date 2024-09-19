package org.example
fun main(){
    //======> Function
    // Unit tidak mereturn nilai type data
    fun setUser(name: String, age:Int):String{
        return "Your name is $name, and you $age years old";
    }
    val user = setUser("Alfian",19)
    println(user);


    //Function => Cara simpel
    fun setUser1(name:String,age:Int):String = "Your name is $name, and you $age years old";
    //Named Argument atau memanggil paramater tidak berdasakan urutan
    fun getFullName(first:String, middle:String, last: String):String{
        return "$first $middle $last";
    }
    val fullName = getFullName(middle = "is",first = "kotlin", last = "Awesome");
    println(fullName);


//    Function mempunyai nilai default
    println(getFullName1(first = "Saya"))


//    Vararg(Variabel Argumant)
    val number = sumNumbers(10,20,30,40);
    println(number)
}



//Vararg
fun sumNumbers(vararg numbers:Int):Int{
//    return number.size
    for (num in numbers){
        println(num)
    }
    return numbers.size
}


// Default Argumument atau menentukan nilai default
fun getFullName1(
    first: String = "Kotlin",
    middle:String = "is",
    last: String = "Awesome"): String{
    return "$first $middle $last"
}
