class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int curArea=0;
        int maxArea=0;
        while(left<right)
        {
            int heights=Math.min(height[left],height[right]);
            int width=right-left;
            curArea=heights*width;
            maxArea=Math.max(curArea,maxArea);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxArea;
        
    }
}