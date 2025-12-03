class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                if (low > 0) low--;
                high--;
            } else { // '*'
                if (low > 0) low--;  // '*' becomes ')'
                high++;              // '*' becomes '('
            }

            if (high < 0) return false; // Too many ')'
        }

        return low == 0; // All opens can be closed
    }
}
