package schooloj.六和九组成的最大数字;
public class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}

