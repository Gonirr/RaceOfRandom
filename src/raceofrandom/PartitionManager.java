package raceofrandom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PartitionManager {
    
    Partition partitions[][];
    int x;
    int y;
    GamePanel gp;
    
    PartitionManager(GamePanel gp){
        this.y=gp.carNum;
        this.x=gp.weightSum;
        partitions=new Partition[x][y];
        this.gp=gp;
        for(int i=0;i<x;i++){
            for(int k=0;k<y;k++){
                partitions[i][k]=new Partition(gp.pLength);
            }
        }
    }
    
    public void drawBackground (Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        
        for(int i=0;i<gp.cars.length;i++){
            int length=gp.pLength;
            if(gp.kl.Continue==true){
                int newRoad=length*gp.cars[i].chooseRandomCheckpoint(gp.racetrack);
                gp.cars[i].newRoad=newRoad;
                gp.cars[i].road+=newRoad;
            }
            for(int x=0;x<gp.cars[i].road-gp.startX;x+=length){
                int y=gp.carPlacement*(i+1)-(length/2);
                if(gp.cars[i].road>x+length){
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(gp.startX+x, y, length, length);
                }
                if(gp.cars[i].road==x+length){
                    g2d.setColor(Color.DARK_GRAY);
                    g2d.fillRect(gp.startX+x, y, length, length);
                    g2d.setColor(Color.red);
                    g2d.drawString(""+gp.cars[i].currentV, gp.startX+x+(length/2), y+(length/2));
                }
            }
        }
        
    }
    
}
