class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    private void dfs(List<List<Integer>>res,List<Integer>path,int[] cand,int target,int start)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<cand.length;i++)
        {
            if(target-cand[i]<0) break;
            path.add(cand[i]);
            dfs(res,path,cand,target-cand[i],i);
            path.remove(path.size()-1);
        }
    }
}