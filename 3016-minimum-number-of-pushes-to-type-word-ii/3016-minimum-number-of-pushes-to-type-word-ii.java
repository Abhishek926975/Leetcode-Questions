class Solution {
    public int minimumPushes(String word) {

        int[] count =new int[26];

        for(char c: word.toCharArray()){
            count[c-'a']++;
        }
        int ans=0;
        Arrays.sort(count);
        for(int i=25;i>=0;i--){
            ans+=count[i]*((25-i)/8+1);
        }

        return ans;
    }
}