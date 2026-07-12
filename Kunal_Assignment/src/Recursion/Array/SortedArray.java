package Recursion.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums={1,3,4,6,7,9,11};
        System.out.println(sort(nums,0));

    }
    static boolean sort(int[] arr,int index){

        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);
    }
}
