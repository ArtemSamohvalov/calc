package ru.geekbrains.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Insert your first number");
        int a = scanner.nextInt();
        System.out.println("Insert your second number");
        int b = scanner.nextInt();
        int result;
        if (operation == 1){
            result = a + b;
        } else if (operation == 2){
            result = a - b;
        } else if (operation ==3) {
            result = a * b;
        } else{
            result = a / b;
        }

        System.out.println("Result is " + result);
    }
}
