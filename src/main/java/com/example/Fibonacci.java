package main.java.com.example;

public class Fibonacci {
    public static String generateSeries(int n) {
        StringBuilder result = new StringBuilder();
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            result.append(firstTerm).append(" ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return result.toString().trim();
    }
}
