class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i: nums) {
            m.merge(i, 1, (a,b) -> a+b);
        }
        // System.out.println(m);

        int [][]arr = m.entrySet()
        .stream()
        .sorted( (a, b) -> b.getValue() - a.getValue())
        .map(e -> new int[]{ e.getKey(), e.getValue() })
        .toArray(int[][]::new);

        // System.out.println(Arrays.deepToString(arr));

        int[] ret = new int[k];
        for (int i=0; i<k; i++) {
            ret[i] = arr[i][0];
        }

        return ret;
        
    }
}
