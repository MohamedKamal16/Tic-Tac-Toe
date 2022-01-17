/*package tic.tac.toe;

import design.ButtonDesign;
import gui.UserInterface;
//import gui.UserInterface;
import multiple.WelcomMultiple;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import single.ModesBoard;  

/**
 *
 * @author Ebrah
 *//*
public class TicTacToe extends JFrame {

    JPanel parentPanal,buttonPanal,gifPanal;
    JButton btnSingle,btnMultiple;
    public  static JButton btnPlayerProfile;
    public static JButton btnOnline;
    JLabel boardBackground,LabelName;
    public javax.swing.JPanel cards; 
    
          
    private void createGamePage() {
        
        parentPanal = new JPanel(null);
        
        buttonPanal = new JPanel(null);
        gifPanal = new JPanel(null);

        btnPlayerProfile = new JButton("PP");
        
        btnSingle = new ButtonDesign();
        btnSingle.setText("One Player");
        
        LabelName = new JLabel("Gust");
        
        
        
        btnMultiple = new ButtonDesign();
        btnMultiple.setText("Two Players");
        
        btnOnline = new ButtonDesign();
        btnOnline.setText("Online");
        boardBackground = new JLabel();
        
        ImageIcon fillingIcon = new ImageIcon(getClass().getClassLoader().getResource("images/image.png"));
        boardBackground.setIcon(fillingIcon);
        
        parentPanal.add(buttonPanal);
        parentPanal.add(gifPanal);
        
        buttonPanal.add(btnSingle);
        buttonPanal.add(btnMultiple);
        buttonPanal.add(btnOnline);
        
        
        buttonPanal.setBounds(450, 0, 850, 550);
        gifPanal.setBounds(0, 0, 450, 550);
        gifPanal.add(boardBackground);
        
        btnSingle.setBounds(100, 160, 200,40);
        btnMultiple.setBounds(100, 220, 200,40);
        btnOnline.setBounds(100, 280, 200,40);
        boardBackground.setBounds(60,0,450,500);
        
        gifPanal.add(btnPlayerProfile);
        btnPlayerProfile.setBounds(30,30, 50, 50);
        
       gifPanal.add(LabelName);
        LabelName.setBounds(85,30, 50, 50);
        
        gifPanal.setBackground(new Color(214, 229, 250));
        buttonPanal.setBackground(new Color(214, 229, 250));
        
       
    }
    public TicTacToe() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        createGamePage();
        
        CardLayout card = new CardLayout();
        Container container = getContentPane();
        container.setLayout(card);  
        add(parentPanal);
        container.getLayout().addLayoutComponent("gamePage", parentPanal);
        
        btnSingle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               new ModesBoard().setVisible(true);
                setVisible(false);
                
            }
        });
        
        btnMultiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
              new WelcomMultiple().setVisible(true);
              setVisible(false);
   
                
            }
        });
        
        btnPlayerProfile.addActionListener((ActionEvent e) -> {
             new UserInterface().crd.show(cards,"card3");
            
        });

        
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
    
        new TicTacToe().setVisible(true);
        
        
    }  
    
    
}*/
