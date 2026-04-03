class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> m = new HashMap<Integer, Integer>();
       for ( int i=0; i<nums.length; i++ ) {
            int firstNum = nums[i];
            int secondNum = target - firstNum;

            if (m.containsKey(secondNum)) {
                int j = m.get(secondNum);
                return new int[] {j, i};
            }
            m.put(firstNum, i);
       }
       return new int[2];
    }
}
