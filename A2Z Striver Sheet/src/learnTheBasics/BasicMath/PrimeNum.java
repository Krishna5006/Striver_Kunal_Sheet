package learnTheBasics.BasicMath;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to check for Prime: ");
        int number=sc.nextInt();

        if(number<=1){
            System.out.println("Neither Prime nor Composite");
        } else if (isPrime(number)) {
            System.out.println(number+" is Prime Number");
        }else {
            System.out.println(number+" is Not Prime");
        }
    }
    static boolean isPrime(int num){
        int c=2;
        while(c*c <= num)
        {
            if(num%c==0)
                return false;
            c=c+1;
        }
        return true;
    }
}
