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
        System.out.println("Types in a number.");
        firstNumber = keyboard.nextInt();
        System.out.println("Type in another number.");
        secondNumber = keyboard.nextInt();
        System.out.println(multipliplication(firstNumber,secondNumber));
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
    public static int multipliplication(int numberA, int numberB){

        return numberA * numberB;
    }
}
