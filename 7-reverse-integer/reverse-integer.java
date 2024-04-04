class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean flag = x < 0;
        String str = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(str).reverse();
        try{
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return flag ? -res : res;

    }
}