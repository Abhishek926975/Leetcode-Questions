// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         int n=piles.length;

//         int i=1, j=0;

//         int max=piles[0];
//         for(int k=0;k<piles.length;k++){
//             if(piles[k]>j)
//             j=piles[k];

//         }

//         int ans=j;

//         while(i<=j){

//             long mid=(i+j)/2;

//             long hours=0;

//             for(int m=0;m<piles.length;m++){
                
//                 hours+= (piles[m] + mid - 1) / mid;
//             }

//              if(hours <= h){
//                 ans = (int)mid; // Store potential answer
//                 j = (int)mid - 1; // Try smaller speed
//             } else {
//                 i = (int)mid + 1; // Need faster speed
//             }

//             }
        
//         return ans;
//     }
// }









class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        
        int i=1, j=0;

        // int max=piles[0];


        for(int k=0;k<piles.length;k++){
            j=Math.max(j,piles[k]);
        }

        // int ans=j;

        while(i<=j){
            int mid=i+(j-i)/2;


            boolean flag= find(piles,  h, mid);

                if(flag==true){
                    // i=mid;
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }

        }   
        return i;
    }




        boolean find(int[] piles,int h,int speed) {
            long hours=0;

            for(int i=0;i<piles.length;i++){
                hours += ((piles[i]+speed-1)/speed);
            }
            // System.out.println(hours);

            return hours<=h;


        }
 

}