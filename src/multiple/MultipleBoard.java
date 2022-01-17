package multiple;

import design.ButtonDesign;
import gui.UserInterface;
import static gui.UserInterface.cards;
import static gui.UserInterface.crd;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class MultipleBoard extends JFrame {

    JPanel parentPanal, gamePanal, gameParentPanal, gameInfoPanal;
    JLabel[] arrayOfLabals;
    JLabel boardBackground, secondPlayerName, imageRecording,
            firstPlayerScore, secondPlayerScore, playerImage, computerImage, backImage,vsImage,selectMode,savedIcon,recordIcon,textHistory,tieScore;
    JButton btnRestart;
    int XOCounter = 0;
   public static JLabel firstPlayerName;
    boolean isFirstPlayerTurn = true;
    boolean isGameEnds = false;
    
    ////////////////////////////////////////////
     boolean record = false;
     LinkedHashMap<Integer, String> moves = new LinkedHashMap<>();
     public static File localFile;
     
     //record
        public static  String dataLocl;
        static Socket socket;
        static DataInputStream dataInputStream;
        static DataOutputStream dataOutputStream;
        
    ////////////////////////////////////////////    
        
        //// create gui of game 

    private void createGamePage() {

        parentPanal = new JPanel(null);
        gameParentPanal = new JPanel(null);     
        gameInfoPanal = new JPanel(null);
   
        firstPlayerScore = new JLabel("0", JLabel.CENTER);
        secondPlayerScore = new JLabel("0", JLabel.CENTER);
        tieScore = new JLabel("0", JLabel.CENTER);
        gamePanal = new JPanel(new GridLayout(3, 3, 8, 8));
        arrayOfLabals = new JLabel[9];
        btnRestart = new ButtonDesign();
        btnRestart.setText("Restart");

        boardBackground = new JLabel();
        imageRecording = new JLabel();
        backImage = new JLabel();
        selectMode = new JLabel("Multiple");
       
        playerImage = new JLabel();
        
        computerImage = new JLabel();
        
        vsImage = new JLabel();
        
        
        
        recordIcon = new JLabel();
               
        savedIcon = new JLabel();
        textHistory = new JLabel("History");
        
        firstPlayerName = new JLabel();
        firstPlayerName.setText(gui.UserInterface.LabelName.getText());
        secondPlayerName = new JLabel();
        secondPlayerName.setText(WelcomMultiple.textFiledName.getText());

        ImageIcon imageIconBoard = new ImageIcon(getClass().getClassLoader().getResource("images/board_1.png"));
        boardBackground.setIcon(imageIconBoard);

        ImageIcon imageIconPlayer = new ImageIcon(getClass().getClassLoader().getResource("images/player_image.png"));
        playerImage.setIcon(imageIconPlayer);

        ImageIcon imageIconComputer = new ImageIcon(getClass().getClassLoader().getResource("images/player_image.png"));
        computerImage.setIcon(imageIconComputer);

        ImageIcon imageIconBack = new ImageIcon(getClass().getClassLoader().getResource("images/back_2.png"));
        backImage.setIcon(imageIconBack);

        ImageIcon imageIconRecording = new ImageIcon(getClass().getClassLoader().getResource("images/record.png"));
        imageRecording.setIcon(imageIconRecording);
        
        ImageIcon imageIconVS = new ImageIcon(getClass().getClassLoader().getResource("images/vs.png"));
        vsImage.setIcon(imageIconVS);
        
        ImageIcon imageIconSaved = new ImageIcon(getClass().getClassLoader().getResource("images/save.png"));
        savedIcon.setIcon(imageIconSaved);
        
        ImageIcon imageIconRecord = new ImageIcon(getClass().getClassLoader().getResource("images/recorded.png"));
        recordIcon.setIcon(imageIconRecord);
        recordIcon.setVisible(false);
     

        for (int i = 0; i < arrayOfLabals.length; i++) {
            arrayOfLabals[i] = new JLabel("", JLabel.CENTER);
            arrayOfLabals[i].setFont(new Font("Verdana", Font.BOLD, 0));
            arrayOfLabals[i].setBackground(Color.cyan);
            arrayOfLabals[i].setName(""+i);
            gamePanal.add(arrayOfLabals[i]);
        }

        // panal for game
        parentPanal.add(gameParentPanal);
        gameParentPanal.setBackground(new Color(214, 229, 250));
        gameParentPanal.add(boardBackground);
        boardBackground.setBounds(75, 120, 300, 300);

        gameParentPanal.setBounds(0, 0, 450, 550);
        gameParentPanal.add(gamePanal);
        gamePanal.setBounds(75, 120, 300, 300);
        gamePanal.setBackground(null);
        
        gameParentPanal.add(selectMode);
        selectMode.setBounds(200, 10, 100, 100);
        selectMode.setForeground(new Color(255, 128, 134));
        selectMode.setFont(new Font("Arial", Font.BOLD, 20));
       

        gameParentPanal.add(backImage);
        backImage.setBounds(20, 20, 32, 32);

        gameParentPanal.add(imageRecording);
        imageRecording.setBounds(380, 20, 64, 64);
        
        //recorded icon
        gameParentPanal.add(recordIcon);
        recordIcon.setBounds(350, 5, 64, 64);

        // panal for informaton 
        parentPanal.add(gameInfoPanal);
        gameInfoPanal.setBackground(new Color(255, 249, 249));
        gameInfoPanal.setBounds(450, 0, 850, 550);

        gameInfoPanal.add(savedIcon);
        savedIcon.setBounds(270, 300, 64, 64);
        
        gameInfoPanal.add(textHistory);
        textHistory.setBounds(280, 340, 64, 64);

        gameInfoPanal.add(btnRestart);
        btnRestart.setBounds(80, 450, 250, 30);
   
        gameInfoPanal.add(playerImage);
        playerImage.setBounds(70, 50, 50, 50);

        gameInfoPanal.add(computerImage);
        computerImage.setBounds(270, 50, 50, 50);
        
        gameInfoPanal.add(vsImage);
        vsImage.setBounds(180, 20, 64, 64);
        
        gameInfoPanal.add(firstPlayerName);
        firstPlayerName.setBounds(75, 80, 64, 64);
        
        gameInfoPanal.add(secondPlayerName);
        secondPlayerName.setBounds(275, 80, 64, 64);
        
        gameInfoPanal.add(firstPlayerScore);
        firstPlayerScore.setForeground(Color.ORANGE);
        firstPlayerScore.setFont(new Font("Arial", Font.BOLD, 20));
        firstPlayerScore.setBounds(75, 110, 50, 50);

        gameInfoPanal.add(secondPlayerScore);
        secondPlayerScore.setForeground(Color.ORANGE);
        secondPlayerScore.setFont(new Font("Arial", Font.BOLD, 20));
        secondPlayerScore.setBounds(274, 110, 50, 50);
        
        gameInfoPanal.add(tieScore);
        tieScore.setForeground(Color.ORANGE);
        tieScore.setFont(new Font("Arial", Font.BOLD, 20));
        tieScore.setBounds(175, 140, 50, 50);

    }
    
    /// end creation of gui of game

    private void colorBackgroundWinnerLabels(JLabel l1, JLabel l2, JLabel l3) {
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        isGameEnds = true;
    }

    private boolean isOnePlayerGameEnds(JLabel pressedLabel) {
        boolean check = false;
        MultipleClass e = new MultipleClass(arrayOfLabals, parentPanal, firstPlayerScore, secondPlayerScore, pressedLabel, XOCounter,tieScore);
         
        check = e.isOnePlayerGameEnds();
        moves.put(Integer.parseInt(pressedLabel.getName()), pressedLabel.getText());
        if(check){
            if(record)
                {   
                    gameIsRecorded();
                    LocalDataBase.writeLocalGameSteps(localFile, dataLocl ,firstPlayerName.getText(),
                            Integer.parseInt(firstPlayerScore.getText()), secondPlayerName.getText(), Integer.parseInt(secondPlayerScore.getText()), moves); 
                    //System.out.println(dataLocl);
                }
        }
        XOCounter += 1;
        System.out.println(XOCounter);
        if (check) {
            removeXOListener();
            
            repaint();
            
            return true;
        } else {
        
            return false;
        }

    }
    
    

    private void removeXOListener() {
        for (JLabel gamePage_boardLabel : arrayOfLabals) {
            gamePage_boardLabel.removeMouseListener(XOListener);
        }
    }

    MouseListener XOListener = new MouseListener() {
        @Override
        public void mousePressed(MouseEvent e) {
            JLabel pressedLabel = (JLabel) e.getSource();
            
            if (isGameEnds == false) {
                if (!pressedLabel.getText().toString().equals("O") && !pressedLabel.getText().toString().equals("X")) {
                  //System.out.println("done");
                    isOnePlayerGameEnds(pressedLabel);                                           
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };

    private void startNewGame() {

        isGameEnds = false;
        for (int i =0 ; i<9 ; i++){
            
        arrayOfLabals[i].setOpaque(false);
        arrayOfLabals[i].setText("");
        arrayOfLabals[i].addMouseListener(XOListener);
        arrayOfLabals[i].setIcon(null);  
        }
        repaint();

     

    }

    public MultipleBoard() {
        
            createAndShowGUI();
            
            /////////////////// open file for record
            try {
            localFile = new File("Multilocal.txt");
            if(localFile.createNewFile())
            {
                System.out.println("file created "+ localFile.getName()+ localFile.getPath());
            }
            else
            {
                System.out.println("the file is already existed");
            }
            dataLocl = LocalDataBase.readLocalFile(localFile);
           // System.out.println("length: "+ localFile.length());
        } catch (IOException ex) {
            Logger.getLogger(MultipleBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createAndShowGUI() {
        createGamePage();
        add(parentPanal);
      

        for (JLabel gamePage_boardLabel : arrayOfLabals) {
            gamePage_boardLabel.addMouseListener(XOListener);
        }
        
        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(record == true){
                    record = false;
                recordIcon.setVisible(false);
                }
                XOCounter = 0;
                 startNewGame();
               

            }
        });
        
        
        imageRecording.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (record == false){
               record = true;
                recordIcon.setVisible(true);
                }
                else{
                record = false;
                recordIcon.setVisible(false);
                }

            }
        });
        
        savedIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               dataLocl = LocalDataBase.readLocalFile(localFile);
               HistoryTabel table = new HistoryTabel(dataLocl);
               table.method(localFile, dataLocl);
               table.setLocationRelativeTo(null);
               table.setVisible(true);
               table.setDefaultCloseOperation(2);
               
               
            }
        });
        
        backImage.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                   
                UserInterface mm = new UserInterface();
                  mm.setLocationRelativeTo(null);
                  mm.setVisible(true);
                  crd = (CardLayout) cards.getLayout();
                  crd.show(cards,"card4");
                   if(firstPlayerName.getText().equals("Guest")){
                     mm.onlineBtn1.setText("LOG IN");
                 }
                  mm.score(firstPlayerName.getText(),firstPlayerScore.getText(),secondPlayerScore.getText(),tieScore.getText());
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
    
    
    
    ///// for fill recent labels if game ends and there are empty labels 
    
    public void gameIsRecorded()
    {
           // System.out.println("inside");
            LocalDataBase.fillMap(moves, arrayOfLabals);
            record = false;
            recordIcon.setVisible(false);
            dataLocl = LocalDataBase.readLocalFile(localFile);
           // System.out.println(dataLocl+"the line inside recordGame");  
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MultipleBoard();
            }
        });
    }


}
