package learnTheBasics.BasicMath;

import java.util.Scanner;

public class Armstrong {
    //what is an Armstrong number
    //For example, 153 is a 3-digit Armstrong number because 1^3+5^3+3^3=153
    //Similarly, 1634 is a 4-digit Armstrong number because  1^4+6^4+3^4+4^4=1+1296+81+256=1634.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num= sc.nextInt();
        System.out.println(armstrongNumber(num));
    }
    static boolean armstrongNumber(int number){
        int k = (number == 0) ? 1 : (int) Math.log10(number) + 1;
        int originalsum=number;
        int newSum=0;
        while(number!=0){
            int rem=number%10;
            number=number/10;

//            newSum=newSum+rem*rem*rem;//for 3 digit it will work but what about 4digit????
//            Step 2: Compute rem^k manually using a simple loop
//            int digitPower = 1;
//            for (int i = 0; i < k; i++) {
//                digitPower *= rem;
//            }


//            use Math function when doing look professional
            newSum=newSum+(int)Math.pow(rem,k);
        }
        return  originalsum==newSum;
    }
}
