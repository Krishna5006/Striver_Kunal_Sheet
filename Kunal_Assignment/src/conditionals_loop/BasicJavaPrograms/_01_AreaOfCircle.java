package conditionals_loop.BasicJavaPrograms;

import java.util.Scanner;

public class _01_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle is :" +area);
    }
}
