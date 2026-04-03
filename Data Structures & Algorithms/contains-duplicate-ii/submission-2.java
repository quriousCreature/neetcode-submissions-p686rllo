class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> m = new HashSet<>();
        int i=0;
        for(int j=0; j < nums.length; j++) {
            if (j-i >k ) {
                m.remove(nums[i]);
                i++;
            }
            // System.out.println("Set - "+ m);
            if(m.contains(nums[j])) {
                return true;
            }
            m.add(nums[j]);    
        }
        return false;
    }
}