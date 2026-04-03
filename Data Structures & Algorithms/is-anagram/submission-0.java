class Solution {
    public boolean isAnagram(String s, String t) {
        s = Arrays.stream(s.split(""))
        .sorted()
        .collect(Collectors.joining());

        char[] sorted_t = t.toCharArray();
        Arrays.sort(sorted_t);
        t = new String(sorted_t);

        // System.out.println(s);
        // System.out.println(t);

        return s.equals(t);
    }
}
