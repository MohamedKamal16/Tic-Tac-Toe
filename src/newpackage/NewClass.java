

package newpackage;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class NewClass implements ActionListener{
   // Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
     int XOCounter ;
     int firstPlayer;
     int secondPlayer;
     
    // requestTypes.player1.name() ="X";
      boolean player1_turn=false;
      boolean player1_win = false ;
      boolean player2_win= false ;
      boolean Tie=false; 



	NewClass(){

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);

		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
		for(int i=0;i<9;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
                

		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		firstTurn();
	}

    public void firstTurn() {
                textfield.setText("X turn");
                player1_turn=true;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
            if( player1_win==false && player2_win==false && Tie==false)
            {
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
                            //turn
                           
				if(player1_turn ) {
					if(buttons[i].getText()=="") {
                                            //set x color
						buttons[i].setForeground(new Color(255,0,0));
                                             	buttons[i].setText("X");
                                                XOCounter++;
						player1_turn=false;
						textfield.setText("O turn");
						check();
                                        }
				}
                                else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
                                                 XOCounter++;
						player1_turn=true;
						textfield.setText("X turn");
						check();
                                        }
				}
                         
			}
                      
		}
            } 
	}

	
             
	
    public void play(){}
	

	public void check() {
                String b0=buttons[0].getText();
                String b1=buttons[1].getText();
                String b2=buttons[2].getText();
                String b3=buttons[3].getText();
                String b4=buttons[4].getText();
                String b5=buttons[5].getText();
                String b6=buttons[6].getText();
                String b7=buttons[7].getText();
                String b8=buttons[8].getText();
		if(
                      ((b0.equals("X")) &&(b1.equals("X")) &&(b2.equals("X")))
                   ||((b3.equals("X")) &&(b4.equals("X")) &&(b5.equals("X")))
                   ||((b6.equals("X")) &&(b7.equals("X")) &&(b8.equals("X")))
                   ||((b0.equals("X")) &&(b3.equals("X")) &&(b6.equals("X")))   
                   ||((b1.equals("X")) &&(b4.equals("X")) &&(b7.equals("X")))
                   ||((b2.equals("X")) &&(b5.equals("X")) &&(b8.equals("X")))
                   ||((b0.equals("X")) &&(b4.equals("X")) &&(b8.equals("X")))
                   ||((b2.equals("X")) &&(b4.equals("X")) &&(b6.equals("X")))
                        
                        ) { 
                    System.out.println("X win");
                    player1_win = true;
                     for(int i=0;i<9;i++)
                         buttons[i].setEnabled(false);
                        //send x win
                        
                        }
                else if(
                      ((b0.equals("O")) &&(b1.equals("O")) &&(b2.equals("O")))
                   ||((b3.equals("O")) &&(b4.equals("O")) &&(b5.equals("O")))
                   ||((b6.equals("O")) &&(b7.equals("O")) &&(b8.equals("O")))
                   ||((b0.equals("O")) &&(b3.equals("O")) &&(b6.equals("O")))   
                   ||((b1.equals("O")) &&(b4.equals("O")) &&(b7.equals("O")))
                   ||((b2.equals("O")) &&(b5.equals("O")) &&(b8.equals("O")))
                   ||((b0.equals("O")) &&(b4.equals("O")) &&(b8.equals("O")))
                   ||((b2.equals("O")) &&(b4.equals("O")) &&(b6.equals("O")))
                        
                        ) { 
                      System.out.println("O win");
                      player2_win= true;
                      for(int i=0;i<9;i++)
                          buttons[i].setEnabled(false);
                       //isGameEnds=true;  
                        //send o win
                }
                else{
                    if(XOCounter==9){
                    System.out.println("tie");
                     Tie=true;
                     for(int i=0;i<9;i++)
                              buttons[i].setEnabled(false);
                    //send tie win
                }
                }
 
	}

	
//game end
	

}