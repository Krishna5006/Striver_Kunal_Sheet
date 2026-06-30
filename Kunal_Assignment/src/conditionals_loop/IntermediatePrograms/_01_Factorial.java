package conditionals_loop.IntermediatePrograms;

public class _01_Factorial {
    public static void main(String[] args) {
        int n=12,prod=1;
        int org=n;
        while(org!=0){
            prod=prod*org;
            org--;
        }
        System.out.println("Factorial of "+ n +" is "+prod);
    }
}
