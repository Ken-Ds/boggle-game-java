package client.view.Components;


import client.MainClient;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;


import javax.swing.*;

public class InGamePanel extends JPanel {
    private JButton buttonEnter;
    private JLabel labelEighteen;
    private JLabel labelEight;
    private JLabel labelEleven;
    private JLabel labelEnteredWord;
    private JLabel labelFifteen;
    private JLabel labelFive;
    private JLabel labelFour;
    private JLabel labelFourteen;
    private JLabel labelICONLeft;
    private JLabel labelIconRight;
    private JLabel labelNine;
    private JLabel labelNineteen;
    private JLabel labelOne;
    private JLabel labelPlayer;
    private JLabel labelRound;
    private JLabel labelScore;
    private JLabel labelScoreboard;
    private JLabel labelSeven;
    private JLabel labelSeventeen;
    private JLabel labelSix;
    private JLabel labelSixteen;
    private JLabel labelTen;
    private JLabel labelThirteen;
    private JLabel labelThree;
    private JLabel labelTimer;
    private JLabel labelTitleWord;
    private JLabel labelTwelve;
    private JLabel labelTwenty;
    private JLabel labelTwo;
    private JPanel panelEight;
    private JPanel panelEighteen;
    private JPanel panelEleven;
    private JPanel panelEnteredWord;
    private JPanel panelFifteen;
    private JPanel panelFive;
    private JPanel panelFour;
    private JPanel panelFourteen;
    private JPanel panelNine;
    private JPanel panelNineteen;
    private JPanel panelOne;
    private JPanel panelScoreboard;
    private JPanel panelScores;
    private JPanel panelSeven;
    private JPanel panelSeventeen;
    private JPanel panelSix;
    private JPanel panelSixteen;
    private JPanel panelTen;
    private JPanel panelThirteen;
    private JPanel panelThree;
    private JPanel panelTimer;
    private JPanel panelTwelve;
    private JPanel panelTwenty;
    private JPanel panelTwo;
    private JPanel panelWords;
    private JScrollPane scrollScoreboardd;
    private JScrollPane scrollWord;
    private JTextField textWord;
    private ArrayList<Character> letters;
    private JLabel[] labelArray;
    private JLabel lastClickedLabel; 
    private boolean labelsClickable = true;




    public InGamePanel() {
        initComponents();
        setLetters(MainClient.username);
    }


    private void initComponents() {

        panelOne = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelOne = new JLabel();
        panelTwo = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelTwo = new JLabel();
        panelThree = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelThree = new JLabel();
        panelFour = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelFour = new JLabel();
        panelFive = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelFive = new JLabel();
        panelSix = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelSix = new JLabel();
        panelSeven = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelSeven = new JLabel();
        panelEight = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelEight = new JLabel();
        panelNine = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelNine = new JLabel();
        panelTen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelTen = new JLabel();
        panelEleven = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelEleven = new JLabel();
        panelTwelve = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelTwelve = new JLabel();
        panelThirteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelThirteen = new JLabel();
        panelFourteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelFourteen = new JLabel();
        panelFifteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelFifteen = new JLabel();
        panelSixteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelSixteen = new JLabel();
        panelSeventeen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelSeventeen = new JLabel();
        panelEighteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelEighteen = new JLabel();
        panelNineteen = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelNineteen = new JLabel();
        panelTwenty = new RoundedPanel(50,new java.awt.Color(228,235,156));
        labelTwenty = new JLabel();
        buttonEnter = new JButton();
        textWord = new JTextField();
        textWord.setEditable(false);
        panelTimer = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelTimer = new JLabel();
        labelICONLeft = new JLabel();
        labelIconRight = new JLabel();
        panelEnteredWord = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelTitleWord = new JLabel();
        scrollWord = new JScrollPane();
        panelWords = new JPanel();
        labelEnteredWord = new JLabel();
        scrollScoreboardd = new JScrollPane();
        panelScores = new JPanel();
        labelScore = new JLabel();
        labelPlayer = new JLabel();
        panelScoreboard = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelScoreboard = new JLabel();
        labelRound = new JLabel();
        labelArray = new JLabel[20];
        labelArray[0] = labelOne;
        labelArray[1] = labelTwo;
        labelArray[2] = labelThree;
        labelArray[3] = labelFour;
        labelArray[4] = labelFive;
        labelArray[5] = labelSix;
        labelArray[6] = labelSeven;
        labelArray[7] = labelEight;
        labelArray[8] = labelNine;
        labelArray[9] = labelTen;
        labelArray[10] = labelEleven;
        labelArray[11] = labelTwelve;
        labelArray[12] = labelThirteen;
        labelArray[13] = labelFourteen;
        labelArray[14] = labelFifteen;
        labelArray[15] = labelSixteen;
        labelArray[16] = labelSeventeen;
        labelArray[17] = labelEighteen;
        labelArray[18] = labelNineteen;
        labelArray[19] = labelTwenty;

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(596, 551));
        setLayout(null);

