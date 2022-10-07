/**
 * BRUT FORCE + STRING BUFERs
 */
public class Solution2 extends Solution {

    public int lengthOfLongestSubstring(String s) {
        // init vars
        var resMaxLength = 0;
        var currSubstring = new StringBuffer();

        // loop: looking for longest
        for (int i = 0; i < s.length(); i++) {
            var currChar = String.valueOf(s.charAt(i));

            // reset then skip if not repeating
            if (currSubstring.toString().contains(currChar)) {

                // keep non repeating chars
                var charIndex = currSubstring.indexOf(currChar);
                var startSubStr = currSubstring.substring(charIndex + 1);

                currSubstring = new StringBuffer(startSubStr + currChar);
                continue;
            }

            // keep looking...
            currSubstring.append(currChar);

            // found a longer one !
            if (currSubstring.length() > resMaxLength) {
                resMaxLength = currSubstring.length();
            }
        }
        return resMaxLength;
    }
}