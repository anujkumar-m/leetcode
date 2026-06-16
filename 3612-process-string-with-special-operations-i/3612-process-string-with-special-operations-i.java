class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ( c == '*') {
                if (str.length() > 0)
                    str.deleteCharAt(str.length() - 1);
            } else if (c == '#') {
                str.append(str);
            } else if (c == '%')
                    str.reverse();
            else
                str.append(c);
        }
        return str.toString();
    }
}