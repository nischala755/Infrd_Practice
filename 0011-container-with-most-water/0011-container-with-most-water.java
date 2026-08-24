class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        //2 pointer approach
        int cur_area=0;
        int max_area=0;
        int width=0;
        while(left<=right)
        {
            int heights=Math.min(height[left],height[right]);//choose the minimum height represented by the 2 pointers
            width=right-left;
            cur_area=heights*width;
            max_area=Math.max(max_area,cur_area);
            if(height[left]<height[right]) left++;
            else right--;
            //move the 2 pointers

        }
        return max_area;//return the maximum area
        
    }
}