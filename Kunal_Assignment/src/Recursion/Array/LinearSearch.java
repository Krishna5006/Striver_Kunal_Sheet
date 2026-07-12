package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,91,91,10};
        int target=91;
        int index=0;
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println(find(nums,index,target));
        System.out.println(findIndex(nums,index,target));
        System.out.println(findIndexLast(nums, nums.length-1, target));
        findAllIndex(nums,0,91);
        System.out.println(list);
        System.out.println();
        findAllIndexArrayList(nums,0,91,list2);
        System.out.println(list2);


    }

    static ArrayList<Integer> findAllIndexArrayList(int[] arr, int index, int target, ArrayList<Integer> list2){
        //base condition
        if(index==arr.length){
            return list2;
        }
        if(arr[index]==target) {
            list2.add(index);
        }
        return findAllIndexArrayList(arr, index+1, target,list2);
    }


    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr, int index, int target){
        //base condition
        if(arr.length-1==0 || index==arr.length){
            return;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        findAllIndex(arr, index+1, target);
    }


    static boolean find(int[] arr, int index, int target){
        //base condition
        if(arr.length-1==0 || index==arr.length){
            return false;
        }
        return (arr[index]==target) || find(arr, index+1, target);
    }

    static int findIndex(int[] arr, int index, int target){
        //base condition
        if(arr.length-1==0 || index==arr.length){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }
        else {return findIndex(arr, index+1, target);}
    }

    static int findIndexLast(int[] arr, int index, int target){
        //base condition

        if(index==-1){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }
        else {return findIndexLast(arr, index-1, target);}
    }
}
