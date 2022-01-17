package gui;
import static gui.UserInterface.cards;
import static gui.UserInterface.crd;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.Timer;
import static single.ModesBoard.firstPlayerName;

public class Snake_Game extends JPanel implements ActionListener{
UserInterface ur;
static final int SCREEN_WIDTH = 1000;
static final int SCREEN_HEIGHT = 700;
static final int UNIT_SIZE = 16;
static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
Timer timer;
int DELAY = 80;
final int x[] = new int[GAME_UNITS];
final int y[] = new int[GAME_UNITS];
int bodyParts = 5;
int applesEaten;
int appleX;
int appleY;
char direction = 'R';
boolean running = false;
Random random;
JFrame frame = new JFrame("Snake");
JButton replay = new JButton("Home");
JButton exit2 = new JButton("Exit");
JButton level1 = new JButton("Easy");
JButton level2 = new JButton("Normal");
JButton level3 = new JButton("Hard");
JButton level4 = new JButton("Super");
  public static  JLabel firstPlayerName;
Snake_Game(){

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setResizable(false);
this.setLayout(null);
replay.setBackground(Color.WHITE);
replay.setForeground(Color.BLACK);
replay.setContentAreaFilled(false);
replay.setFocusPainted(false);
replay.setBorderPainted(false);
replay.setFont(new Font("MV Boli",Font.PLAIN,20));
replay.setBounds(995, 540, 102, 50);
firstPlayerName = new JLabel();
 firstPlayerName.setText(gui.UserInterface.LabelName.getText());
exit2.setBackground(Color.WHITE);
exit2.setForeground(Color.BLACK);
exit2.setContentAreaFilled(false);
exit2.setFocusPainted(false);
exit2.setBorderPainted(false);
exit2.setFont(new Font("MV Boli",Font.PLAIN,20));
exit2.setBounds(995, 610, 102, 50);

level1.setBackground(Color.WHITE);
level1.setForeground(Color.BLACK);
level1.setContentAreaFilled(false);
level1.setFocusPainted(false);
level1.setBorderPainted(false);
level1.setFont(new Font("MV Boli",Font.PLAIN,20));

level1.setBounds(995, 150, 102, 40);

level2.setBackground(Color.WHITE);
level2.setForeground(Color.BLACK);
level2.setContentAreaFilled(false);
level2.setFocusPainted(false);
level2.setBorderPainted(false);
level2.setFont(new Font("MV Boli",Font.PLAIN,20));
level2.setBounds(995, 210, 102, 40);

level3.setBackground(Color.WHITE);
level3.setForeground(Color.BLACK);
level3.setContentAreaFilled(false);
level3.setFocusPainted(false);
level3.setBorderPainted(false);
level3.setFont(new Font("MV Boli",Font.PLAIN,20));
level3.setBounds(995, 270, 102, 40);

level4.setBackground(Color.WHITE);
level4.setForeground(Color.BLACK);
level4.setContentAreaFilled(false);
level4.setFocusPainted(false);
level4.setBorderPainted(false);
level4.setFont(new Font("MV Boli",Font.PLAIN,20));
level4.setBounds(995, 320, 102, 40);
this.add(firstPlayerName);
 firstPlayerName.setBounds(995, 90, 102, 40);
firstPlayerName.setFont(new Font("MV Boli",Font.PLAIN,20));

random = new Random();
this.setPreferredSize(new Dimension(1100,688));
this.setBackground(Color.WHITE);
this.setFocusable(true);
this.addKeyListener(new MykeyAdapter());
this.add(replay);
this.add(exit2);
this.add(level1);
this.add(level2);
this.add(level3);
this.add(level4);
frame.add(this);
frame.pack();
frame.setLocationRelativeTo(null);

replay.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){
///////////
if(e.getSource()==replay){
                  frame.dispose();
                UserInterface mm = new UserInterface();
                  mm.setLocationRelativeTo(null);
                  mm.setVisible(true);
                  crd = (CardLayout) cards.getLayout();
                  crd.show(cards,"card4");
              if(firstPlayerName.getText().equals("Guest")){
                     mm.onlineBtn1.setText("LOG IN");
                 }
                 gui.UserInterface.LabelName.setText(firstPlayerName.getText());
            }

}


@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==replay){

replay.setForeground(Color.green);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==replay){

replay.setForeground(Color.BLACK);
}

}

});

exit2.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){

if(e.getSource()==exit2){
System.exit(0);
}
}

@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==exit2){

exit2.setForeground(Color.red);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==exit2){

exit2.setForeground(Color.BLACK);
}

}

});

level1.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){

if(e.getSource()==level1){
frame.dispose();
Snake_Game p = new Snake_Game();
p.setFocusable(true);
p.frame.setVisible(true);

}
}

@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==level1){

level1.setForeground(Color.blue);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==level1){

level1.setForeground(Color.BLACK);
}

}

});

level2.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){

if(e.getSource()==level2){

frame.dispose();
Snake_Game p1 = new Snake_Game();
p1.setFocusable(true);
p1.frame.setVisible(true);
p1.DELAY = 60;
p1.startGame();
}
}

@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==level2){

level2.setForeground(Color.blue);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==level2){

level2.setForeground(Color.BLACK);
}

}

});

level3.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){

if(e.getSource()==level3){
frame.dispose();
Snake_Game p2 = new Snake_Game();
p2.setFocusable(true);
p2.frame.setVisible(true);
p2.DELAY = 40;
p2.startGame();
}
}

