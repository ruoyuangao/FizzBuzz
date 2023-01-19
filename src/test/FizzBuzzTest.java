package test;

import main.FizzBuzzSolution;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private static FizzBuzzSolution solution;

    private static PrintStream console = null;

    private static ByteArrayOutputStream bytes = null;

    @BeforeAll
    public static void init() {
        solution = new FizzBuzzSolution();
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @Test
    public void invalidInputTest() {
        assertThrows(IllegalArgumentException.class, () -> solution.fizzBuzz(-1));
        assertThrows(IllegalArgumentException.class, () -> solution.fizzBuzz(0));
    }
    @Test
    public void should_return_origin_digit() {
        solution.fizzBuzz(1);
        String[] strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"1");

        solution.fizzBuzz(14);
        strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"14");

    }

    @Test
    public void should_return_fizz() {
        solution.fizzBuzz(123);
        String[] strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"Fizz");

        solution.fizzBuzz(333);
        strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"Fizz");
    }

    @Test
    public void should_return_buzz() {
        solution.fizzBuzz(5);
        String[] strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"Buzz");

        solution.fizzBuzz(220);
        strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"Buzz");
    }


    @Test
    public void should_return_fizzbuzz() {
        solution.fizzBuzz(15);
        String[] strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"FizzBuzz");

        solution.fizzBuzz(210);
        strs = bytes.toString().split("\r\n");
        assertEquals(strs[strs.length - 1],"FizzBuzz");
    }

    @AfterAll
    public static void afterTest() {
        System.setOut(console);
    }


}