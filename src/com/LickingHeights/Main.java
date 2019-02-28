package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String name;
        printHelloWorld();

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        hello(name);

    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
}
