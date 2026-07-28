// import java.util.*;
// class Solution {
//     public int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int ans=0;
//        for(int i=0;i<nums.length-1;i++){
//         if(nums[i]==nums[i+1]){
//             ans= nums[i];
//         }
//        } 
//        return ans;
//     }
// }


// fast and slow pointer
class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance of the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}