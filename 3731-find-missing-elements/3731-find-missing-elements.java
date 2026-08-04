class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        int n=nums.length;
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<small){
                small=nums[i];
            }

            if(nums[i]>large){
                large=nums[i];
            }


           
        }

        ArrayList<Integer> range=new ArrayList<>();

        for(int i=small; i<=large;i++){
            boolean found = false;
            
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                range.add(i);
            }
        }

        return range;




    }
}