package Recursion.Lecture;

public class PassingNumberConcept {
    public static void main(String[] args) {
        int n=5;
        pass(n);
    }
    static void pass(int n){
        if(n==0)
            return;
        System.out.println(n);
        pass(--n);
        //why we used --n and not n-- though they both refer to n-1;
        //because n-- : pass value first and then subtract
        //using n-- will create a stack overflow condition(Infinite Recursion)
    }
}
