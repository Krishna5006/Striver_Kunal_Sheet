package Recursion.Lecture;

public class PrintingNtoOne {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void fun(int num){
        if (num==0){
            return;}

        System.out.println(num);
        fun(num-1);
    }
}
