package raceofrandom;
import DataStructures.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Car{
    static int ID=0;
    final int speed=15;
    public Rectangle r;
    int currentV=0;
    int road=0;
    int newRoad=0;
    int length;
    int x;
    int y;
    
    Car(int x, int y,int length) {
        this.x=x;
        this.y=y;
        this.length=length;
        r=new Rectangle(x,y,length,length);
        ID++;
    }
    
    public int chooseRandomCheckpoint(GraphList g){
        LinkedList<Edge> adj[]=g.getAdj();
        Node n=adj[currentV].getFirst();
        
        int randomNum=(int)(Math.random()*adj[currentV].getNodeNum()+1);
        for(int i=1;i<randomNum;i++){
            n=n.getNext();
        }
        Edge e=(Edge)n.getData();
        currentV=e.getV2();
        return e.getWeigth();
    }
    
    public void drawCar(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(r);
    }
    
    public void setX(int startX){
        if(road>=x+length){//+length
            x+=speed;
        }
        //System.out.println("x="+x+" road="+road);
        r.setLocation(x+startX, y);
    }
    
    /*
    @Override
    public void run() {
        while(true==true){
            int time=(newRoad/speed)*1000;
            x+=speed;
        }
    }
    */
}
