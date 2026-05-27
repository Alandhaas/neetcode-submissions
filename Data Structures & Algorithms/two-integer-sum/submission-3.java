class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hs = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if(hs.containsKey(rest)) {
                return new int[]{hs.get(rest), i};
            }
            hs.put(nums[i], i);
        }
        return new int[-1];
    }
}
