package com.niit.jdp;

public class ConditionalConstructs {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int finalNumber;
        finalNumber = (firstNumber > secondNumber) ? 200 : 400;
        System.out.println(finalNumber);
        ConditionalConstructs.switchMethod();
    }

    public static int switchMethod() {
        int number = 100;
        switch (number) {
            case 50: {
                System.out.println("number is 50");
                break;
            }
            case 100: {
                System.out.println("number is 100");
                break;
            }
            default:
                System.out.println("invalid");
                break;
        }
        return 0;
    }
}