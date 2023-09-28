package com.jcmateus.androidmaster.sintaxis



fun main(){

    //Indice 0-7
    //Tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

   // println(weekDays[0])
    //println(weekDays.size)



    //Cuando no conocemos el tamaño del array
    if (weekDays.size >= 8){
        //println(weekDays[7])
    }else  {
        //println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz Lunes!"
    //println(weekDays[0])

    //Bucles para arrays

    for(position in weekDays.indices){
        //println(weekDays[position])
    }
    for ((position, value ) in weekDays.withIndex() ){
        println("La posicion $position, contiene $value")
    }
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}


