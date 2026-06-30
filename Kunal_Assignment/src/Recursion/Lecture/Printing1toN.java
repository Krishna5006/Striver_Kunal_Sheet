package Recursion.Lecture;

public class Printing1toN {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void fun(int num){
        if (num==0)
            return;
        fun(num-1);
        System.out.println(num);
    }
}
