package first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Principal:");
        int p=sc.nextInt();
        System.out.print("Input Rate:");
        int r=sc.nextInt();
        System.out.print("Input Time:");
        float t=sc.nextFloat();
        float Si=(p*r*t)/100;
        System.out.println("Simple Interest is:" +Si);
    }
}
