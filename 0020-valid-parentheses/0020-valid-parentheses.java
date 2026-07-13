class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
                if (ch == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();

    }

}

//Approach using the pointer or just comparing 

// for(int i=0;i<s.length()-1;i++){

//     char ch=s.charAt(i);

//     char nextch=s.charAt(i+1);

//     // if(ch='(' && ch=')' || ch='{' && ch='}' || ch='[' && ch=']'){
//     //     return true;
//     // }
//     if ((ch == '(' && nextch == ')') || 
//         (ch == '{' && nextch == '}') || 
//         (ch == '[' && nextch == ']') ||
//          ch == '{' && nextch == '}') {
//         return true; // Found at least one valid pair
//     }
// }
// return false;
//     }
// }