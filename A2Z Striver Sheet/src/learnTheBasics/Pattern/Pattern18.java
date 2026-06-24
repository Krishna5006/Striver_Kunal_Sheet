package learnTheBasics.first_java.Pattern;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'E';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
                if ((i + j) % 2 == 0)
                    ch--;
                else ch++;
            }
            System.out.println();
        }
    }
}


