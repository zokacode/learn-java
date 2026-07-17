class Solution {
    public String gcdOfStrings(String str1, String str2) {
        while (!str1.equals(str2)) {
            if (str1.length() > str2.length()) {
                if (!str1.startsWith(str2)) return "";
                str1 = str1.substring(str2.length());
            } else {
                if (!str2.startsWith(str1)) return "";
                str2 = str2.substring(str1.length());
            }
        }
        return str1;
    }
}
