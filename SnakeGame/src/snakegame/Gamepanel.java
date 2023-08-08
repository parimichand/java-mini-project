package snakegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Gamepanel extends JPanel implements ActionListener{
    static final int SCREEN_WIDTH=600;
    static final int SCREEN_HEIGHT=600;
    static final int UNITSIZE =25;
    static final int GAME_UNITS =(SCREEN_WIDTH*SCREEN_HEIGHT)/UNITSIZE;
    static final int DELAY = 999;
    private static final long serialVersionUID = 1L;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyparts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char Direction ='R';
    boolean running =false;
    Timer timer;
    Random random;
          
      Gamepanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_HEIGHT,SCREEN_WIDTH));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startgame();
    }
    public void startgame(){
       newapple();
       running = true;
       timer = new Timer(DELAY, this);
       timer.start();
    }


    public void paintComponent(Graphics g){
       super.paintComponent(g);
       draw(g);
    }
    public void draw(Graphics g){
      if(running){
        for(int i=0;i<SCREEN_HEIGHT/UNITSIZE;i++){
            g.drawLine(i*UNITSIZE,0,i*UNITSIZE,SCREEN_HEIGHT);
            g.drawLine(0,i*UNITSIZE,SCREEN_WIDTH,i*UNITSIZE);
              }
    
              g.setColor(Color.red);
               g.fillRect(appleX,appleY, UNITSIZE,UNITSIZE);
        
        
        
        for(int i = 0;i<bodyparts;i++ ){
           if(i==0){
                g.setColor(Color.green);
                g.fillRect(x[i], y[i],UNITSIZE,UNITSIZE);
                
                  }
           else{
                   g.setColor(Color.green);
                   g.fillRect(x[i], y[i],UNITSIZE,UNITSIZE);  
               
            }
        }
    }
       else{
        
        gameOver(g);
        }    
 }
    public void newapple(){
        appleX=random.nextInt((int)(SCREEN_WIDTH/UNITSIZE))*UNITSIZE;
        appleY=random.nextInt((int)(SCREEN_HEIGHT/UNITSIZE))*UNITSIZE;
    }
    public void move(){
        for(int i=bodyparts;i>0;i--){
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        
        switch(Direction){
            case 'U' -> y[0]=UNITSIZE-y[0];
            case 'D' -> y[0]=UNITSIZE+y[0];
            case 'L' -> x[0]=UNITSIZE-x[0];
            case 'R' -> x[0]=UNITSIZE+x[0];   
               
            
        }    
        
    }
    public void checkApple(){
        if((x[0]==appleX && y[0]==appleY)){
            bodyparts++;
            applesEaten++;
            newapple();
         }
        
    }      
     
    public void Checkcollisions(){
        for(int i=bodyparts;i>0;i--){
       if((x[0]==x[i])&&(y[0]==y[i])) {
           running =false;
       }    
    }
        if(x[0]<0){
        running=false;
        }
         if(x[0]>SCREEN_WIDTH){
        running=false;
        }
        if(y[0]<0){
        running=false;
        }
        if(y[0]>SCREEN_HEIGHT){
        running=false;
        }
        if(!running){
            timer.stop();
        }
          
    }
    public void gameOver(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics = getFontMetrics(g.getFont());

g.drawString("game over",(SCREEN_WIDTH-metrics.stringWidth("gameove"))/2,SCREEN_HEIGHT/2);
    }
    @Override
    public void actionPerformed(ActionEvent e){
      if(running){
         move();
         checkApple();
         Checkcollisions();
     }
      repaint();
}
   public class MyKeyAdapter extends  KeyAdapter {
       @Override
       public void keyPressed(KeyEvent e){
           switch(e.getKeyCode()){
               case KeyEvent.VK_LEFT -> {
                   if(Direction!='R'){
                       Direction='L';
                       
                   }
               }
               case KeyEvent.VK_RIGHT -> {
                   if(Direction!='L'){
                       Direction='R';
                       
                   }
               }
               case KeyEvent.VK_UP -> {
                   if(Direction!='D'){
                       Direction='U';
                   } }
             
             case KeyEvent.VK_DOWN -> {
                 if(Direction!='U'){
                     Direction='D';
                 } }
           }
       }
   }
    

}
