package Graph.DisjointSet;

public class DisjointSet {
    int[] root;
    int [] rank;
    public DisjointSet(int size){
       root=new int[size];
       rank=new int[size];
       for(int i=0;i<size;i++){
           root[i]=i;
           rank[i]=1;
       }
    }
    public int find(int x){
        if(root[x]==x){
            return x;
        }
        return root[x]=find(root[x]);
    }
    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX!=rootY){
            if(rank[rootX]>rank[rootY]){
                root[rootY]=rootX;
            }
            else if(rank[rootY]>rank[rootX]){
                root[rootX]=rootY;
            }
            else{
                root[rootY]=rootX;
                rank[rootX]+=1;
            }
        }

    }
    public boolean isConnected(int x,int y){
        return find(x)==find(y);
    }
}
