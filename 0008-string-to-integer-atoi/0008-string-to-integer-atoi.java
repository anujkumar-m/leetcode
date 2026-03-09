class Solution {
    public int myAtoi(String s) {
       s= s.trim();
        int i = 0;
        int sign = 1;
        if(s.length() == 0) return 0;
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign=(s.charAt(0) == '+')? 1 :-1;
            i++;
        }
        String num = "0123456789";
        long n = 0;
        while(i < s.length() && num.contains(String.valueOf(s.charAt(i)))){
            n = n * 10 + (s.charAt(i) - '0');
            if(sign == 1 && n > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(sign == -1 && -n < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)(n * sign);
    }
}