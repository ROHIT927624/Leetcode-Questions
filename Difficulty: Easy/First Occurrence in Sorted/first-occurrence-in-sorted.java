class Solution {
    public int firstSearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Stores the smallest index found so far

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                result = mid;     // Record the current match
                right = mid - 1;  // Keep looking left for a smaller index
            } 
            else if (arr[mid] < k) {
                left = mid + 1;   // Search the right half
            } 
            else {
                right = mid - 1;  // Search the left half
            }
        }

        return result;
    }
}