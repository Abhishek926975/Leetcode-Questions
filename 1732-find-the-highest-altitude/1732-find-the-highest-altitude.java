class Solution {
    public int largestAltitude(int[] gain) {
        
        int currentAlti=0;
        int highestAlti=0;

        for(int i=0;i<gain.length;i++){
            currentAlti+=gain[i];

            highestAlti=Math.max(currentAlti,highestAlti);
        }
        return highestAlti;
    }
}