/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package server.view.serverPanels.manageUsers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditUserPanel extends JPanel {
    private JButton cancelButton;
    private JComboBox<String> editComboBox;
    private JLabel editLabel;
    private JPanel editUserMainPanel;
    private JButton jButton2;
    private JLabel jLabel2;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JPanel usersPanel;

    public EditUserPanel() {
        initComponents();
    }

    private void initComponents() {

        editUserMainPanel = new JPanel();
        usersPanel = new JPanel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        cancelButton = new JButton();
        editComboBox = new JComboBox<>();
        editLabel = new JLabel();

        editUserMainPanel.setBackground(new Color(83, 123, 47));

        usersPanel.setBackground(new Color(228, 235, 156));

        jPanel2.setBackground(new Color(45, 81, 40));

        jLabel2.setBackground(new Color(0, 102, 51));
        jLabel2.setFont(new Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new Color(204, 204, 0));
        jLabel2.setText("SEARCH:");

        jTextField1.setFont(new Font("Candara Light", 2, 12)); // NOI18N
        jTextField1.setText("Search here...");
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(153, 153, 0));
        jButton2.setFont(new Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("ENTER");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                                        .addComponent(jTextField1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
        );

        jTable1.setBackground(new Color(228, 235, 156));
        jTable1.setFont(new Font("Century Gothic", 1, 12)); // NOI18N
        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "ID", "Username", "Password", "High Score"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        GroupLayout usersPanelLayout = new GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1047, GroupLayout.PREFERRED_SIZE)
        );
        usersPanelLayout.setVerticalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(usersPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 733, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        cancelButton.setBackground(new Color(45, 81, 40));
        cancelButton.setFont(new Font("Comic Sans MS", 1, 14)); // NOI18N
        cancelButton.setForeground(new Color(255, 255, 102));
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editComboBox.setBackground(new Color(45, 81, 40));
        editComboBox.setFont(new Font("Comic Sans MS", 1, 14)); // NOI18N
        editComboBox.setForeground(new Color(255, 255, 102));
        editComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "USERNAME", "PASSWORD", " ", " " }));
        editComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editComboBoxActionPerformed(evt);
            }
        });

        editLabel.setFont(new Font("Century Gothic", 1, 18)); // NOI18N
        editLabel.setForeground(new Color(255, 255, 255));
        editLabel.setText("EDIT:");

        GroupLayout editUserMainPanelLayout = new GroupLayout(editUserMainPanel);
        editUserMainPanel.setLayout(editUserMainPanelLayout);
        editUserMainPanelLayout.setHorizontalGroup(
                editUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(editUserMainPanelLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(editLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editComboBox, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201))
                        .addGroup(editUserMainPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(usersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(63, Short.MAX_VALUE))
        );
        editUserMainPanelLayout.setVerticalGroup(
                editUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(editUserMainPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(usersPanel, GroupLayout.PREFERRED_SIZE, 766, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(editUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editComboBox)
                                        .addComponent(editLabel))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(editUserMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 924, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(editUserMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cancelButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void editComboBoxActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }





}
