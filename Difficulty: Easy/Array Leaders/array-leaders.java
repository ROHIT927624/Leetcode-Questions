import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int maxRight = arr[arr.length - 1];
        res.add(maxRight);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                res.add(arr[i]);
            }
        }
        
        Collections.reverse(res);
        return res;
    }
}
// Example

// Input:

// arr = [16, 17, 4, 3, 5, 2]

// Traversal:

// Start with 2 → leader
// 5 >= 2 → leader
// 3 < 5 → not leader
// 4 < 5 → not leader
// 17 >= 5 → leader
// 16 < 17 → not leader

// Collected (right to left): [2, 5, 17]

// After reversing: [17, 5, 2] 