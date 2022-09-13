class Solution {

    private boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }

    public int myAtoi(String s) {
        int len = s.length();

        if (len == 0) return 0;

        int index = 0;
        //skipping white spaces
        while (index < len && s.charAt(index) == ' ') index++;

        //computing sign
        boolean isNegative = false;
        if (index < len) {
            if (s.charAt(index) == '-') {
                isNegative = true;
                index++;
            } else if (s.charAt(index) == '+') {
                index++;
            }
        }
        //covert string to integer
        int ans = 0;

        while (index < len && isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if ((ans > (Integer.MAX_VALUE / 10)) || (ans == Integer.MAX_VALUE/10 && digit > 7)) 
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            ans = (ans * 10) + digit;
            index++;
        }

        return isNegative ? -ans : ans;
    }
}
