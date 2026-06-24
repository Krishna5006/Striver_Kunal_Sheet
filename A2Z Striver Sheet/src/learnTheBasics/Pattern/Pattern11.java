package learnTheBasics.first_java.Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        int start;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)  //if we use j<i then condition 1 will fail ie 0<0
            {
                if ((i+j)%2==0){start=1;}
                else start=0;
                System.out.print(start+ " ");
            }
            System.out.println();
        }
    }
}
