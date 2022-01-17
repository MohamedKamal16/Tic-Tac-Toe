package multiple;

import design.ButtonDesign;
import gui.UserInterface;
import static gui.UserInterface.cards;
import static gui.UserInterface.crd;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class WelcomMultiple  extends JFrame {
    
    JPanel parentPanal;
    JButton btnStart;
    JLabel backImage;
    public static JLabel firstPlayerName;
    public static TextField textFiledName;
     UserInterface mm;
    private void createGamePage() {
        
        parentPanal = new JPanel(null);
        parentPanal.setBackground(new Color(51,0,102));
        btnStart = new ButtonDesign();
        btnStart.setText("Start");
        parentPanal.add(btnStart);
        btnStart.setBounds(325, 300, 200,35);
      
        firstPlayerName = new JLabel();
        firstPlayerName.setText(gui.UserInterface.LabelName.getText()); 
        
        backImage = new JLabel();      
        ImageIcon imageIconBack = new ImageIcon(getClass().getResource("/images/back_2.png"));
     
        backImage.setIcon(imageIconBack);
        parentPanal.add(backImage);
        backImage.setBounds(20, 20, 32, 32);
        
        
       
        textFiledName = new TextField();
        parentPanal.add(textFiledName);
        textFiledName.setBounds(325, 250, 200,30);
        textFiledName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        textFiledName.setForeground(new java.awt.Color(153, 153, 153));
        textFiledName.setText("Player Name");
        
        parentPanal.add(firstPlayerName);
        firstPlayerName.setBounds(70, 5, 64, 64);
        firstPlayerName.setForeground(Color.WHITE);
        firstPlayerName.setFont(new Font("Arial", Font.PLAIN, 15));
        
    }
    
    public WelcomMultiple() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        createGamePage();
        
        CardLayout card = new CardLayout();
        Container container = getContentPane();
        container.setLayout(card);  
        add(parentPanal);
        container.getLayout().addLayoutComponent("gamePage", parentPanal);
        
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFiledName.getText() == ""){
                    System.out.println("Please Enter name");
                }else{
                    
                    new MultipleBoard().setVisible(true);
                    setVisible(false);
                
                }
               
                
            }
        });
        textFiledName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textFiledName.setText("");
            }
        });
        
         backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                  dispose();
                  mm = new UserInterface();
                  mm.setLocationRelativeTo(null);
                  mm.setVisible(true);
                  crd = (CardLayout) cards.getLayout();
                  crd.show(cards,"card4");
                   if(firstPlayerName.getText().equals("Guest")){
                     mm.onlineBtn1.setText("LOG IN");
                 }
                 gui.UserInterface.LabelName.setText(firstPlayerName.getText());
                  dispose();
            }
        });

        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    
    
    }
    
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WelcomMultiple();
            }
        });
    }
    
    
     
}
