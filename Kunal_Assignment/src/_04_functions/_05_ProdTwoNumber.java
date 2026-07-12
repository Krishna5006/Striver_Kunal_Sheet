package _04_functions;

import java.util.Scanner;

public class _05_ProdTwoNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long num1,num2;
        System.out.print("Enter Number1: ");
        num1= sc.nextLong();
        System.out.print("Enter Number2: ");
        num2= sc.nextLong();
        System.out.println("Product of Numbers is :"+prod(num1,num2));
        sc.close();
    }
    static long prod(long num1,long num2){
        return num1*num2;
    }
}
