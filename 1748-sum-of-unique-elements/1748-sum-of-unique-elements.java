// class Solution {
//     public int sumOfUnique(int[] nums) {

//         int j=0;
//         int[] res=new int[nums.length];
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] !=nums[j]){
//                res[i]=nums[i];
//             }
//             j++;
            
//         }

//         for(int i=0;i<res.length;i++){
//             sum+=res[i];
//         }
//         return sum;
//     }
// }




class Solution {
    public int sumOfUnique(int[] nums) {
       
        int[] count = new int[101];
        int sum = 0;

        
        for (int num : nums) {
            count[num]++;
        }

       
        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}   