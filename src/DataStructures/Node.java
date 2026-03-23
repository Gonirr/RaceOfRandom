package DataStructures;
public class Node <T>{
    T data;
    Node next;
    
    Node(T data){
        this.data=data;
        next=null;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    
}
