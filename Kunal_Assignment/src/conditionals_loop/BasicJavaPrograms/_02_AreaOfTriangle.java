package conditionals_loop.BasicJavaPrograms;

import java.util.Scanner;

public class _02_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Base:");
        float base=sc.nextFloat();
        System.out.print("Enter Height:");
        float height=sc.nextFloat();
        float area=(base*height)/2;
        System.out.print("Area of Triangle:" +area);
    }
}
