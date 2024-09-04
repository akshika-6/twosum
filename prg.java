import java.util.*;
class prg{
    public static int[] twoSum(int[] nums,int target)
    {
        //int k=0;
        int arr[]=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int array1[]={2,7,11,14};
        int k=9;
        int array2[]=twoSum(array1,k);
        System.out.println(Arrays.toString(array2));
    }
}