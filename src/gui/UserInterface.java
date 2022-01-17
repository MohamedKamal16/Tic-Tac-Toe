package gui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import multiple.WelcomMultiple;
import online.GameOnline;
import single.ModesBoard;


public class UserInterface extends javax.swing.JFrame {

    
    GamePlayer player;
    public static CardLayout crd;
     public void score(String n,String w,String L,String t){
         String data = new String();
        data=Controler.setData(n,w,L,t);
        player.SendMessagetoServer(data);
        }

    public UserInterface() {
        player = new GamePlayer(this);
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        signInBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        createaccountBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        playerTie = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        playerID = new javax.swing.JLabel();
        playerUsername = new javax.swing.JLabel();
        playerEmail = new javax.swing.JLabel();
        playerGames = new javax.swing.JLabel();
        playerLoss = new javax.swing.JLabel();
        playerWin = new javax.swing.JLabel();
        profileBack = new javax.swing.JLabel();
        homePage = new javax.swing.JPanel();
        singleBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        gamesbtn = new javax.swing.JButton();
        LabelName = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        onlineBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        cards.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Username");
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFieldMouseClicked(evt);
            }
        });
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 180, 20));

        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 180, 20));

        signInBtn.setBackground(new java.awt.Color(204, 204, 204));
        signInBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        signInBtn.setForeground(new java.awt.Color(126, 21, 168));
        signInBtn.setText("Sign In");
        signInBtn.setBorder(null);
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 80, 30));

        signupBtn.setBackground(new java.awt.Color(204, 204, 204));
        signupBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(126, 21, 168));
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(null);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 80, 30));

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 1, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 78, 136));
        jLabel11.setText("Tic Tac Toe");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 54));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 180, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/icons8_lock_20px_5.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/68747470733a2f2f696d6167652e666c617469636f6e2e636f6d2f69636f6e732f706e672f3531322f3536362f3536363239342e706e67-modified.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 240, 270));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/icons8_user_20px_3.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        btnGuest.setBackground(new java.awt.Color(204, 204, 204));
        btnGuest.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnGuest.setForeground(new java.awt.Color(126, 21, 168));
        btnGuest.setText("Play As A Guest");
        btnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 180, 30));

        cards.add(jPanel1, "card1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(724, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 78, 136));
        jLabel3.setText("Sign up for new account");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 32));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 78, 136));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 78, 136));
        jLabel6.setText("E-mail");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 78, 136));
        jLabel7.setText("Password");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Username");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 172, 20));

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("example@gmail.com");
        jTextField2.setBorder(null);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 172, 20));

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 171, 20));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 78, 136));
        jLabel8.setText("Confirm Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jPasswordField2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField2.setText("Password");
        jPasswordField2.setBorder(null);
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 171, 20));

        createaccountBtn.setBackground(new java.awt.Color(204, 204, 204));
        createaccountBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        createaccountBtn.setForeground(new java.awt.Color(126, 21, 168));
        createaccountBtn.setText("Create Account");
        createaccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountBtnActionPerformed(evt);
            }
        });
        jPanel2.add(createaccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 150, 40));

        cancelBtn.setBackground(new java.awt.Color(204, 204, 204));
        cancelBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(153, 153, 153));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 150, 40));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 170, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/68747470733a2f2f696d6167652e666c617469636f6e2e636f6d2f69636f6e732f706e672f3531322f3536362f3536363239342e706e67-modified.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        cards.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setToolTipText("");
        jPanel3.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel3.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Player Profile");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/icons8_winner_80px.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(":");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 30, -1));

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("E-mail");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Games");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("WIN");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TIE");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("LOSS");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(":");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 30, -1));

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(":");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, -1));

        jLabel26.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(":");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 30, -1));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText(":");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 30, -1));

        jLabel29.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText(":");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 30, -1));

        playerTie.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerTie.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerTie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(":");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 30, -1));

        playerID.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerID.setForeground(new java.awt.Color(255, 255, 204));
        playerID.setToolTipText("");
        jPanel3.add(playerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 30));

        playerUsername.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerUsername.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        playerEmail.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerEmail.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        playerGames.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerGames.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        playerLoss.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerLoss.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerLoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        playerWin.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        playerWin.setForeground(new java.awt.Color(255, 255, 204));
        jPanel3.add(playerWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        profileBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_2.png"))); // NOI18N
        profileBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileBackMouseClicked(evt);
            }
        });
        jPanel3.add(profileBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cards.add(jPanel3, "card3");

        homePage.setBackground(new java.awt.Color(51, 0, 102));
        homePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singleBtn.setBackground(new java.awt.Color(214, 229, 250));
        singleBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        singleBtn.setForeground(new java.awt.Color(126, 21, 168));
        singleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/player_image.png"))); // NOI18N
        singleBtn.setText("   Single PLayer");
        singleBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        singleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleBtnActionPerformed(evt);
            }
        });
        homePage.add(singleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 250, 80));

        multiBtn.setBackground(new java.awt.Color(214, 229, 250));
        multiBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        multiBtn.setForeground(new java.awt.Color(126, 21, 168));
        multiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/battle.png"))); // NOI18N
        multiBtn.setText("   Multi Player");
        multiBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
            }
        });
        homePage.add(multiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 250, 80));

        gamesbtn.setBackground(new java.awt.Color(214, 229, 250));
        gamesbtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        gamesbtn.setForeground(new java.awt.Color(126, 21, 168));
        gamesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreen/board-game.png"))); // NOI18N
        gamesbtn.setText("  More Game");
        gamesbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        gamesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesbtnActionPerformed(evt);
            }
        });
        homePage.add(gamesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 250, 80));
        gamesbtn.getAccessibleContext().setAccessibleName("  More Game");

        LabelName.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        LabelName.setForeground(new java.awt.Color(255, 255, 204));
        homePage.add(LabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 30));

        profileLabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/icons8_winner_80px.png"))); // NOI18N
        profileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLabelMouseClicked(evt);
            }
        });
        homePage.add(profileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreen/image-modified.png"))); // NOI18N
        homePage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 60, 60));

        onlineBtn1.setBackground(new java.awt.Color(214, 229, 250));
        onlineBtn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        onlineBtn1.setForeground(new java.awt.Color(126, 21, 168));
        onlineBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/online-game.png"))); // NOI18N
        onlineBtn1.setText("      ONLINE");
        onlineBtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        onlineBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineBtn1ActionPerformed(evt);
            }
        });
        homePage.add(onlineBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 250, 80));

        cards.add(homePage, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
 
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        crd = (CardLayout) cards.getLayout(); 
        crd.show(cards,"card2");
    }//GEN-LAST:event_signupBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        crd = (CardLayout) cards.getLayout(); 
        crd.show(cards,"card1");
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        String dataSignIn = new String();
        dataSignIn=Controler.signIn(usernameField.getText(),passwordField.getText());
        player.SendMessagetoServer(dataSignIn);
    }//GEN-LAST:event_signInBtnActionPerformed

    private void createaccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountBtnActionPerformed
        crd = (CardLayout) cards.getLayout();
        String dataSignUp = new String();
        
        if(jTextField1.getText().equals("")||jPasswordField1.getText().equals("")||jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Must input NAME AND EMAIL AND PASSWORD","Error",1);}
        else{
            if (jPasswordField1.getText().equals(jPasswordField2.getText())){
                dataSignUp=Controler.signUp(jTextField1.getText(),jPasswordField1.getText(),jTextField2.getText());   
                player.SendMessagetoServer(dataSignUp);
               }
            else
            JOptionPane.showMessageDialog(this,"Don't match passwords","Error",1);}
        
    }//GEN-LAST:event_createaccountBtnActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if( jTextField1.getText().equals("Username"))
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if( jTextField2.getText().equals("example@gmail.com"))
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        if( jPasswordField1.getText().equals("Password"))
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        if( jPasswordField2.getText().equals("Password"))
        jPasswordField2.setText("");
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void usernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseClicked
        if( usernameField.getText().equals("Username"))
        usernameField.setText("");
    }//GEN-LAST:event_usernameFieldMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        if( passwordField.getText().equals("Password"))
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void btnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestActionPerformed
        LabelName.setText("Guest");   
        onlineBtn1.setText("LOG IN");
        crd = (CardLayout) cards.getLayout();
        crd.show(cards,"card4");
      
    }//GEN-LAST:event_btnGuestActionPerformed

    private void btnPlayerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayerProfileActionPerformed
       
    }//GEN-LAST:event_btnPlayerProfileActionPerformed

    private void profileBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBackMouseClicked
       crd = (CardLayout) cards.getLayout();
        crd.show(cards,"card4");
    }//GEN-LAST:event_profileBackMouseClicked

    private void singleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleBtnActionPerformed
        new ModesBoard().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_singleBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        new WelcomMultiple().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_multiBtnActionPerformed

    private void profileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLabelMouseClicked
        crd = (CardLayout) cards.getLayout();
        crd.show(cards,"card3");
        String getData = new String();
        getData=Controler.getData(LabelName.getText());
        player.SendMessagetoServer(getData);
    }//GEN-LAST:event_profileLabelMouseClicked

    private void onlineBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineBtn1ActionPerformed
      if(onlineBtn1.getText().equals("LOG IN")){
        crd = (CardLayout) cards.getLayout();
        crd.show(cards,"card1");
      }else{
        new GameOnline().setVisible(true);
        setVisible(false);
         String createroom = new String();
        createroom =Controler.createroom();
       player.SendMessagetoServer(createroom);}
    }//GEN-LAST:event_onlineBtn1ActionPerformed

    
    private void gamesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesbtnActionPerformed
        dispose();
        new Snake_Game().setVisible(true);
      
    }//GEN-LAST:event_gamesbtnActionPerformed

    
    public static void main(String args[]) {
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserInterface user = new UserInterface();
                user.setLocationRelativeTo(null);
                user.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabelName;
    private javax.swing.JButton btnGuest;
    private javax.swing.JButton cancelBtn;
    public static javax.swing.JPanel cards;
    private javax.swing.JButton createaccountBtn;
    private javax.swing.JButton gamesbtn;
    public static javax.swing.JPanel homePage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton multiBtn;
    public javax.swing.JButton onlineBtn1;
    private javax.swing.JPasswordField passwordField;
    protected javax.swing.JLabel playerEmail;
    protected javax.swing.JLabel playerGames;
    protected javax.swing.JLabel playerID;
    protected javax.swing.JLabel playerLoss;
    protected javax.swing.JLabel playerTie;
    public static javax.swing.JLabel playerUsername;
    protected javax.swing.JLabel playerWin;
    private javax.swing.JLabel profileBack;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton signInBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JButton singleBtn;
    protected javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    
  public void validSignIn(){
        crd = (CardLayout) cards.getLayout();
        crd.show(cards,"card4");
        LabelName.setText(usernameField.getText());
        
         onlineBtn1.setText("    ONLINE");
  }
    
   public void inValidSignIn(){
    JOptionPane.showMessageDialog(this,"Error in username or password.","Error",1);}
   
   public void Duplicated(){
    JOptionPane.showMessageDialog(this,"Duplicated username","Error",1);
    crd = (CardLayout) cards.getLayout();
    crd.show(cards,"card2");}
   
   public void SignUp(){
    JOptionPane.showMessageDialog(this,"Saved data","Congratulations",1);
                crd = (CardLayout) cards.getLayout();
                crd.show(cards,"card4");
                LabelName.setText(jTextField1.getText());
                     onlineBtn1.setText("    ONLINE");
               
}
  
}
