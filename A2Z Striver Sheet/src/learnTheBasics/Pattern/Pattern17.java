package learnTheBasics.first_java.Pattern;

public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            char ch='A';
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //star
            int middle=(2*i+1)/2;
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(ch);
                if(j<middle)
                    ch++;
                else ch--;

            }

//            A
//           ABC
//          ABCDE
//         ABCDEFG

            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
