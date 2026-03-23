package DataStructures;

public class ArrayQueue<T>{
    //ım using array queue since the car num is constant

    private T[] q;//private
    int first=0;//index of first in the queue
    int last=0;//index of last in the queue
    //if there is one element last and first will show the same element
    //this is not how the prof implemented it (last being the next empty space)
    int N=0;// number of elements

    public ArrayQueue(int capacity){
        q= (T[]) new Object[capacity];// casting object as a (T[]) type
        //cast is needed bcuz there is no generic array creation in java
    }

    public boolean isEmpty(){
        if(N==0){
            return true;
        }
        return false;
    }

    public void enque(T data){
        if(isEmpty()==true){
            q[0]= data;
            
        }
        else{
            if(last==q.length){
                last=-1;
                //if last is at the end of the array, make it -1 so when last++ it becomes 0
            }
            q[last++]=data;
        }
        System.out.println("enque");
        N++;
    }

    public T deque(){
        if(isEmpty()==true){
            return null;
        }
        T data=q[first];
        q[first]=null;
        if(first==q.length){first=0;}//wraping around the array
        else{first++;}
        N--;
        System.out.println("deque");
        return data;
    }



}