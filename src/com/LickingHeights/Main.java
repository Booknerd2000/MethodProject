package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String name;
        printHelloWorld();
        int firstNumber, secondNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        hello(name);

        System.out.println("Lets practice multiplication");
        typeIn("a number.");
        firstNumber = keyboard.nextInt();
        typeIn("another number.");
        secondNumber = keyboard.nextInt();
        System.out.println(multiplication(firstNumber,secondNumber));

        System.out.println("Now it's time for division");
        typeIn("a different number.");
        firstNumber = keyboard.nextInt();
        typeIn("another number.");
        secondNumber = keyboard.nextInt();
        System.out.println(division(firstNumber,secondNumber));

        System.out.println("Lets determine which number is bigger");
        typeIn("a number with two digits.");
        firstNumber = keyboard.nextInt();
        typeIn("another number with two digits.");
        secondNumber = keyboard.nextInt();
        System.out.println(max(firstNumber,secondNumber));
    }
    public static void typeIn(String direction){
        System.out.println("Type in "+ direction);
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
    public static int multiplication(int numberA, int numberB){

        return numberA * numberB;
    }
    public static double division(double numberA, double numberB){

        return numberA/numberB;
    }
    public static double max(double numberA, double numberB){
        if (numberA>numberB){
            return numberA;
        }
        else if (numberA<numberB) {
            return numberB;
        }
        else {
            System.out.println("Those number are equal to each other.");
           return numberA;
        }
    }
}
