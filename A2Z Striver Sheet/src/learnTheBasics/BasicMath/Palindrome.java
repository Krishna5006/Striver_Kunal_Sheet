package learnTheBasics.BasicMath;

public class Palindrome {
    public static void main(String[] args) {
        int num1=4554;
        int num2=7789;

        System.out.println(palindromeNumber(num1));
        System.out.println(palindromeNumber(num2));
    }
    static boolean palindromeNumber(int number){
        int originalnumber=number;
        int revnum=0;
        while(number!=0)
        {
            int rem=number%10;
            number=number/10;
            revnum=revnum*10+rem;
        }

//        if (originalnumber==revnum){
//            return true;
//        }
//        else return false;

        //since originalnumber==revnum already evaluates to true or false
        //so we can directly return it
        return originalnumber==revnum;
    }
}
