class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1;
        int q=n-1;
        int r=m+n-1;
        while(p>=0 && q>=0)
        {
            if(nums1[p]>nums2[q])
            {
                int temp=nums1[p];
                nums1[p]=nums1[r];
                nums1[r]=temp;
                p--;
                r--;
            }
            else
            {
                int temp=nums2[q];
                nums2[q]=nums1[r];
                nums1[r]=temp;
                q--;
                r--;
            }
        }
        while(q>=0)
        {
            int temp=nums2[q];
            nums2[q]=nums1[r];
            nums1[r]=temp;
            q--;
            r--;
        }
        
    }
}