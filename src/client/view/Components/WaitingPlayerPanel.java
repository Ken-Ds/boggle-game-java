package client.view.Components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.net.URL;


import javax.swing.*;

public class WaitingPlayerPanel extends JPanel {
    private JLabel labelIcon;
    private JLabel labelInGame;
    private JLabel labelPlayerName;
    private JLabel labelScore;
    private JLabel labelWaitPlayer;
    private JLabel labelWaitingTimer;
    private JPanel panelInGame;
    private JPanel panelPlayers;
    private JPanel panelWaitPlayer;
    private JPanel panelWaitingTimer;
    private JScrollPane scrollPlayers;

    public WaitingPlayerPanel() {
        initComponents();
    }


    private void initComponents() {

        panelWaitPlayer = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelWaitPlayer = new JLabel();
        panelWaitingTimer = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelWaitingTimer = new JLabel();
        panelInGame = new RoundedPanel(50,new java.awt.Color(45,81,40));
        labelInGame = new JLabel();
        scrollPlayers = new JScrollPane();
        panelPlayers = new JPanel();
        labelPlayerName = new JLabel();
        labelScore = new JLabel();
        labelIcon = new JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        panelWaitPlayer.setBackground(new java.awt.Color(255, 255, 255));
        panelWaitPlayer.setOpaque(false);

        labelWaitPlayer.setFont(new java.awt.Font("Bodoni MT", 1, 28)); // NOI18N
        labelWaitPlayer.setForeground(new java.awt.Color(255, 255, 255));
        labelWaitPlayer.setHorizontalAlignment(SwingConstants.CENTER);
        labelWaitPlayer.setText("Waiting For Players");

        GroupLayout panelWaitPlayerLayout = new GroupLayout(panelWaitPlayer);
        panelWaitPlayer.setLayout(panelWaitPlayerLayout);
        panelWaitPlayerLayout.setHorizontalGroup(
                panelWaitPlayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelWaitPlayer, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        panelWaitPlayerLayout.setVerticalGroup(
                panelWaitPlayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelWaitPlayer, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        add(panelWaitPlayer);
        panelWaitPlayer.setBounds(440, 10, 580, 55);

        panelWaitingTimer.setBackground(new java.awt.Color(255, 255, 255));
        panelWaitingTimer.setOpaque(false);

        labelWaitingTimer.setBackground(new java.awt.Color(0, 0, 0));
        labelWaitingTimer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelWaitingTimer.setForeground(new java.awt.Color(255, 255, 255));
        labelWaitingTimer.setHorizontalAlignment(SwingConstants.CENTER);
        labelWaitingTimer.setText("0:10");

        GroupLayout panelWaitingTimerLayout = new GroupLayout(panelWaitingTimer);
        panelWaitingTimer.setLayout(panelWaitingTimerLayout);
        panelWaitingTimerLayout.setHorizontalGroup(
                panelWaitingTimerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelWaitingTimer, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        panelWaitingTimerLayout.setVerticalGroup(
                panelWaitingTimerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelWaitingTimer, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        add(panelWaitingTimer);
        panelWaitingTimer.setBounds(590, 560, 260, 72);

        panelInGame.setBackground(new java.awt.Color(255, 255, 255));
        panelInGame.setOpaque(false);
        panelInGame.setPreferredSize(new java.awt.Dimension(241, 53));

        labelInGame.setFont(new java.awt.Font("Bodoni MT", 1, 21)); // NOI18N
        labelInGame.setForeground(new java.awt.Color(255, 255, 255));
        labelInGame.setHorizontalAlignment(SwingConstants.CENTER);
        labelInGame.setText("Players");

        GroupLayout panelInGameLayout = new GroupLayout(panelInGame);
        panelInGame.setLayout(panelInGameLayout);
        panelInGameLayout.setHorizontalGroup(
                panelInGameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelInGame, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelInGameLayout.setVerticalGroup(
                panelInGameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelInGame, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(panelInGame);
        panelInGame.setBounds(11, 13, 220, 53);

        scrollPlayers.setBorder(null);
        scrollPlayers.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelPlayers.setBackground(new java.awt.Color(45, 81, 40));
        panelPlayers.setPreferredSize(new java.awt.Dimension(506, 810));

        labelPlayerName.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        labelPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayerName.setText("Kendick");

        labelScore.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        labelScore.setForeground(new java.awt.Color(255, 255, 255));
        labelScore.setHorizontalAlignment(SwingConstants.CENTER);
        labelScore.setText("-9");

        GroupLayout panelPlayersLayout = new GroupLayout(panelPlayers);
        panelPlayers.setLayout(panelPlayersLayout);
        panelPlayersLayout.setHorizontalGroup(
                panelPlayersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPlayersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelPlayerName, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelScore, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(306, Short.MAX_VALUE))
        );
        panelPlayersLayout.setVerticalGroup(
                panelPlayersLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPlayersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPlayersLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPlayerName, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addComponent(labelScore, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(752, 752, 752))
        );

        scrollPlayers.setViewportView(panelPlayers);

        add(scrollPlayers);
        scrollPlayers.setBounds(10, 80, 220, 570);

        URL imageURL = ClassLoader.getSystemClassLoader().getResource("client/view/Icon/WaitingIconn.png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            labelIcon.setIcon(icon);
            add(labelIcon);
            labelIcon.setBounds(0, 0, 1150, 700);
        } else {
            System.out.println("Image not found in classpath.");
        }

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
}
