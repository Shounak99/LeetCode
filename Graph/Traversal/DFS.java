class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            adjList.get(v1).add(v2);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        return bfs(adjList,q,source,destination);
    }
    public boolean bfs(List<List<Integer>> adjList,Queue<Integer> q,int source,int destination){

        while(!q.isEmpty()){
            int v=q.remove();
            if(v==destination){
                return true;
            }
            for(int i=0;i<adjList.get(v).size();i++){
                if(adjList.get(v).get(i)==destination){
                    return true;
                }
                q.add(adjList.get(v).get(i));
            }
            if(bfs(adjList,q,source,destination)){
                return true;
            }
        }
        return false;
    }
}