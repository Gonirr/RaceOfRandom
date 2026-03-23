package DataStructures;

public class ArrayQueue<T>{
    //using array queue since the car num is constant
    private T[] q;//private
    int first;//index of first in the queue
    int last;//index of last in the queue
    int N=0;// number of elements

    public ArrayQueue(int capacity){
        q= (T[]) new Object[capacity];// casting object as a (T[]) type
    }

}