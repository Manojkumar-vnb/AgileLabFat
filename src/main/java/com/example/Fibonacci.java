package com.example;

public class Fibonacci {
    
    public static String generateSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            result.append(firstTerm).append(" ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series: " + generateSeries(10));
    }
}
