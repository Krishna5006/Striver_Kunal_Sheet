package learnTheBasics.BasicRecursion;

public class PrintNameNtime {
    public static void main(String[] args) {
        String name="Krishna";
        int num=10;
        printName(name,num);
    }
    static int count=0;
    static int printName(String a,int b){
        if(count<b){
            System.out.println(a+" ");
            count++;
            return printName(a, b);
        }
        return 0;
    }
}
