package DataStructures;
public class Edge {
    
    private int v1;
    private int v2;
    private int weigth;
    
    Edge (int v1,int v2,int weight){
        this.v1=v1;
        this.v2=v2;
        this.weigth=weight;
    }
    
    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    public int getWeigth() {
        return weigth;
    }
    
    @Override
    public String toString(){
        return "("+v1+","+v2+") "+weigth;
    }
}
