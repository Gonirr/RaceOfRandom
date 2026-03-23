package DataStructures;
public class test {
    public static void main(String[] args) {
        GraphList g=new GraphList(4,4);
        g.addEdge(1, 2, 9);
        g.addEdge(1, 0, 3);
        //System.out.println(g.toString());
        int i=(int)(Math.random()*11+1);
        System.out.println(i);
    }
    
}
