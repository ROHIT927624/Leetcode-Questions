class Solution {
    int reverse =0;
    public boolean isPalindrome(int n) {
        // code here
        n = Math.abs(n);   // Ignore negative sign
        int original = n;
        reverse = 0;       // Reset for each call
        reverseNumber(n);

        return original == reverse;
        
    }
    private void reverseNumber(int n) {
        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + (n % 10);
        reverseNumber(n / 10);
    }

}