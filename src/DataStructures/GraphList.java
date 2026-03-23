package DataStructures;
public class GraphList {
    private int V;
    private int E;
    private LinkedList<Edge> adj[];
    static int weightSum=0;
    
    public GraphList(int V,int E){
        this.V=V;
        this.E=E;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i]=new LinkedList();
        }
    }    
    
    public void addEdge(int v1,int v2,int weight){
        Edge e1=new Edge(v1,v2,weight);
        adj[v1].addLast(e1);
        Edge e2=new Edge(v2,v1,weight);
        adj[v2].addLast(e2);
        weightSum+=weight;
    }
    
    @Override
    public String toString(){
        String s="";
        for(int i=0;i<adj.length;i++){
            s=s.concat(i+": "+adj[i].toString()+"\n");
        }
        return s;
    }

    public LinkedList<Edge>[] getAdj() {
        return adj;
    }

    public static int getWeightSum() {
        return weightSum;
    }
    
}
