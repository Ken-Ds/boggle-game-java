/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package server.view.serverPanels;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsPanel extends JPanel {
    private JTextField gameTimeInput;
    private JLabel gameTimeLabel;
    private JPanel headPanel;
    private JLabel headingText;
    private JButton saveButton;
    private JTextField waitingTimeInput;
    private JLabel waitingTimeLabel;

    public GameSettingsPanel() {
        initComponents();
    }

    private void initComponents() {

        headPanel = new JPanel();
        headingText = new JLabel();
        gameTimeLabel = new JLabel();
        waitingTimeLabel = new JLabel();
        gameTimeInput = new JTextField();
        waitingTimeInput = new JTextField();
        saveButton = new JButton();

        setBackground(new Color(83, 123, 47));

        headPanel.setBackground(new Color(153, 153, 0));
        headPanel.setBorder(BorderFactory.createEtchedBorder());

        headingText.setFont(new Font("Bookman Old Style", 1, 36)); // NOI18N
        headingText.setText("GAME SETTINGS");

        GroupLayout headPanelLayout = new GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(headingText)
                .addGap(212, 212, 212))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(headingText)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        gameTimeLabel.setFont(new Font("Ink Free", 1, 18)); // NOI18N
        gameTimeLabel.setText("GAME TIME:");

        waitingTimeLabel.setFont(new Font("Ink Free", 1, 18)); // NOI18N
        waitingTimeLabel.setText("WAITING TIME:");

        gameTimeInput.setFont(new Font("Ebrima", 2, 14)); // NOI18N
        gameTimeInput.setText("Type here...");

        waitingTimeInput.setFont(new Font("Ebrima", 2, 14)); // NOI18N
        waitingTimeInput.setText("Type here...");
        waitingTimeInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                waitingTimeInputActionPerformed(evt);
            }
        });

        saveButton.setBackground(new Color(0, 102, 51));
        saveButton.setFont(new Font("Comic Sans MS", 1, 18)); // NOI18N
        saveButton.setForeground(new Color(255, 255, 102));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(waitingTimeLabel)
                            .addComponent(gameTimeLabel))
                        .addGap(52, 52, 52)
                        .addComponent(gameTimeInput, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(296, Short.MAX_VALUE)
                    .addComponent(waitingTimeInput, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                    .addGap(176, 176, 176)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(waitingTimeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(gameTimeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameTimeInput, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(waitingTimeInput, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void waitingTimeInputActionPerformed(ActionEvent evt) {//GEN-FIRST:event_waitingTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waitingTimeInputActionPerformed

    private void saveButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed





}
