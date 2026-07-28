class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;

        // return nums[n/2];

        //second approach

        int count =0;
        int candidate=0;

        for(int num : nums){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }
        
        }
        return candidate;
    }
}