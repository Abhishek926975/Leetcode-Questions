class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        

        int i=1,j=0;

        for(int k=0;k<nums.length;k++){
            j=Math.max(j,nums[k]);
        }

        int ans=0;

        while(i<=j){

            int mid=i+(j-i)/2;


            boolean flag=find(nums, threshold,mid);


            if(flag==true){
                
                j=mid-1;
            }
            else i=mid+1;

        }

        return i;

    }

    boolean find(int[] nums, int threshold, int speed){
        long hours=0;

        for(int i=0;i<nums.length;i++){
            hours+=( nums[i]+speed-1)/speed;
        }

        return hours<=threshold;
        // if(hours>threshold){
        //     return true;
        // }
        // else return false;

        // return hours<=threshold;
    }



    
}