class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i]=sum;
        }
        return res;

    }
}