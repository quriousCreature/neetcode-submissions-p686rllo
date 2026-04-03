class LRUCache {

    int size;
    Map<Integer, Integer> m;
    Deque<Integer> queue;
    public LRUCache(int capacity) {
        m = new HashMap<>();
        queue = new LinkedList<>();

        this.size = capacity;
    }
    
    public int get(int key) {
        if(m.containsKey(key)) {
            
            queue.remove(key);
            queue.addLast(key);
            return m.get(key);
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        System.out.println("Map - "+ m);
        System.out.println("Queue - "+ queue);
        if (m.containsKey(key)) {
            m.put(key, value);
            queue.remove(key);
            queue.addLast(key);
            return;
        }
        if (m.size() >= this.size) {
            int removeKey = queue.pollFirst();
            m.remove(removeKey);
        }
        m.put(key, value);
        queue.addLast(key);
    }
}
