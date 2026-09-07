// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {

//         int n = bloomDay.length;

//         int i = 1, j = 0;

//         if ((long) m * k > n)
//             return -1;

//         for (int x = 0; x < bloomDay.length; x++) {
//             if (bloomDay[x] > j)
//                 j = bloomDay[x];

//         }

//         int ans = -1;
// -
//         while (i <= j) {

//             int mid = (i + j) / 2;

//             int bouque = Helper(bloomDay, mid, k);

//             if (bouque >= m) {
//                 ans = mid;
//                 j = mid - 1;
//             } else {
//                 i = mid + 1;
//             }

//         }

//         return ans;
//     }

//     int Helper(int[] bloomDay, int mid, int k) {
//         int flower = 0;
//         int n = bloomDay.length;
//         int bouqe = 0;

//         for (int i = 0; i < n; i++) {
//             if (bloomDay[i] <= mid) {
//                 flower++;
//                 if (flower == k) {
//                     bouqe++;
//                 }
//             } else {
//                 flower = 0;
//             }
//         }
//         return bouqe;
//     }

// }




class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

    int i=1,j=0;

    int n=bloomDay.length;

    if((long) n < k*m){
        return -1;
    }

    for(int l=0;l<bloomDay.length;l++){
        j=Math.max(bloomDay[l], j);
    }

    int ans=-1;

    while(i<=j){

        int mid=i+(j-i)/2;

        boolean flag=find(bloomDay, mid , k,m);

        if(flag==true){
            ans=mid;
            j=mid-1;
        }
        else{
            i=mid+1;
        }


    }

    return ans;


}

boolean find(int[] bloomDay, int mid, int k,int m){
    int boque=0;
    int flower=0;

    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=mid){
            flower++;

            if(flower==k){
                boque++;
                flower=0;
            }
        }
        else{
            flower=0;
        }

        if(boque>=m) return true;
    }

    return false;
}

}