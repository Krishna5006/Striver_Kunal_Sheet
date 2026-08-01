package BinarySearch.BS1DArray;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5,5, 8, 15, 19};
        int x=5;
        System.out.println(lowerBoundBS(arr,x));

    }

    static int lowerBoundBS(int[] arr,int x)
    {
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ans;
    }
}
