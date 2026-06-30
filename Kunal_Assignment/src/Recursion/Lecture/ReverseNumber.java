package Recursion.Lecture;

public class ReverseNumber {
    public static void main(String[] args) {
        int originalNum=12345;
        int n=originalNum;
        int count = 0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(rev(originalNum,count));
    }
    static int rev(int originalNum, int c)
    {
        if(originalNum==1)
            return 1;
        return (originalNum%10)*(10*c)+rev(originalNum/10,c-1);
    }
}

