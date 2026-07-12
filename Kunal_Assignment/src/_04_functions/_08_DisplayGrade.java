package _04_functions;

import java.util.Scanner;

public class _08_DisplayGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks out of 100: ");
        int marks= sc.nextInt();
        System.out.println("Your Grade is: "+getGrade(marks));
        sc.close();
    }
    static String getGrade(int marks){
        if(marks>100 || marks<0)
            return "Invalid Input";
        if(marks>=91)
            return "AA";
        if(marks>=81)
            return "AB";
        if(marks>=71)
            return "BB";
        if(marks>=61)
            return "BC";
        if(marks>=51)
            return "CD";
        if(marks>=41)
            return "DD";
        return "Fail";
    }
}
