package learnTheBasics.BasicMath;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int ans=countdigit(num);
        System.out.println(ans);

        //logarithmic approach:
        int ans2=(int) Math.log10( Math.abs(num))+1 ;
        System.out.println("Ans2="+ans2);

    }
    static int countdigit(int number){
        if(number==0){return 1;}

        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        return count;
    }

}
