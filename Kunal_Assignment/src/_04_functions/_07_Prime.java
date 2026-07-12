package _04_functions;

import java.util.Scanner;

public class _07_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num +" is a Prime Number");
        }
        else{
            System.out.println(num +" is not a Prime Number");

        }
        sc.close();
    }
    static boolean isPrime(int num){
        int c=2;
        if(num<=1)
            return false;
        while (c*c<=num)
        {
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
