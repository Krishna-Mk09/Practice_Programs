package com.niit.jdp;

public class ForLoop {
    public static void main(String[] args) {
        int result = ForLoop.sumOfNumbers();
        System.out.println(result);
        String[] names = {"vamshi ", "krishna", "vinnu", "nani"};
        String[] result2 = ForLoop.names(names);
        System.out.println(result2);

        ForLoop.sumOfEven();
        ForLoop.counting();
        ForLoop.series();

    }

    public static int sumOfNumbers() {
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static String[] names(String names[]) {
        for (String names1 : names) {
            System.out.println(names1);
        }
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
//        }
        return names;
    }

    public static int sumOfEven() {
        int number = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                number = i;
                System.out.println(number);
            }
        }
        return number;
    }

    public static int counting() {
        int count = 0;
        int number = 1000;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("countis " + count);
        return count;
    }

    public static int series() {
        int number = 20;
        while (number > 0) {
            System.out.println(number);
            number--;
        }
        return number;
    }
}
