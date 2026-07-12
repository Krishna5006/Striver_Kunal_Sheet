package _04_functions;

import java.util.Scanner;

public class _09_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
    static long factorial(int num){
        if (num==1 || num==0)
            return 1;
        return num*factorial(num-1);
    }
}
