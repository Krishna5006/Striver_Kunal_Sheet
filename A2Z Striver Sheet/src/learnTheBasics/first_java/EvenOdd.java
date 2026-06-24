package learnTheBasics.first_java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans=n&1;
        if (ans==1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
