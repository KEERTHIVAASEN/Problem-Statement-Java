class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder result = new StringBuilder(num);
        boolean mutated = false;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (change[digit] > digit) {
                result.setCharAt(i, (char)(change[digit] + '0'));
                mutated = true;
            } else if (mutated && change[digit] < digit) {
                break;
            }
        }
        return result.toString();
    }
}
