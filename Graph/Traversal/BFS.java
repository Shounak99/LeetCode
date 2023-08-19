class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] isVisited=new boolean[V];
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(0);
        isVisited[0]=true;
        ArrayList<Integer> res=new ArrayList<>();
        while(!bfs.isEmpty()){
            int current=bfs.poll();
            res.add(current);

            for(Integer node:adj.get(current)){
                if(!isVisited[node]){
                    isVisited[node]=true;
                    bfs.add(node);
                }
            }
        }
        return res;
    }
}