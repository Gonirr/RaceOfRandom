package DataStructures;
public class LinkedList<T> {
    private Node first;
    private Node last;
    private int nodeNum=0;
    
    LinkedList(){
        first=null;
        last=null;
    }
    
    public void addLast(T data){
        Node n=new Node(data);
        if(last==null){
            first=n;
            last=n;
        }
        else{
            last.next=n;
            last=last.next;
        }
        nodeNum++;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
    
    
    @Override
    public String toString(){
        String s="";
        Node n=first;
        while(n!=null){
            s=s.concat(n.data+"->");
            n=n.next;
        }
        s=s.concat("null");
        return s;
    }

    public int getNodeNum() {
        return nodeNum;
    }
    
}
