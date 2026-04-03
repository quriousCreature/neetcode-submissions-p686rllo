class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i : nums) {
            frequency.merge(i, 1, (a,b) -> a+b);
        }

        // Arrays.stream(nums)
        // .collect

        // int [] pos = int[1001];
        // int [] neg = int[1001];


        // for (int i : nums) {
        //     if (i >= 0) {
        //         pos[i]++;
        //     }
        //     else {
        //         neg[abs(i)]++;
        //     }
        // }
        System.out.println("Frequency - "+ frequency);
        List<Integer> numbers = new ArrayList<>();
        for (int j=0; j<k; j++ ) {
            int highest = 0;
            int highestNum = 0;
            for(Map.Entry<Integer, Integer> e : frequency.entrySet()) {
                if (highest < e.getValue()) {
                    highest = e.getValue();
                    highestNum = e.getKey();
                }
            }
            frequency.remove(highestNum);
            numbers.add(highestNum);


        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
