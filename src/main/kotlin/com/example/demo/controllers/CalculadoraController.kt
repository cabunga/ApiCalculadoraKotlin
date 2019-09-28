package com.example.demo.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/api")
class CalculadoraController {
	@CrossOrigin
	@GetMapping("/add")
	fun add( @RequestParam(value = "num1")num1: Int,@RequestParam(value = "num2")num2: Int) = Calculadora().sum (num1.toInt(),num2.toInt())
@GetMapping("/res")
	fun rest( @RequestParam(value = "num1")num1: Int,@RequestParam(value = "num2")num2: Int) = Calculadora().res (num1.toInt(),num2.toInt())
@GetMapping("/mul")
	fun mul( @RequestParam(value = "num1")num1: Int,@RequestParam(value = "num2")num2: Int) = Calculadora().mul (num1.toInt(),num2.toInt())
	@GetMapping("/div")
	fun div( @RequestParam(value = "num1")num1: Int,@RequestParam(value = "num2")num2: Int) = Calculadora().div (num1.toInt(),num2.toInt())
	
	 val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String,@RequestParam(value = "ape")ape:String) =   "Hello, $name $ape"
}