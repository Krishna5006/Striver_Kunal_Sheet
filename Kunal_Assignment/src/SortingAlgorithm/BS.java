package SortingAlgorithm;

public class BS {
    public static void main(String[] args) {
        int[] arr={11,22,33,34,53,65,66,67,76,77,78,89,99,100};
        System.out.println(binarySearch(arr,99));
    }
    static int binarySearch(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
//            int mid=(s+e)/2;
            int mid=s+(e-s)/2;

            if (target<arr[mid])
            {
                e = mid-1;
            }
            else if(target>arr[mid])
            {
                s = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
