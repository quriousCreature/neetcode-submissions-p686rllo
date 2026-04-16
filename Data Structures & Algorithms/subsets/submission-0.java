class Solution {
    List<List<Integer>> res = new ArrayList<>();
    // res.add(new ArrayList<Integer>());
    
    public List<List<Integer>> subsets(int[] nums) {
        p(nums, new ArrayList<>(), 0);
        res.add(new ArrayList<>());
        return res;
    }

    public void p(int[] nums, List<Integer> cal, int i) {
        // if(cal.size() == nums.length) {
        //     res.add(new ArrayList<>(cal));
        //     return;
        // }

        for (int j=i; j<nums.length; j++) {

            cal.add(nums[j]);
            res.add(new ArrayList<>(cal)); // add current subset in res

            // compute next subset
            p(nums, cal, j+1);
            cal.remove(cal.size() -1);
        }
    }
}
