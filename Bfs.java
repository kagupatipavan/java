import java.util.LinkedList;
import java.util.*;
public class Bfs {
    private int V;
    private LinkedList<Integer> adj[];
    Bfs(int s){
        V=s;
       adj= new LinkedList[s];
        for(int i=0;i<s;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addedge(int a,int b){
        adj[a].add(b);
    }
    void bfs(int s){
        boolean v[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList();
        v[s]=true;
        queue.add(s);
        while(queue.size()!=0){
            int n=queue.poll();
            v[n]=true;
            System.out.println(n + " ");
            Iterator<Integer> it = adj[n].listIterator();
            while(it.hasNext()){
                int s1=it.next();
                if(!v[s1]){
                    v[s1]=true;
                  queue.add(s1);
                }
            }
        }

    }
    public static void main(String[] args) {
        Bfs g= new Bfs(4);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 2);
        g.addedge(2, 0);
        g.addedge(2, 3);
        g.addedge(3, 3);
        g.bfs(2);
    }
}
