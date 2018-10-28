package com.kodilla.calculator;

public class Calculator {

    public int add(int a1, int a2) {
        return a1+a2;
    }

    public int substract(int a1, int a2) {
        return a1-a2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Calculator calc = new Calculator();

        System.out.println("Wynikiem dodawania liczby a = " + a + " i liczby b = " + b + " jest:" + calc.add(a,b) );
        System.out.println("Wynikiem odejmowania liczby a = " + a + " i liczby b = " + b + " jest:" + calc.substract(a,b) );
    }
}
