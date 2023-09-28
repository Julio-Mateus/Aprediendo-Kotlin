package com.jcmateus.androidmaster.sintaxis



//VARIABLES
val age:Int = 30


fun main(){
    showMyName()
    showMyAge(28)
    add(25, 76)
    val mySubtract = subtract(18, 5)
    println(mySubtract)
}
fun showMyName(){
    println("Me llamo AdMaDevs")
}
fun showMyAge(currentAge:Int = 30){
    println("Tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}
fun subtract(firstNumber:Int, secondNumber:Int):Int{
    return firstNumber - secondNumber
}
fun subtractCool(firstNumber:Int, secondNumber:Int) = firstNumber - secondNumber


fun variablesAlfanumericas(){
    /**
     * Variables Alfanumericas
     */

    //Char
    val charExample1:Char = 'e'

    //String
    val stringExample:String = "AdMaDevs"
    val stringExample2= "AdMaDevs"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada:String = "Hola"
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)
    val example123:String = age.toString()
}

fun variablesBoolean(){
    /**
     * Variables booleanas
     */

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3:Boolean = false
}

fun variablesNumericas(){
    /**
     * Variables Numericas
     */


    //Int -2,147,483,647 a 2,147,483,647
    var age2:Int = 30
    println(age2)
    age2 = 29
    println(age2)


    //Long -9,223,372,036,854,775,807 a -9,223,372,036,854,775,807
    val example:Long = 30

    //Float
    val floatExample:Float = 30.5f

    //Double
    val doubleExample:Double = 3241.3123123


    /**
     *     println("Sumar: ")
     *     println(age + age2)
     *
     *     println("Restar: ")
     *     println(age - age2)
     *
     *     println("Multiplicar: ")
     *     println(age*age2)
     *
     *     println("Division: ")
     *     println(age/age2)
     *
     *     println("Mosulo: ")
     *     println(age%age2)
     */

    var exampleSuma = age + floatExample
}