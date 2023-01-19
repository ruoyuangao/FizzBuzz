package main;

import main.FizzBuzzSolution;

public class Main {
    private static FizzBuzzSolution solution;
    public static void main(String[] args) {
        solution = new FizzBuzzSolution();
        solution.fizzBuzz(100);
    }
}