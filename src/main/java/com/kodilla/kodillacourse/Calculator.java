package com.kodilla.kodillacourse;

public class Calculator {
    private double numberA;
    private double numberB;

    public Calculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    @Override
    public String toString() {
        return ("Result of the equasion is: ");
    }

    public double sum() {
        return numberA + numberB;
    }
    public double subtract() {
         return numberA - numberB;
    }
}
class Application{

    public static void main(String[] args) {
    Calculator calculator = new Calculator(15,89);
    double resultOfSum = calculator.sum();
    System.out.println("Sum result is: " + resultOfSum);
    double resultOfSubtraction = calculator.subtract();
    System.out.println("Subtraction result is: " + resultOfSubtraction);
    }
}
