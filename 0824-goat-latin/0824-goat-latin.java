class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);

            if (i > 0) {
                sb.append(" ");
            }

            if (vowels.indexOf(first) != -1) {

                sb.append(word);
            } else {

                sb.append(word.substring(1));
                sb.append(first);
            }

            sb.append("ma");

            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
        }

        return sb.toString();
    }

    // class Solution {
    //     public String toGoatLatin(String sentence) {

    //         StringBuilder sb=new StringBuilder();
    //         for(int i=0;i<sentence.length();i++){
    //             char ch=sentence.charAt(i);

    //             if(ch=='a'|| ch=='e' || ch=='i'||ch='o'||ch=='u' &&
    //                ch=='A'|| ch=='E' || ch=='I'||ch='O'||ch=='U'){
    //                 sb.append(sentence.charAt(i));
    //                 sb.append("ma");
    //                 sb.append("a");
    //             }

    //             else if(){

    //             }

    //         }
    //     }
    // }

}