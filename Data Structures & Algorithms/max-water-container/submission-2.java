class Solution {
    public int maxArea(int[] heights) {
        int startIndex = 0;
        int endIndex = heights.length - 1;
        int mostWater = 0;

        for(int i = startIndex; i < endIndex; i++) {

            int lowestBar = Math.min(heights[i], heights[endIndex]);
            int currentMost = lowestBar * (endIndex - i);
            if(currentMost > mostWater) {
                mostWater = currentMost;
            }

            if(i == (endIndex - 1)) {
                i = 0;
                endIndex = endIndex - 1;
            }
        }
        return mostWater;
    }
}
