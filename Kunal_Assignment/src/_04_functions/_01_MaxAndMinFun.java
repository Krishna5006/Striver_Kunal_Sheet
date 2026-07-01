package _04_functions;

import java.util.Scanner;

public class _01_MaxAndMinFun {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 no. :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Maximum number is :");
        System.out.println(maxFun(a,b,c));
        System.out.print("Minimum number is :");
        System.out.println(minFun(a,b,c));

    }

    //alternate approach you can use is implementing max and min inside these functions
    //ie int max=a ,if b>max ,max=b or c>max ,max=c
    static int maxFun(int a,int b,int c){
        if(a>=b && a>=c)
            return a;
        else if (b>=a && b>=c)
            return b;
        else return c;
    }
    static int minFun(int a,int b,int c){
        if(a<=b && a<=c)
            return a;
        else if (b<=a && b<=c)
            return b;
        else return c;
    }
}
