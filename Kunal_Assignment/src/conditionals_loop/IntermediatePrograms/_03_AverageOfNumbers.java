package conditionals_loop.IntermediatePrograms;

public class _03_AverageOfNumbers {
    public static void main(String[] args) {
        int n=10,sum=0,org=n;

        while(org!=0)
        {
            sum=sum+org;
            org--;
        }
        int avg=sum/n;
        System.out.println("Average of "+n+" numbers is: "+avg);
    }
}
