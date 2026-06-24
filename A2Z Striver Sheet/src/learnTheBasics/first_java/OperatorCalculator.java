package learnTheBasics.first_java;

import java.util.Scanner;

public class OperatorCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int a=sc.nextInt();
        System.out.println("Enter Num2:");
        int b=sc.nextInt();
        System.out.println("Enter Operator:+ - * / :");
        String opt=sc.next();
        if(opt.equals("+")){
            System.out.println(a+b);
        } else if (opt.equals("-")) {
            System.out.println(a-b);
        }
        else if (opt.equals("*")) {
            System.out.println(a*b);
        }
        else{
        System.out.println(a / b);}
    }
}
