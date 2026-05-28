class Solution {
    public boolean isPalindrome(String s) {
        
        //remove non letter/digits
        //lowercase

        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] ca = cleaned.toCharArray();

        int start = 0;
        int end = ca.length - 1;

        while(start != end && end > 0) {
            if(ca[start] != ca[end]) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
