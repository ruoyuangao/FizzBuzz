package main;

import main.FizzBuzzSolution;

public class Main {
    private static FizzBuzzSolution solution;
    public static void main(String[] args) {
        solution = new FizzBuzzSolution();

        for (int i = 1; i <= 100; ++i) {
            solution.fizzBuzz(i);
        }

    }
}