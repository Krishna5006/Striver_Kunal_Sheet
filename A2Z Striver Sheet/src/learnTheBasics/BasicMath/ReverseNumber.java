package learnTheBasics.BasicMath;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        System.out.println("Reverse number is :"+reversenumber(num));

    }
    static int reversenumber(int number){
        int revnum=0;
        //long revnum should be used as it prevent silent overflow during calculation

        while(number!=0)
        {
            int rem=number%10;
            number=number/10;
            revnum=revnum*10+rem;
        }

        // Check if the reversed number overflows a standard 32-bit Integer
//        if (revnum > Integer.MAX_VALUE || revnum < Integer.MIN_VALUE)
//        {
//            System.out.println("Warning: Integer overflow detected!");
//            return 0;
//            (comment->)Standard practice on platforms like LeetCode
//        }


        return revnum;
    }
}
