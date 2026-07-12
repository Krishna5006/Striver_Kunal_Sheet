package _04_functions;

import java.util.Scanner;

public class _03_VoteEligibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        if(voteEligibility(age)){
            System.out.println("Person is Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
        sc.close();

    }
    static boolean voteEligibility(int age)
    {
        return age>=18;
    }
}
