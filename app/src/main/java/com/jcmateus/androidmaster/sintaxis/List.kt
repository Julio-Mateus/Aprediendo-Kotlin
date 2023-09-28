package com.jcmateus.androidmaster.sintaxis

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(0,"JcMateusDevs")
    println(weekDays)

    if (weekDays.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        weekDays.forEach{ println(it)}
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it)}
    }
    weekDays.last()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //Ultimo valor
    //println(readOnly.last())
    //Primero
    //println(readOnly.first())

    //Filtrar
    //val example = readOnly.filter { it.contains("a") }
    //println(example)

    //Iterar
    readOnly.forEach{weekDay -> println(weekDay)}
}