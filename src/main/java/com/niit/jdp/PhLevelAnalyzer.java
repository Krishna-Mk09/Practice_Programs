package com.niit.jdp;

import java.util.Scanner;

public class PhLevelAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ph value");
        int phValue = scanner.nextInt();
        PhLevelAnalyzer analyzer = new PhLevelAnalyzer();
        String result = analyzer.getPhValue(phValue);
        System.out.println(result);
        scanner.close();
    }

    public String getPhValue(int phValue) {
        String statusOfAquarium = "";
        if (phValue < 7) {
            statusOfAquarium = "acidic";
        } else if (phValue > 7) {
            statusOfAquarium = "basic";
        } else if (phValue == 7) {
            statusOfAquarium = "neutral";
        }
        return statusOfAquarium;
    }
}
