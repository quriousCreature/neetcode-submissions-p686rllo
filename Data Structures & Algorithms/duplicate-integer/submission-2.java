class Solution {
    public boolean hasDuplicate(int[] nums) {
        AtomicBoolean duplicate = new AtomicBoolean(false);
        Arrays.stream(nums)
            .sorted()
            .reduce((a, b) -> { 
                if (a == b) {
                    duplicate.set(true);
                }
                return b;
            });
        
        return duplicate.get();
    }
}