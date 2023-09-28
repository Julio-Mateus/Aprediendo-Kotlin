package com.jcmateus.androidmaster.sintaxis

fun main(){
    ifAnidado()
}

fun ifMultipleOR(){
    var pet = "dog"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = false

    if (age >= 18 && parentPermission && imHappy){
        println("Puedo beber cerveza")
    }



}

fun ifInt(){
    var age = 28

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifBoolean(){
    var soyFeliz = false

    // Si nada == a true
    // Con ! al principio == false
    if(!soyFeliz){

    }
}

fun ifAnidado(){
    val animal = "AdMa"

    if (animal == "dog"){
        println("Es un Perro!")
    }else if (animal == "cat"){
        println("Es un gato!")
    }else if (animal == "brid"){
        println("Es un pajaro!")
    }else   {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){
    val name = "Kronos"

    if (name == "AdMa"){
        println("Oye la variable name es ADMA")
    }else{
        println("Este no es Kronos")
    }
}