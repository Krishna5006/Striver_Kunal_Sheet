package Recursion.subsetPermutation;

public class SkipAString {
    public static void main(String[] args)
    {
        System.out.println(skipAString("hi_my_name_is_apple_singh"));
    }

    static String skipAString(String up)
    {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")){
            return skipAString(up.substring(5));
        }
        else{
            return up.charAt(0) + skipAString(up.substring(1));
        }
    }
}
