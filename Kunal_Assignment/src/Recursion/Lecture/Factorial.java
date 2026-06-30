package Recursion.Lecture;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
    }
    static int factorial(int n){
        if (n==1 || n==0)
            return 1;
        return n*factorial(n-1);
    }
}
