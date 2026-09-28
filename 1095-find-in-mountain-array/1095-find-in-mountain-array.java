/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */


 class Solution {

private int findPeak(MountainArray arr, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }


private int searchLeft(MountainArray arr, int target, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }


private int searchRight(MountainArray arr, int target, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }


    public int findInMountainArray(int target, MountainArray mountainArr) {
        
       int n = mountainArr.length();
        int peak = findPeak(mountainArr, 0, n - 1);

        // Search ascending left half
        int left = searchLeft(mountainArr, target, 0, peak);
        if (mountainArr.get(left) == target) return left;

        // Search descending right half
        int right = searchRight(mountainArr, target, peak + 1, n - 1);
        if (mountainArr.get(right) == target) return right;

        return -1;
    }
}

