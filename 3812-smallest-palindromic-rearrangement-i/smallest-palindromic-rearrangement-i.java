class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n == 1) return s;
        int halfLen = n / 2;
        char[] halfChars = new char[halfLen];
        for (int i=0;i<halfLen;i++) {
            halfChars[i] = s.charAt(i);
        }
        Arrays.sort(halfChars);
        String firstHalf= new String(halfChars);
        String secondHalf= new StringBuilder(firstHalf).reverse().toString();
        if (n%2 != 0) {
            char midChar = s.charAt(halfLen);
            return firstHalf + midChar + secondHalf;
        }
        return firstHalf + secondHalf;
    }
}