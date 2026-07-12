package _04_functions;

import java.util.Scanner;

public class _06_CircumferenceAndAreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float radius= sc.nextFloat();
        System.out.println("Circumference:"+circumCircle(radius));
        System.out.println("Area:"+areaCircle(radius));
        sc.close();
    }

    private static float areaCircle(float radius) {
        return (float) Math.PI*radius*radius;
    }

    private static float circumCircle(float radius) {
        return 2*(float)Math.PI*radius;
    }

}
