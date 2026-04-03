class KthLargest {
    ArrayList<Integer> list;
    int k;

    public KthLargest(int k, int[] nums) {
        list = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
        this.k = k;
    }
    
    public int add(int val) {
        list.add(val);
        list.sort( (Integer a, Integer b) -> a-b);
        // System.out.println("Size = "+ list.size());
        return list.get((list.size()-k));
    }
}
