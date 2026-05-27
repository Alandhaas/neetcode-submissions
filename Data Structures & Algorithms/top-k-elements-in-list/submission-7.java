class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1x1 2x2 3x3
        // 7x2 
        // if k equals 1, return greatest

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i : nums) {
            if (ht.containsKey(i)) {
                ht.put(i, ht.get(i) + 1);
            } else {
                ht.put(i, 1);
            }
        }

        int[] output = new int[k];

        for(int i = 0; i < k; i++) {
            int counter = 0;
            int keyItem = 0;
            for(int key : ht.keySet()) {
                if (ht.get(key) > counter) {
                    counter = ht.get(key);
                    keyItem = key; 
                }
            }
            output[i] = keyItem;
            ht.remove(keyItem);

        }
        return output;
    }
}
