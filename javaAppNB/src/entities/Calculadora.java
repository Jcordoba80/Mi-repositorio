/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author jacov
 */
public class Calculadora {
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}
