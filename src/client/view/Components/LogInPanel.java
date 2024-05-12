package client.view.Components;


import client.view.Menu.HomePage;
import client.view.Menu.LogIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class LogInPanel extends JPanel {
    private JButton buttonLogIn;
    private JLabel labelBackground;
    private JLabel labelPass;
    private JLabel labelShrek;
    private JLabel labelUsername;
    private JTextField textPass;
    private JTextField textUsername;
    private HomePage homePage;

    public LogInPanel() {
        initComponents();
        this.homePage = new HomePage();
    }

    private void initComponents() {

        buttonLogIn = new JButton();
        labelUsername = new JLabel();
        labelPass = new JLabel();
        textUsername = new JTextField();
        textPass = new JTextField();
        labelShrek = new JLabel();
        labelBackground = new JLabel();
        buttonLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.setVisible(true);
                LogIn logInFrame = (LogIn) SwingUtilities.getWindowAncestor(LogInPanel.this);
                logInFrame.dispose();

            }
        });
        add(buttonLogIn);

        setBackground(new java.awt.Color(193, 232, 153));
        setLayout(null);

        buttonLogIn.setBackground(new java.awt.Color(45, 81, 40));
        buttonLogIn.setFont(new java.awt.Font("Bodoni MT", 0, 26)); // NOI18N
        buttonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn.setText("Login");
        buttonLogIn.setBorder(null);
        add(buttonLogIn);
        buttonLogIn.setBounds(370, 320, 190, 50);

        labelUsername.setBackground(new java.awt.Color(255, 255, 255));
        labelUsername.setFont(new java.awt.Font("Bodoni MT", 0, 28)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Username :");
        add(labelUsername);
        labelUsername.setBounds(240, 170, 140, 40);

        labelPass.setFont(new java.awt.Font("Bodoni MT", 0, 28)); // NOI18N
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("Password :");
        add(labelPass);
        labelPass.setBounds(240, 220, 140, 34);
        add(textUsername);
        textUsername.setBounds(380, 180, 200, 30);
        add(textPass);
        textPass.setBounds(380, 230, 200, 30);


        URL backgroundImageURL = ClassLoader.getSystemClassLoader().getResource("client/view/Icon/forestt.gif");
        if (backgroundImageURL != null) {
            labelBackground.setIcon(new ImageIcon(backgroundImageURL));
            add(labelBackground);
            labelBackground.setBounds(0, 0, 850, 550);
        } else {
            System.err.println("Error: Background image not found in the classpath.");
        }

    }

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

            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
        }
    }
}
