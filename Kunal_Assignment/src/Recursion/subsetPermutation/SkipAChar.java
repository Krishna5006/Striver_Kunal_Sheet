package Recursion.subsetPermutation;

public class SkipAChar {
    public static void main(String[] args) {
        skipACharacter("","bacad");
        System.out.println();
        System.out.println(skipAChar2("baaccaad"));
    }

    //skip a character
    static void skipACharacter(String p,String up)//p->processed up->unprocessed
    {
        if(up.isEmpty())
        {
            System.out.print(p);
            return;
        }
        char ch =up.charAt(0);
        if(ch=='a')
        {
            skipACharacter(p,up.substring(1));
        }
        else {
            skipACharacter(p+ch,up.substring(1));
        }

    }

    static String skipAChar2(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch =up.charAt(0);
        if(ch=='a')
        {
            return skipAChar2(up.substring(1));
        }
        else
        {
            return ch + skipAChar2(up.substring(1));
        }
    }
}
