package main;

/*
* 打印数字
* 如果遇到 3 的倍数那么打 印 “Fizz” 替代这个数
* 同理如果遇到 5 的倍数打印 “Buzz” 替代这个数
* 如果既 是 3 也是 5 的倍数那么打印 “FizzBuzz” 替代这个数。
* */
public class FizzBuzzSolution {

    public static void fizzBuzz(int n) {
        // corner case
        if (n < 1) {
            throw new IllegalArgumentException("This input is not valid, the number should be an int between 1 and 100");
        }

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }

}
