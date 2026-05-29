class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = numbers.length - 1;

        //1,0 2,1 3,2 4,3
        
        while (left <= right) {
            if (!map.containsKey(numbers[left])) {
                map.put(numbers[left], left);
            }
            if (!map.containsKey(numbers[right])) {
                map.put(numbers[right], right);
            }
            if (map.containsKey(target - numbers[left])) {
                int min = Math.min(left + 1, map.get(target - numbers[left]) + 1);
                int max = Math.max(left + 1, map.get(target - numbers[left]) + 1);
                if(min != max) {
                    return new int[]{min, max};   
                }
            }
            if (map.containsKey(target - numbers[right])) {
                int min = Math.min(map.get(target - numbers[right]) + 1, right + 1);
                int max = Math.max(map.get(target - numbers[right]) + 1, right + 1);
                if(min != max) {
                    return new int[]{min, max};   
                }     
            }

            left++;
            right--;
        }
        return new int[]{0,0};    
    }
}
