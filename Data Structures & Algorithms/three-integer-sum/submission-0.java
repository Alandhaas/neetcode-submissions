class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            // Sort the array so duplicates are adjacent and two pointers can be used.
            // Iterate through the array, nums[i] is the first element.
            // Skip duplicate first elements to avoid duplicate triplets.
            // Use two pointers (j and k) to find the remaining two numbers.
            // If the sum is 0, add the triplet.
            // Skip duplicate values for j and k before moving the pointers.
            // If the sum is too small, move j right to increase the sum.
            // If the sum is too large, move k left to decrease the sum.

            Arrays.sort(nums);

            List<List<Integer>> ls = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if (sum < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }

            return ls;
    }
}