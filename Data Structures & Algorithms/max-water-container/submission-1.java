class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ;
        int right = heights.length-1;
        int maxi =0;

        while(left<right){
            int h = Math.min(heights[left],heights[right]);
            int w = right-left;

            maxi = Math.max(w*h,maxi);

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
