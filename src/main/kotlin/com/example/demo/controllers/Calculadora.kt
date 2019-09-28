package com.example.demo.controllers

 class Calculadora {
	 fun sum(num1:Int, num2:Int ):Int{
	return num1+num2
	 }
 	 fun res(num1:Int, num2:Int ):Int{
	return num1-num2
	 }
	 fun mul(num1:Int, num2:Int ):Double{
	return num1.toDouble()*num2.toDouble()
	 }
	 fun div(num1:Int, num2:Int ):Double{
	return num1.toDouble()/num2.toDouble()
	 }
}