package Lecture2Sept27;

import java.util.Arrays;

public class upperBound {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,7,9};
        Arrays.sort(arr);
        for (int i=0;i<=10;i++){
            System.out.println("Upper bound of "+i+" -> "+helper(arr,i));
        }
    }
    public static int helper(int[] nums,int target){
        int lo=0;
        int hi=nums.length-1;
        int ans=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                ans=mid;
                hi=mid-1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        if(ans==-1) return lo;
        return ans;
    }
}
