package _04_functions;

import java.util.Scanner;

public class _04_SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter Number1: ");
        num1= sc.nextInt();
        System.out.print("Enter Number2: ");
        num2= sc.nextInt();
        System.out.println("Sum of Number is :"+sum(num1,num2));
        sc.close();
    }
    static int sum(int num1,int num2){
        return num1+num2;
    }
}
