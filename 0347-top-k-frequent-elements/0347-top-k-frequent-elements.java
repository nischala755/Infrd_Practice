class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[n+1];
        for(int num : map.keySet())
        {
            int freq=map.get(num);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] result=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0 && idx<k;i--)
        {
            if(bucket[i]!=null)
            {
            for(int num : bucket[i])
            {
                result[idx++]=num;
            }
            if(idx==k) return result;
            }
        }
        return result;

        
    }
}