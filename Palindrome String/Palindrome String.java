class Solution {
    public int isPalindrome(String S) {
        // convert the string to lowercase
        S = S.toLowerCase();
        // initialize two pointers, one at the start and the other at the end
        int i = 0, j = S.length() - 1;
        // loop until the two pointers meet
        while (i < j) {
            // if the characters at the two pointers are not equal, then the string is not a palindrome
            if (S.charAt(i) != S.charAt(j)) {
                return 0;
            }
            // otherwise, move the pointers towards each other
            i++;
            j--;
        }
        // if the loop completes, then the string is a palindrome
        return 1;
    }
}