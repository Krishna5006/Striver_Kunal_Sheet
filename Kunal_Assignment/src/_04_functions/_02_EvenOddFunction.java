package _04_functions;

import java.util.Scanner;

public class _02_EvenOddFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        if (evenOddFun(num))
        {
            System.out.println(num+" is an EvenNumber");
        }
        else {
            System.out.println(num+" is an OddNumber");
        }
//        System.out.println(evenOddFun(num));
        sc.close();
    }
    static boolean evenOddFun(int a){
        return a % 2 == 0;
    }
}
