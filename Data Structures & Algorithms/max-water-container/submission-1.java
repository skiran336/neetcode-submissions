class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        while(l < r){
            int w = r - l;
            int h = Math.min(heights[l], heights[r]);
            int curr = w * h;
            res = Math.max(curr, res);
            if(heights[l] < heights[r]){
                l++;
            }
            else if(heights[l] > heights[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        return res;
        
    }
}
