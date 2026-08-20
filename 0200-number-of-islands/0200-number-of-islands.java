class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                if(grid[r][c]=='1')
                {
                    count++;
                      dfs(grid,r,c);
                }
                
            }
          
    
        }
    return count;
    }
    public void dfs(char[][] grid,int r,int c)
    {
        int rows=grid.length;
        int cols=grid[0].length;
        if(r<0||r>=rows||c<0||c>=cols) return;
        if(grid[r][c]=='0') return;
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
}