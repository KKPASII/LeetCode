class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}