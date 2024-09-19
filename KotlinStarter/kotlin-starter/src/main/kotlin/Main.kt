package org.example
fun main() {
//    awal kotlin
    val name = "kaspun"
    print("Hello my name is")
    println(name)
    println(if (true) "Always true" else "Always false")
//    Data Types & Variabel
//    Tipe data Var
    var company:String = "Dicoding";
    company = "Dicoding Academy";
//    Tipe data Val atau tipe data yang tidak bisa diganti nilainya
    val company1:String = "Yayasan Dicoding Indonesia"
//    Char
    var vocal = 'A';
    println("Vocal "+ vocal++);
    println("Vocal "+ vocal++);
    println("Vocal "+ vocal++);
    println("Vocal "+ vocal--);
    println("Vocal "+ vocal--);
    println("Vocal "+ vocal--);
    println("Vocal "+ vocal--);
//    String & String Template
    val text = "Dicoding";
    val firstChar = text[3];

    println("The 4th character of the $text is $firstChar")
    for(char in text){
        print("$char ")
    }
//    If Expressions
    val openHours = 7;
    val now = 7;
    val office:String;
    office = if(now > openHours){
        "Office already open";
    }else if(now == openHours){
        "Wait a minute, office will be open"
    }
    else{
        "Office in closed"
    }
    println(office);
//    Boolean
    val officeOpen = 7;
    val officeClose = 16;
    val isOpen = if (now >= officeOpen && now <= officeClose){
        true
    }else{
        false
    }
    println("Office is open : $isOpen");
//    number
    var maxInt = Int.MAX_VALUE
    var overRangeInt = Int.MAX_VALUE + 1; //Terjadi overflow atau nilai kembali ke nilai awal atau minimum
    println("Max Int: $maxInt");
    println("Over range  Int: $overRangeInt");
//    Array
    var array = arrayOf(1,3,5,7,"Dicoding",true);
    var array1 = intArrayOf(1,2,3,4,5)
    for(array in array){
        println(array)
    }
//    Nullatable Types
    val text2:String? = null;
    if(text != null){
        println(true)
    }
//    Safe Calls dan Elvis Operator, mirip seperti ternary operator
    val text3:String? = null;
    println(text3?.length);
    val textLength = text3?.length ?:7
    println(textLength);
}




