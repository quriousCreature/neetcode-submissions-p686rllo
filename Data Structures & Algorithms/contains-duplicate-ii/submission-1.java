class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set<Integer> window = new HashSet<>();
    for (int j = 0; j < nums.length; j++) {
        // Slide the window: remove the element that is now too far away
        if (j > k) {
            window.remove(nums[j - k - 1]);
        }
        
        // .add() returns false if the element was already present
        if (!window.add(nums[j])) {
            return true;
        }
    }
    return false;
    }
}