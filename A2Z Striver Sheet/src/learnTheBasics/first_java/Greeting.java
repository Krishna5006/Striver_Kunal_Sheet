package learnTheBasics.first_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.next();
        System.out.println("Hello Good Morning " +name +"! How are you?");
    }
}
