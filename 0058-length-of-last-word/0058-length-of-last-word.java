class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length()-1;
        int count=0;

        char[] repeat = s.toCharArray();

        while(i>=0 &&  repeat[i]==' '){
            i--;
        }
        
        while(i>=0 && repeat[i]!= ' '){
            i--;
            count++;
        }
        return count;
        
        //Using methods

        // String[] word=s.trim().split("\\s+");
        // return word[word.length-1].length();
    }
}