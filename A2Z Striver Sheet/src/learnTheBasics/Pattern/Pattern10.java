package learnTheBasics.first_java.Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++)
        {
            //star
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int k = 0; k < n-1; k++)
        {
        //star
        for (int l = 0; l < n-k-1; l++) {
            System.out.print("*");
        }

        //space
        for (int j = 0; j < k; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
