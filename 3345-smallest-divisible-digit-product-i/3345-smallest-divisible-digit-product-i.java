class Solution {
    public int smallestNumber(int n, int t) {
        int res = 0;
        while (true) {
            int nums = n, mul = 1;

            while (mul != 0 && nums > 0) {
                mul *= nums % 10;
                nums /= 10;
            }

            if (mul % t == 0) {
                return n;
                // // break;
                // n++;
            }
            n++;
         
        }

        // return res;

    }
}