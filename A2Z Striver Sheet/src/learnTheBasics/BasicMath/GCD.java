package learnTheBasics.BasicMath;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1= sc.nextInt();
        System.out.print("Enter Number 2:");
        int num2= sc.nextInt();
        System.out.println("Gcd of "+num1+" & "+num2+" :"+GcdNum(num1,num2));
    }
    static int GcdNum(int num1,int num2)
    {
        int min=Math.min(num1,num2);
        for (int i = min; i >=1 ; i--) {
            if(num1%i==0 && num2%i==0)
                return i;
        }
        return 1;
    }

}
