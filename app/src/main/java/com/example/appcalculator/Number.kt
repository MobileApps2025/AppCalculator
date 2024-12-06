package com.example.appcalculator

class Number(private val num1:Int, private val num2: Int) {
    fun add():Int{
        return num1+num2
    }
    fun subtract():Int{
        return num1-num2
    }
    fun multiply():Int{
        return num1*num2
    }

    fun divide():Any{
        return if(num2!=0){ num1/num2}
        else{ "Eroare: Impartire la 0!"}
    }

}