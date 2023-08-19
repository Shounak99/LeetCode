class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> res=new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        dfs(adj,0,new HashSet<>());
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int V,Set<Integer> isVisited){
        if(isVisited.contains(V)){
            return ;
        }
        res.add(V);
        isVisited.add(V);
        for(Integer node:adj.get(V)){
            dfs(adj,node,isVisited);
        }
    }
}