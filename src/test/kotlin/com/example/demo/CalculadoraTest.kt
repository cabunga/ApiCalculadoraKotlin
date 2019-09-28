package com.example.demo
import org.junit.Test as test
//import kotlin.test.assertEquals
import junit.framework.Assert
import com.example.demo.controllers.Calculadora
class CalculadoraTest() {
	@test fun sum(){
		Assert.assertEquals(2,Calculadora().sum(1,1))
	}
	@test fun res(){
		Assert.assertEquals(2,Calculadora().res(4,2))
	}
	@test fun mul(){
		Assert.assertEquals(2.0,Calculadora().mul(1,2))
	}
	@test fun div(){
		Assert.assertEquals(2.0,Calculadora().div(4,2))
	}
}