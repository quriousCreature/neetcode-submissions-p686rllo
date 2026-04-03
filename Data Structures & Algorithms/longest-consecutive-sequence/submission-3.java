class Solution {
    // dumb brute force 
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Set<Integer> s = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        
        
        int longestSeq = 1;
        for (Integer e : new HashSet<>(s)) {
            if (!s.contains(e)) { continue; }
            
           s.remove(e);
           // increasing sequence from e
           int rightSeq = 0;
           int nextSeq = e+1;
           while(!s.isEmpty() && s.contains(nextSeq)) {
               s.remove(nextSeq);
               nextSeq += 1;
               rightSeq++;
           }

           // decreasing left sequence
           int leftSeq =0;
           int prevSeq = e-1;
           while(!s.isEmpty() && s.contains(prevSeq)) {
               s.remove(prevSeq);
               prevSeq--;
               leftSeq++;
           }
           int currLongest = (rightSeq+leftSeq+1);
           if(longestSeq < currLongest) {
                longestSeq = currLongest;
           }
        }
        
        return longestSeq;
        
    }
}
