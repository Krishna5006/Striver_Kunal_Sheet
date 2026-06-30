package Recursion.Lecture;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n==1)
            return 1;
        return (n%10)+sum(n/10);
    }
}
