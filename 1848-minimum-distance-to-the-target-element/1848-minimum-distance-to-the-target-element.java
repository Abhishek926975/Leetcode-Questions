class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        
        int mindistance=Integer.MAX_VALUE;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                int currentDis=Math.abs(i-start);
                if(currentDis<mindistance){
                    mindistance = currentDis;
                }
            }

        }

        return mindistance;
    }
}