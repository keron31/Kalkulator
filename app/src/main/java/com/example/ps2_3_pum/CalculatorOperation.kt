package com.example.ps2_3_pum

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
    object Power: CalculatorOperation("^")
    object Root: CalculatorOperation("√")
    object Log: CalculatorOperation("log")
}