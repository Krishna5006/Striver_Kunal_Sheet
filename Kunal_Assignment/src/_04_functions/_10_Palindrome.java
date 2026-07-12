package _04_functions;

import java.util.Scanner;

public class _10_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();

        if(palindrome(num))
            System.out.println("PalindromeNumber");
        else
            System.out.println("NotPalindromeNumber");

    }

    static int reverse(int num){
        int revNum=0;
        if (num==0)
                return 0;
        while (num>0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }
        return revNum;

    }
    static boolean palindrome(int num)
    {
        if(num<0)
            return false;
        return num==reverse(num);
    }
}
