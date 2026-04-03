class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
        for (int i : stones) {
            maxHeap.offer(i);
        }

        while (maxHeap.size()>1) {
            int largest =  maxHeap.poll();
            int second = maxHeap.poll();

            // if(largest == second) {
            //     continue;
            // }
            // else {
                maxHeap.offer(largest-second);
            // }
        }

        return maxHeap.poll();
    }
}
