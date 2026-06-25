package learnTheBasics.BasicMath;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num= sc.nextInt();
        ArrayList<Integer> ans=alldivisornum(num);
        System.out.println(ans);
    }
    static ArrayList<Integer> alldivisornum(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
                list.add(i);
        }
        return list;
    }

}
