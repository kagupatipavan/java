import java.util.LinkedList;


import java.util.*;
public class Dfs {

    private int V;
    private LinkedList<Integer> adj[];
    @SuppressWarnings("unchecked")Dfs(int s){
        V=s;
        adj=new LinkedList[s];
        for(int i=0;i<s;i++){
            adj[i]=new LinkedList<>();
        }
    }
    void addedge(int a,int b){
        adj[a].add(b);
    }
    void Dfsutil(int v){
        boolean a[]=new boolean[V];
        DFS(v,a);
    }
    void DFS(int v,boolean a[]){
        a[v]=true;
        System.out.println(v + " ");
        Iterator<Integer> n=adj[v].listIterator();
        while(n.hasNext()){
            int n1=n.next();
            if(!a[n1]){
                DFS(n1,a);
            }
        }

    }
    public static void main(String[] args) {
        Dfs g= new Dfs(4);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 2);
        g.addedge(2, 0);
        g.addedge(2, 3);
        g.addedge(3, 3);
        g.Dfsutil(2);
    }
}
