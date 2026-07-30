package Recursion.subsetPermutation;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println(subsetArrayList("","xyz"));
//        System.out.println("ASCII -");
//        subsetAscii("","abc");
        System.out.println(subsetAsciiArrayList("","abc"));
    }

    static void subset(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subset(p+ch,up.substring(1));  //accepting condition
        subset(p,up.substring(1));         //rejecting condition
    }

    static ArrayList<String> subsetArrayList(String p, String up)
    {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subsetArrayList(p+ch,up.substring(1));  //accepting condition
        ArrayList<String> right=subsetArrayList(p,up.substring(1));//rejecting condition

        left.addAll(right);
        return left;
    }

    static void subsetAscii(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subsetAscii(p+ch,up.substring(1));  //accepting condition
        subsetAscii(p,up.substring(1));//rejecting condition
        subsetAscii(p+(ch + 0),up.substring(1));
    }

    static ArrayList<String> subsetAsciiArrayList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subsetAsciiArrayList(p+ch,up.substring(1));  //accepting condition
        ArrayList<String> right=subsetAsciiArrayList(p,up.substring(1));//rejecting condition
        ArrayList<String> number=subsetAsciiArrayList(p+(ch + 0),up.substring(1));

        left.addAll(right);
        left.addAll(number);
        return left;
    }
}
