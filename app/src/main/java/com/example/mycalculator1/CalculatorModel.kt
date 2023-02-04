package com.example.mycalculator1

import java.lang.Integer.parseInt
import kotlin.properties.Delegates

class CalculatorModel {

//    private var input1 by Delegates.notNull<Int>()
//    private var input2 by Delegates.notNull<Int>()




    companion object {
        fun add(input1: String, input2: String): String {
            try {
                val number1 = input1.toDouble()
                val number2 = input2.toDouble()
                return (number1 + number2).toString()
            } catch (e: NumberFormatException) {
                println("Error: One or both of the inputs are not valid numbers.")
                return "invalid"
            }
        }
    }
}