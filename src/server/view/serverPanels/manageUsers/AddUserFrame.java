package server.view.serverPanels.manageUsers;

import server.MainServer;
import server.model.ParseDatabase;
import server.model.SetJTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUserFrame extends JFrame {
    private JButton addButton;
    private JPanel addUserMainPanel;
    private JButton cancelButton;
    private JPanel headerPanel;
    private JPanel innerPanel;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JTextField jPasswordField1;
    private JSeparator jSeparator1;
    private JLabel passwordLabel;
    private JTextField usernameInput;
    private JLabel usernameLabel;
    private JPanel usersPanel;

    public AddUserFrame() {
        initComponents();
    }

    private void initComponents() {

        addUserMainPanel = new JPanel();
        usersPanel = new JPanel();
        headerPanel = new JPanel();
        jLabel2 = new JLabel();
        innerPanel = new JPanel();
        jPanel1 = new JPanel();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        usernameInput = new JTextField();
        jPasswordField1 = new JTextField();
        jSeparator1 = new JSeparator();
        addButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        addUserMainPanel.setBackground(new Color(83, 123, 47));

        usersPanel.setBackground(new Color(228, 235, 156));

        headerPanel.setBackground(new Color(45, 81, 40));

        jLabel2.setBackground(new Color(0, 102, 51));
        jLabel2.setFont(new Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new Color(204, 204, 0));
        jLabel2.setText("ADD ACCOUNT");

        GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(390, 390, 390))
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel2))
        );

        innerPanel.setBackground(new Color(255, 255, 204));

        jPanel1.setBackground(new Color(153, 153, 0));

        usernameLabel.setFont(new Font("Ink Free", 1, 24)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new Font("Ink Free", 1, 24)); // NOI18N
        passwordLabel.setText("Password:");

        usernameInput.setFont(new Font("Ebrima", 2, 14)); // NOI18N
        usernameInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new Color(255, 255, 0));
        jSeparator1.setForeground(new Color(255, 255, 0));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(passwordLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(usernameLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(usernameInput, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(131, Short.MAX_VALUE))
                        .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108))
        );

        GroupLayout innerPanelLayout = new GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
                innerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, innerPanelLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        innerPanelLayout.setVerticalGroup(
                innerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(innerPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        GroupLayout usersPanelLayout = new GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(usersPanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(innerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(84, Short.MAX_VALUE))
        );
        usersPanelLayout.setVerticalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(usersPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(innerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 82, Short.MAX_VALUE))
        );

        addButton.setBackground(new Color(45, 81, 40));
        addButton.setFont(new Font("Comic Sans MS", 1, 14)); // NOI18N
        addButton.setForeground(new Color(255, 255, 102));
        addButton.setText("ADD");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new Color(45, 81, 40));
        cancelButton.setFont(new Font("Comic Sans MS", 1, 14)); // NOI18N
        cancelButton.setForeground(new Color(255, 255, 102));
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
            }
        });

        GroupLayout addUserMainPanelLayout = new GroupLayout(addUserMainPanel);
        addUserMainPanel.setLayout(addUserMainPanelLayout);
        addUserMainPanelLayout.setHorizontalGroup(
                addUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(addUserMainPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(usersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
                        .addGroup(addUserMainPanelLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))
        );
        addUserMainPanelLayout.setVerticalGroup(
                addUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(addUserMainPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(usersPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(addUserMainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(addUserMainPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(addUserMainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void addButtonActionPerformed(ActionEvent evt) {
        ParseDatabase parseDatabase = new ParseDatabase();
        String username = usernameInput.getText();
        String password = new String(jPasswordField1.getText());

        if (!username.isEmpty() && !password.isEmpty()) {
            // Here, you would typically add the user to your system
            // For demonstration purposes, let's just print the entered username and password
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            // You may want to clear the input fields after adding the user
            usernameInput.setText("");
            jPasswordField1.setText("");
            parseDatabase.setConnection();
            parseDatabase.addUser(username,password);
            dispose();

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainServer.serverMain.manageUsersPanel.setJTable1(new SetJTable().setUsersTable());
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelButtonActionPerformed(ActionEvent evt) {
        // Close the frame or perform other actions on cancel
        dispose();
    }

    private void usernameInputActionPerformed(ActionEvent evt) {
        // Additional action on username input if needed
    }
}
