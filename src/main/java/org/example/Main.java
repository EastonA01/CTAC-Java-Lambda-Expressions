package org.example;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /* Task 1: Create a few simple lambda expressions that perform addition,
        subtraction, multiplication, and division operations.
        Test your lambda expressions to make sure they work correctly.
        */
        // Addition
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        // Subtraction
        BinaryOperator<Integer> subtract = (a, b) -> a -b;
        // Multiplication
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        // Division
        BinaryOperator<Integer> divide = (a, b) -> a / b;
        // Tests
        System.out.println("1+1 = " + sum.apply(1,1));
        System.out.println("8-4 = " + subtract.apply(8,4));
        System.out.println("5*5 = " + multiply.apply(5,5));
        System.out.println("25*5 = " + divide.apply(25,5));

        /*
        Task 2: Create your own functional interfaces and use lambda expressions
        to create instances of them.
         */
        FunctionalInterfaces test = (String a) -> System.out.println(a);
        test.Test123("Nick");

        /*
        Task 3: Use lambda expressions with Java's built-in functional
        interfaces such as Predicate, Function, Consumer, and Supplier.U
         */
        // Boolean valued function
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        System.out.println("5 isEven = " + isEven.test(5));
        // Accepts one argument and produces a result
        Function<Integer, Integer> add = (a) -> a + 2;
        System.out.println("5 add 2 = " + add.apply(5));
        /* Note: From my research, Consumer interfaces will NEVER return
            any value, but can still produce a result. Like in the case of the
            below interface that simply displays a number
        */
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(5);
        /*
        Note: Inversely, Supplier interfaces will NEVER take in an  argument but
        will always produce a value of a predefined type.
        Still don't fully understand the use cases here.
         */
        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println(randomDouble.get());


    }
}