package com.ozgurerdogan.kotlin_hilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(@FirstImplementer private val myInterface: MyInterface,
                                       private var gson:Gson,
                                       @SecondImplementer private val mySecondInterfaceImplementor: MyInterface){

    fun myFunction():String{
        return "Working: ${myInterface.myPrintFunction()}"
    }

    fun secondFunction():String{
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}