        panelOne.setBackground(new java.awt.Color(255, 255, 255));
        panelOne.setPreferredSize(new java.awt.Dimension(85, 85));

        labelOne.setFont(new java.awt.Font("Bodoni MT", 0, 48));
        labelOne.setHorizontalAlignment(SwingConstants.CENTER);
        labelOne.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelOne.isEnabled()) {
                    textWord.setText(textWord.getText() + labelOne.getText());
                    labelOne.setEnabled(false);
                }
            }
        });

        GroupLayout panelOneLayout = new GroupLayout(panelOne);
        panelOne.setLayout(panelOneLayout);
        panelOneLayout.setHorizontalGroup(
                panelOneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelOne, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelOneLayout.setVerticalGroup(
                panelOneLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelOne, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelOne);
        panelOne.setBounds(340, 130, 85, 85);

        panelTwo.setBackground(new java.awt.Color(255, 255, 255));
        panelTwo.setPreferredSize(new java.awt.Dimension(85, 85));

        labelTwo.setFont(new java.awt.Font("Bodoni MT", 0, 48));
        labelTwo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTwo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelTwo.isEnabled()) {
                    textWord.setText(textWord.getText() + labelTwo.getText());
                    labelTwo.setEnabled(false);
                }
            }
        });

        GroupLayout panelTwoLayout = new GroupLayout(panelTwo);
        panelTwo.setLayout(panelTwoLayout);
        panelTwoLayout.setHorizontalGroup(
                panelTwoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelTwoLayout.setVerticalGroup(
                panelTwoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwo, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelTwo);
        panelTwo.setBounds(430, 130, 85, 85);

        panelThree.setBackground(new java.awt.Color(255, 255, 255));
        panelThree.setPreferredSize(new java.awt.Dimension(85, 85));

        labelThree.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelThree.setHorizontalAlignment(SwingConstants.CENTER);
        labelThree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelThree.isEnabled()) {
                    textWord.setText(textWord.getText() + labelThree.getText());
                    labelThree.setEnabled(false);
                }

            }
        });

        GroupLayout panelThreeLayout = new GroupLayout(panelThree);
        panelThree.setLayout(panelThreeLayout);
        panelThreeLayout.setHorizontalGroup(
                panelThreeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelThree, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelThreeLayout.setVerticalGroup(
                panelThreeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelThree, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelThree);
        panelThree.setBounds(520, 130, 85, 85);

        panelFour.setBackground(new java.awt.Color(255, 255, 255));
        panelFour.setPreferredSize(new java.awt.Dimension(85, 85));

        labelFour.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelFour.setHorizontalAlignment(SwingConstants.CENTER);
        labelFour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelFour.isEnabled()) {
                    textWord.setText(textWord.getText() + labelFour.getText());
                    labelFour.setEnabled(false);
                }
            }
        });

        GroupLayout panelFourLayout = new GroupLayout(panelFour);
        panelFour.setLayout(panelFourLayout);
        panelFourLayout.setHorizontalGroup(
                panelFourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFour, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelFourLayout.setVerticalGroup(
                panelFourLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFour, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelFour);
        panelFour.setBounds(610, 130, 85, 85);

        panelFive.setBackground(new java.awt.Color(255, 255, 255));
        panelFive.setPreferredSize(new java.awt.Dimension(85, 85));

        labelFive.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelFive.setHorizontalAlignment(SwingConstants.CENTER);

        labelFive.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelFive.isEnabled()) {
                    textWord.setText(textWord.getText() + labelFive.getText());
                    labelFive.setEnabled(false);
                }

            }
        });

        GroupLayout panelFiveLayout = new GroupLayout(panelFive);
        panelFive.setLayout(panelFiveLayout);
        panelFiveLayout.setHorizontalGroup(
                panelFiveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFive, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelFiveLayout.setVerticalGroup(
                panelFiveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFive, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelFive);
        panelFive.setBounds(700, 130, 85, 85);

        panelSix.setBackground(new java.awt.Color(255, 255, 255));
        panelSix.setPreferredSize(new java.awt.Dimension(85, 85));

        labelSix.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelSix.setHorizontalAlignment(SwingConstants.CENTER);

        labelSix.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelSix.isEnabled()) {
                    textWord.setText(textWord.getText() + labelSix.getText());
                    labelSix.setEnabled(false);
                }
            }
        });

        GroupLayout panelSixLayout = new GroupLayout(panelSix);
        panelSix.setLayout(panelSixLayout);
        panelSixLayout.setHorizontalGroup(
                panelSixLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSix, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelSixLayout.setVerticalGroup(
                panelSixLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSix, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelSix);
        panelSix.setBounds(340, 220, 85, 85);

        panelSeven.setBackground(new java.awt.Color(255, 255, 255));
        panelSeven.setPreferredSize(new java.awt.Dimension(85, 85));

        labelSeven.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelSeven.setHorizontalAlignment(SwingConstants.CENTER);

        labelSeven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelSeven.isEnabled()) {
                    textWord.setText(textWord.getText() + labelSeven.getText());
                    labelSeven.setEnabled(false);
                }

            }
        });

        GroupLayout panelSevenLayout = new GroupLayout(panelSeven);
        panelSeven.setLayout(panelSevenLayout);
        panelSevenLayout.setHorizontalGroup(
                panelSevenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSeven, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelSevenLayout.setVerticalGroup(
                panelSevenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSeven, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelSeven);
        panelSeven.setBounds(430, 220, 85, 85);

        panelEight.setBackground(new java.awt.Color(255, 255, 255));
        panelEight.setPreferredSize(new java.awt.Dimension(85, 85));

        labelEight.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelEight.setHorizontalAlignment(SwingConstants.CENTER);
        labelEight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelEight.isEnabled()) {
                    textWord.setText(textWord.getText() + labelEight.getText());
                    labelEight.setEnabled(false);
                }
            }
        });

        GroupLayout panelEightLayout = new GroupLayout(panelEight);
        panelEight.setLayout(panelEightLayout);
        panelEightLayout.setHorizontalGroup(
                panelEightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEight, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelEightLayout.setVerticalGroup(
                panelEightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEight, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelEight);
        panelEight.setBounds(520, 220, 85, 85);

        panelNine.setBackground(new java.awt.Color(255, 255, 255));
        panelNine.setPreferredSize(new java.awt.Dimension(85, 85));

        labelNine.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelNine.setHorizontalAlignment(SwingConstants.CENTER);

        labelNine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelNine.isEnabled()) {
                    textWord.setText(textWord.getText() + labelNine.getText());
                    labelNine.setEnabled(false);
                }
            }
        });

        GroupLayout panelNineLayout = new GroupLayout(panelNine);
        panelNine.setLayout(panelNineLayout);
        panelNineLayout.setHorizontalGroup(
                panelNineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelNine, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelNineLayout.setVerticalGroup(
                panelNineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelNine, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelNine);
        panelNine.setBounds(610, 220, 85, 85);

        panelTen.setBackground(new java.awt.Color(255, 255, 255));
        panelTen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelTen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelTen.setHorizontalAlignment(SwingConstants.CENTER);

        labelTen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelTen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelTen.getText());
                    labelTen.setEnabled(false);
                }
            }
        });

        GroupLayout panelTenLayout = new GroupLayout(panelTen);
        panelTen.setLayout(panelTenLayout);
        panelTenLayout.setHorizontalGroup(
                panelTenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelTenLayout.setVerticalGroup(
                panelTenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelTen);
        panelTen.setBounds(700, 220, 85, 85);

        panelEleven.setBackground(new java.awt.Color(255, 255, 255));
        panelEleven.setPreferredSize(new java.awt.Dimension(85, 85));

        labelEleven.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelEleven.setHorizontalAlignment(SwingConstants.CENTER);

        labelEleven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelEleven.isEnabled()) {
                    textWord.setText(textWord.getText() + labelEleven.getText());
                    labelEleven.setEnabled(false);
                }
            }
        });

        GroupLayout panelElevenLayout = new GroupLayout(panelEleven);
        panelEleven.setLayout(panelElevenLayout);
        panelElevenLayout.setHorizontalGroup(
                panelElevenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEleven, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelElevenLayout.setVerticalGroup(
                panelElevenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEleven, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelEleven);
        panelEleven.setBounds(340, 310, 85, 85);

        panelTwelve.setBackground(new java.awt.Color(255, 255, 255));
        panelTwelve.setPreferredSize(new java.awt.Dimension(85, 85));

        labelTwelve.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelTwelve.setHorizontalAlignment(SwingConstants.CENTER);

        labelTwelve.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelTwelve.isEnabled()) {
                    textWord.setText(textWord.getText() + labelTwelve.getText());
                    labelTwelve.setEnabled(false);
                }
            }
        });

        GroupLayout panelTwelveLayout = new GroupLayout(panelTwelve);
        panelTwelve.setLayout(panelTwelveLayout);
        panelTwelveLayout.setHorizontalGroup(
                panelTwelveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwelve, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelTwelveLayout.setVerticalGroup(
                panelTwelveLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwelve, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelTwelve);
        panelTwelve.setBounds(430, 310, 85, 85);

        panelThirteen.setBackground(new java.awt.Color(255, 255, 255));
        panelThirteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelThirteen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelThirteen.setHorizontalAlignment(SwingConstants.CENTER);

        labelThirteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelThirteen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelThirteen.getText());
                    labelThirteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelThirteenLayout = new GroupLayout(panelThirteen);
        panelThirteen.setLayout(panelThirteenLayout);
        panelThirteenLayout.setHorizontalGroup(
                panelThirteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelThirteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelThirteenLayout.setVerticalGroup(
                panelThirteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelThirteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelThirteen);
        panelThirteen.setBounds(520, 310, 85, 85);

        panelFourteen.setBackground(new java.awt.Color(255, 255, 255));
        panelFourteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelFourteen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelFourteen.setHorizontalAlignment(SwingConstants.CENTER);

        labelFourteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelFourteen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelFourteen.getText());
                    labelFourteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelFourteenLayout = new GroupLayout(panelFourteen);
        panelFourteen.setLayout(panelFourteenLayout);
        panelFourteenLayout.setHorizontalGroup(
                panelFourteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFourteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelFourteenLayout.setVerticalGroup(
                panelFourteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFourteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelFourteen);
        panelFourteen.setBounds(610, 310, 85, 85);

        panelFifteen.setBackground(new java.awt.Color(255, 255, 255));
        panelFifteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelFifteen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelFifteen.setHorizontalAlignment(SwingConstants.CENTER);

        labelFifteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelFifteen.isEnabled()) {
                textWord.setText(textWord.getText() + labelFifteen.getText());
                labelFifteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelFifteenLayout = new GroupLayout(panelFifteen);
        panelFifteen.setLayout(panelFifteenLayout);
        panelFifteenLayout.setHorizontalGroup(
                panelFifteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFifteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelFifteenLayout.setVerticalGroup(
                panelFifteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelFifteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelFifteen);
        panelFifteen.setBounds(700, 310, 85, 85);

        panelSixteen.setBackground(new java.awt.Color(255, 255, 255));
        panelSixteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelSixteen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelSixteen.setHorizontalAlignment(SwingConstants.CENTER);

        labelSixteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelSixteen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelSixteen.getText());
                    labelSixteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelSixteenLayout = new GroupLayout(panelSixteen);
        panelSixteen.setLayout(panelSixteenLayout);
        panelSixteenLayout.setHorizontalGroup(
                panelSixteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSixteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelSixteenLayout.setVerticalGroup(
                panelSixteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSixteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelSixteen);
        panelSixteen.setBounds(340, 400, 85, 85);

        panelSeventeen.setBackground(new java.awt.Color(255, 255, 255));
        panelSeventeen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelSeventeen.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelSeventeen.setHorizontalAlignment(SwingConstants.CENTER);

        labelSeventeen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelSeventeen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelSeventeen.getText());
                    labelSeventeen.setEnabled(false);
                }
            }
        });

        GroupLayout panelSeventeenLayout = new GroupLayout(panelSeventeen);
        panelSeventeen.setLayout(panelSeventeenLayout);
        panelSeventeenLayout.setHorizontalGroup(
                panelSeventeenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSeventeen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelSeventeenLayout.setVerticalGroup(
                panelSeventeenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelSeventeen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelSeventeen);
        panelSeventeen.setBounds(430, 400, 85, 85);

        panelEighteen.setBackground(new java.awt.Color(255, 255, 255));
        panelEighteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelEighteen.setFont(new java.awt.Font("Bodoni MT", 0, 48));
        labelEighteen.setHorizontalAlignment(SwingConstants.CENTER);

        labelEighteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelEighteen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelEighteen.getText());
                    labelEighteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelEighteenLayout = new GroupLayout(panelEighteen);
        panelEighteen.setLayout(panelEighteenLayout);
        panelEighteenLayout.setHorizontalGroup(
                panelEighteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEighteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelEighteenLayout.setVerticalGroup(
                panelEighteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelEighteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelEighteen);
        panelEighteen.setBounds(520, 400, 85, 85);

        panelNineteen.setBackground(new java.awt.Color(255, 255, 255));
        panelNineteen.setPreferredSize(new java.awt.Dimension(85, 85));

        labelNineteen.setFont(new java.awt.Font("Bodoni MT", 0, 48));
        labelNineteen.setHorizontalAlignment(SwingConstants.CENTER);
        labelNineteen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelNineteen.isEnabled()) {
                    textWord.setText(textWord.getText() + labelNineteen.getText());
                    labelNineteen.setEnabled(false);
                }
            }
        });

        GroupLayout panelNineteenLayout = new GroupLayout(panelNineteen);
        panelNineteen.setLayout(panelNineteenLayout);
        panelNineteenLayout.setHorizontalGroup(
                panelNineteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelNineteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelNineteenLayout.setVerticalGroup(
                panelNineteenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelNineteen, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelNineteen);
        panelNineteen.setBounds(610, 400, 85, 85);

        panelTwenty.setBackground(new java.awt.Color(255, 255, 255));
        panelTwenty.setPreferredSize(new java.awt.Dimension(85, 85));

        labelTwenty.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        labelTwenty.setHorizontalAlignment(SwingConstants.CENTER);

        labelTwenty.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (labelTwenty.isEnabled()) {
                    textWord.setText(textWord.getText() + labelTwenty.getText());
                    labelTwenty.setEnabled(false);
                }
            }
        });

        GroupLayout panelTwentyLayout = new GroupLayout(panelTwenty);
        panelTwenty.setLayout(panelTwentyLayout);
        panelTwentyLayout.setHorizontalGroup(
                panelTwentyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwenty, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelTwentyLayout.setVerticalGroup(
                panelTwentyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTwenty, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        add(panelTwenty);
        panelTwenty.setBounds(700, 400, 85, 85);

        buttonEnter.setBackground(new java.awt.Color(45, 81, 40));
        buttonEnter.setFont(new java.awt.Font("Bodoni MT", 0, 25));
        buttonEnter.setForeground(new java.awt.Color(255, 255, 255));
        buttonEnter.setText("Enter");
        buttonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setButtonEnter(evt);
            }
        });

        buttonEnter.setBorder(null);
        add(buttonEnter);
        buttonEnter.setBounds(730, 520, 100, 43);

        textWord.setBackground(new java.awt.Color(228, 235, 156));
        add(textWord);
        textWord.setBounds(310, 520, 415, 43);
        textWord.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    String text = textWord.getText();
                    if (!text.isEmpty()) {

                        textWord.setText(text.substring(0, text.length() - 1));


                        char deletedChar = text.charAt(text.length() - 1);


                        JLabel lastDisabledLabel = null;
                        for (JLabel label : labelArray) {
                            if (!label.isEnabled() && label.getText().charAt(0) == deletedChar) {
                                lastDisabledLabel = label;
                            }
                        }


                        if (lastDisabledLabel != null) {
                            lastDisabledLabel.setEnabled(true);
                        }
                    }
                }
            }
        });



        panelTimer.setBackground(new java.awt.Color(255, 255, 255));

        labelTimer.setFont(new java.awt.Font("Segoe UI", 1, 43));
        labelTimer.setForeground(new java.awt.Color(255, 255, 255));
        labelTimer.setHorizontalAlignment(SwingConstants.CENTER);
        labelTimer.setText("0:30");

        GroupLayout panelTimerLayout = new GroupLayout(panelTimer);
        panelTimer.setLayout(panelTimerLayout);
        panelTimerLayout.setHorizontalGroup(
                panelTimerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTimer, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        panelTimerLayout.setVerticalGroup(
                panelTimerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelTimer, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        add(panelTimer);
        panelTimer.setBounds(470, 590, 210, 72);

        URL imageURL = ClassLoader.getSystemClassLoader().getResource("client/view/Icon/inGameIconRight (1).png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            labelICONLeft.setIcon(icon);
            add(labelICONLeft);
            labelICONLeft.setBounds(250, 270, 120, 220);
        } else {
            System.out.println("Image not found in classpath.");
        }

        URL imageURL1 = ClassLoader.getSystemClassLoader().getResource("client/view/Icon/inGameLeft (1).png");
        if (imageURL1 != null) {
            ImageIcon icon = new ImageIcon(imageURL1);
            labelIconRight.setIcon(icon);
            add(labelIconRight);
            labelIconRight.setBounds(770, 250, 130, 236);
        } else {
            System.out.println("Image not found in classpath.");
        }

        panelEnteredWord.setBackground(new java.awt.Color(255, 255, 255));

        labelTitleWord.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        labelTitleWord.setForeground(new java.awt.Color(255, 255, 255));
        labelTitleWord.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitleWord.setText("Entered Words");

        GroupLayout panelEnteredWordLayout = new GroupLayout(panelEnteredWord);
        panelEnteredWord.setLayout(panelEnteredWordLayout);
        panelEnteredWordLayout.setHorizontalGroup(
                panelEnteredWordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelEnteredWordLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelTitleWord, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
        );
        panelEnteredWordLayout.setVerticalGroup(
                panelEnteredWordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelEnteredWordLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelTitleWord, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );

        add(panelEnteredWord);
        panelEnteredWord.setBounds(920, 10, 220, 50);

        scrollWord.setBackground(new java.awt.Color(45, 81, 40));
        scrollWord.setBorder(null);
        scrollWord.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollWord.setOpaque(false);

        panelWords.setBackground(new java.awt.Color(45, 81, 40));

        labelEnteredWord.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        labelEnteredWord.setForeground(new java.awt.Color(255, 255, 255));
        labelEnteredWord.setHorizontalAlignment(SwingConstants.CENTER);
        labelEnteredWord.setText("WEAK");

        GroupLayout panelWordsLayout = new GroupLayout(panelWords);
        panelWords.setLayout(panelWordsLayout);
        panelWordsLayout.setHorizontalGroup(
                panelWordsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelEnteredWord, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelWordsLayout.setVerticalGroup(
                panelWordsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelEnteredWord, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(547, Short.MAX_VALUE))
        );

        scrollWord.setViewportView(panelWords);

        add(scrollWord);
        scrollWord.setBounds(920, 70, 220, 600);

        scrollScoreboardd.setBackground(new java.awt.Color(45, 81, 40));
        scrollScoreboardd.setBorder(null);
        scrollScoreboardd.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollScoreboardd.setOpaque(false);

        panelScores.setBackground(new java.awt.Color(45, 81, 40));
        panelScores.setLayout(new BoxLayout(panelScores, BoxLayout.Y_AXIS));

        String[] names = MainClient.connect.clientInterfaceImplementation.getGamePlayers(MainClient.username);
        int[] scores = MainClient.connect.clientInterfaceImplementation.getGameScores(MainClient.username);

        for (int x = 0; x < names.length; x++) {
            JPanel playerPanel = new JPanel();
            playerPanel.setBackground(new java.awt.Color(45, 81, 40));
            playerPanel.setLayout(new GridLayout(1, 2));

            JLabel labelPlayer = new JLabel();
            labelPlayer.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
            labelPlayer.setForeground(new java.awt.Color(255, 255, 255));
            labelPlayer.setText(names[x]);

            JLabel labelScore = new JLabel();
            labelScore.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
            labelScore.setForeground(new java.awt.Color(255, 255, 255));
            labelScore.setHorizontalAlignment(SwingConstants.CENTER);
            labelScore.setText(String.valueOf(scores[x]));

            playerPanel.add(labelPlayer);
            playerPanel.add(labelScore);

            panelScores.add(playerPanel);
        }

        scrollScoreboardd.setViewportView(panelScores);

        add(scrollScoreboardd);
        scrollScoreboardd.setBounds(10, 70, 220, 600);

        panelScoreboard.setBackground(new java.awt.Color(255, 255, 255));

        labelScoreboard.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        labelScoreboard.setForeground(new java.awt.Color(255, 255, 255));
        labelScoreboard.setHorizontalAlignment(SwingConstants.CENTER);
        labelScoreboard.setText("Scoreboard");

        GroupLayout panelScoreboardLayout = new GroupLayout(panelScoreboard);
        panelScoreboard.setLayout(panelScoreboardLayout);
        panelScoreboardLayout.setHorizontalGroup(
                panelScoreboardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelScoreboard, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelScoreboardLayout.setVerticalGroup(
                panelScoreboardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelScoreboardLayout.createSequentialGroup()
                                .addComponent(labelScoreboard, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(panelScoreboard);
        panelScoreboard.setBounds(10, 10, 220, 50);

        labelRound.setFont(new java.awt.Font("Bodoni MT", 0, 41)); // NOI18N
        labelRound.setText("ROUND 1");
        add(labelRound);
        labelRound.setBounds(480, 40, 260, 50);
    }// </editor-fold>
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//
        }
    }

    public void setButtonEnter(ActionEvent evt){
        System.out.println(textWord.getText());
        MainClient.connect.clientInterfaceImplementation.submitWord(textWord.getText(),MainClient.username);
        textWord.setText("");
        setLabelsEnabled(true);
        if (lastClickedLabel != null) {
            lastClickedLabel.setForeground(Color.BLACK);
        }
        labelsClickable = true;
    }
    public void setLetters(String username) {
        try {
            char[] letters = MainClient.connect.clientInterfaceImplementation.getLetters(username); // Retrieve random letters from the server
            for (int i = 0; i < letters.length && i < labelArray.length; i++) {
                labelArray[i].setText(String.valueOf(letters[i]));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void setLabelsEnabled(boolean enabled) {
        for (JLabel label : labelArray) {
            label.setEnabled(enabled);
        }
    }

    public void setLabelTimer(String time){
        labelTimer.setText(time);
    }
}
