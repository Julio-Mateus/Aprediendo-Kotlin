package com.jcmateus.androidmaster.exercise

import java.security.Principal

fun main(){
    println(codigosBodegasPack())
}

fun codigosBodegasPack(){
    try {
        println("Ingrese Codigo:")
        var codigoIngreso = readLine() !! .toInt()
        if (codigoIngreso <= 480){
            println("Bodega SUR")
            println("Ingrese Peso Del Paquete:")
            var pesoProducto = readLine() !! .toInt()
            if (pesoProducto < 24){
                println("Estante Tipo A")
            }else if (pesoProducto >= 25){
                println("Estante Tipo B")
            }else{
                println("Peso no admitido en esta bodega")
            }
        }else if (codigoIngreso > 480){
            println("Bodega NORTE")
            println("Ingrese Peso Del Paquete:")
            var pesoProducto = readLine() !! .toInt()
            if (pesoProducto <= 100){
                println("Estante A")
            }else if (pesoProducto >100){
                println("Estante B")
            }else{
                println("Peso no admitido en esta bodega")
            }
        }else{
            println("Codigo Invalido, Intente De Nuevo")
        }
    }
    catch (e:Exception){
        println("Codigo Invalido, Intente De Nuevo")
    }
}
