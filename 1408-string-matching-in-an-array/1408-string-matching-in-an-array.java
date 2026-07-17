import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        
        // Sort by length so shorter words are checked against longer ones
        // Arrays.sort(words, Comparator.comparingInt(String::length));
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (words[j].contains(words[i])) {
        //             ans.add(words[i]);
        //             break; // Found a match, no need to check further
        //         }
        //     }
        // }
        // return ans;



        
        
        // Sort by length so shorter words are checked against longer ones
        // Arrays.sort(words, Comparator.comparingInt(String::length));
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break; // Found a match, no need to check further
                }
            }
        }
        return ans;
    }
}   