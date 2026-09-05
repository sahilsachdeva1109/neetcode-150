class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ;
        int right = heights.length-1;
        int maxi =0;

        while(left<right){
            int w = right-left;
            int h = Math.min(heights[left],heights[right]);

            int area = w*h;
            maxi = Math.max(area,maxi);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}
