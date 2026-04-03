class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String s : strs ) {
            // List index = Arrays.asList(new int[26]);
            int[] index = new int[26];

            for( int i=0; i<s.length(); i++) {
                index[s.charAt(i) - 'a' ]++;
            }
            // List listIndex = Arrays.asList(index);
            StringBuilder sb = new StringBuilder();
            for(int i : index) {
                sb.append("#").append(i);
            }
            String listIndex = sb.toString();

            if(m.containsKey(listIndex)) {
                List<String> anagrams = m.get(listIndex);
                anagrams.add(s);
            }
            else {
                m.put(listIndex, new ArrayList(List.of(s)));
            }
        }
        return new ArrayList(m.values());
        
    }
}
