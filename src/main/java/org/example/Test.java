package org.example;

public class Test {
    public static void main(String[] args) {
        differenceBetweenTwoNumbers(10, 10);
        differenceBetweenTwoNumbers(10, 20);

    }
    static void differenceBetweenTwoNumbers(int firstNumber, int secondNumber){
        if (firstNumber == secondNumber) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are different");
        }
    }

}
