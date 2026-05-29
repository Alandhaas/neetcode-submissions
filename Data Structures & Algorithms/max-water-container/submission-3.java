class Solution {
    public int maxArea(int[] heights) {
        int startIndex = 0;
        int endIndex = heights.length - 1;
        int mostWater = 0;

        while(startIndex < endIndex){
            int currentMost = (endIndex -startIndex) * Math.min(heights[startIndex], heights[endIndex]);
            mostWater = Math.max(mostWater, currentMost);
            if(heights[startIndex] > heights[endIndex]){
                endIndex--;
            }else startIndex++;
        }
        return mostWater;
    }
}
