package Recursion.Lecture;

public class ProdOfDigits {
    public static void main(String[] args) {
        int n=55;
        System.out.println(Prod(n));
    }
    static int Prod(int n){
        if(n%10==n)   //if one element is remaining we will return the element itself
            return n; //we cant put n==0 as num will become zero and will give 0 for every answer
        return (n%10)*Prod(n/10);
    }
}
