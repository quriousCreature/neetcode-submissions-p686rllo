class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0;
        int j= s.length()-1;

        // System.out.printf("J %d \n" + s.charAt(j), j);

        while (i < j) {
            // if ((s.charAt(i) < 'a' || s.charAt(i) > 'z') || (s.charAt(i) < '0' || s.charAt(i) > '9')) {
            if (!(s.charAt(i)-'a' > -1 && s.charAt(i)-'a' < 26) && !(s.charAt(i)-'0' > -1 && s.charAt(i)-'0' <= 9)) {
                // System.out.println("I " + i);
                i++;
                continue;
            }
            if (!(s.charAt(j)-'a' > -1 && s.charAt(j)-'a' < 26) && !(s.charAt(j)-'0' > -1 && s.charAt(j)-'0' <= 9)) {
                // System.out.println("J " + j);
                j--;
                continue;
            }
            // System.out.println("I " + s.charAt(i) + " J "+s.charAt(j));
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
