package client.view.Menu;

import client.view.Components.AfterRoundPanel;
import client.view.Components.InGamePanel;

import javax.swing.*;

public class AfterRound extends JFrame {
    public AfterRoundPanel afterRoundPanel;

    public AfterRound(){
        initComponents();
    }

    private void initComponents(){
        afterRoundPanel = new AfterRoundPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(afterRoundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(afterRoundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
}
