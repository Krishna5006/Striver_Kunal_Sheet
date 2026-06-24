package learnTheBasics.first_java.Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }

        System.out.println("New approach without hardcoding");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