@Override
public void mousePressed(MouseEvent e) {}

@Override

public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==level3){

level3.setForeground(Color.blue);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==level3){

level3.setForeground(Color.BLACK);
}

}

});

level4.addMouseListener(new MouseListener(){

public void mouseClicked(MouseEvent e){

if(e.getSource()==level4){
frame.dispose();
Snake_Game p3 = new Snake_Game();
p3.setFocusable(true);
p3.frame.setVisible(true);
p3.DELAY = 20;
p3.startGame();
}
}

@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

@Override
public void mouseEntered(MouseEvent e){

if(e.getSource()==level4){

level4.setForeground(Color.red);
}
}

@Override
public void mouseExited(MouseEvent e){

if(e.getSource()==level4){

level4.setForeground(Color.BLACK);
}

}

});

startGame();

}



public void startGame(){

newApple();
running = true;
timer = new Timer(DELAY,this);
timer.start();
}

public void paintComponent(Graphics g){

super.paintComponent(g);

draw(g);
}
public void draw(Graphics g){

if(running){

    

g.setColor(new Color(150,150,60));
g.fillRect(0, 0, 992, 688);
g.setColor(Color.red);
g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
if(bodyParts%5==0 && bodyParts!=5){

g.fillOval(appleX-2, appleY-2, 2*UNIT_SIZE, 2*UNIT_SIZE);
}

for(int i=0 ; i<bodyParts ; i++){

if(i==0){

g.setColor(Color.green);
g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
}
else{

// g.setColor(Color.green);
g.setColor(new
Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
}
}

g.setColor(Color.BLACK);
g.setFont(new Font("InkFree",Font.BOLD,20));
g.drawString("Score : "+applesEaten, 1003, 30);

}
else{

gameOver(g);
}

}
public void newApple(){

appleX = random.nextInt((int)(976/UNIT_SIZE))*UNIT_SIZE;
appleY = random.nextInt((int)(672/UNIT_SIZE))*UNIT_SIZE;

}
public void move(){

for(int i=bodyParts;i>0;i--){

x[i] = x[i-1];
y[i] = y[i-1];
}

switch(direction){

case 'U':
y[0] = y[0]-UNIT_SIZE;
break;
case 'D':
y[0] = y[0]+UNIT_SIZE;
break;
case 'L':
x[0] = x[0]-UNIT_SIZE;
break;
case 'R':
x[0] = x[0]+UNIT_SIZE;
break;

}

}
public void checkApple(){

   if(x[0]==appleX && y[0]==appleY){
            bodyParts++;
            applesEaten++;
            newApple();
            }
    if(bodyParts%5==0 && bodyParts!=5){
        for(int i=appleX ; i<appleX+2*UNIT_SIZE ; i++){
if(x[0]==i && y[0]==appleY){

            bodyParts++;
            applesEaten+=5;
            newApple();
            }
            }
            for(int i=appleY ; i<appleY+2*UNIT_SIZE ; i++){

            if(x[0]==i && y[0]==appleX){

            bodyParts++;
            applesEaten+=5;
            newApple();
            }
            }
}

}
public void checkCollision(){

for(int i=bodyParts ; i>0 ; i--){

if((x[0]==x[i])&&(y[0]==y[i])){

running = false;
}
}
if(x[0]<0){

x[0]=976;
}
if(x[0]>976){

x[0]=0;
}
if(y[0]<0){

y[0]=672;
}
if(y[0]>672){

y[0]=0;
}

if(!running){

timer.stop();
}

}
public void gameOver(Graphics g){

            g.setColor(Color.GRAY);
            g.fillRect(0, 0, 992, 688);
            g.setColor(Color.red);
            g.setFont(new Font("InkFree",Font.BOLD,75));
            FontMetrics metrics2 = getFontMetrics(g.getFont());
            g.drawString("GAME OVER", (SCREEN_WIDTH-metrics2.stringWidth("GAMEOVER"))/2, SCREEN_HEIGHT/2);

            g.setColor(Color.WHITE);
            g.setFont(new Font("InkFree",Font.BOLD,40));
            FontMetrics metrics1 = getFontMetrics(g.getFont());

            g.drawString("SCORE :"+applesEaten,(SCREEN_WIDTH-
            metrics1.stringWidth("SCORE :"+applesEaten))/2, g.getFont().getSize());

            g.setColor(Color.BLACK);
            g.setFont(new Font("InkFree",Font.BOLD,20));
            g.drawString("Score :"+applesEaten, 1003, 30);

            }

@Override
public void actionPerformed(ActionEvent e) {
    if(running){

            move();
            checkApple();
            checkCollision();
}

repaint();
}

public class MykeyAdapter extends KeyAdapter {

public void keyPressed(KeyEvent e) {
switch(e.getKeyCode()){

case KeyEvent.VK_LEFT:
if(direction !='R'){

direction = 'L';
}
break;
}
switch(e.getKeyCode()){

case KeyEvent.VK_RIGHT:
if(direction !='L'){

direction = 'R';
}
break;
}
switch(e.getKeyCode()){

case KeyEvent.VK_UP:
if(direction !='D'){

direction = 'U';
}
break;
}
switch(e.getKeyCode()){

case KeyEvent.VK_DOWN:
if(direction !='U'){

direction = 'D';
}
break;
}
}
}

}


