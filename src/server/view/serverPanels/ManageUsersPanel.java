package server.view.serverPanels;

import server.MainServer;
import server.model.ParseDatabase;
import server.model.SetJTable;
import server.view.serverPanels.manageUsers.AddUserFrame;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageUsersPanel extends JPanel {
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton jButton2;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JPanel usersPanel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameInput;
    private JTextField passwordInput;
    private JTextField idInput;


    public ManageUsersPanel() {
        initComponents();
    }

    private void initComponents() {
        usersPanel = new JPanel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        addButton = new JButton();
        editButton = new JButton();
        deleteButton = new JButton();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        usernameInput = new JTextField();
        passwordInput = new JTextField();
        idInput = new JTextField();
        idInput.setEditable(false);
        usernameInput.setPreferredSize(new Dimension(200, 25));
        passwordInput.setPreferredSize(new Dimension(200, 25));
        setBackground(new Color(83, 123, 47));
        setPreferredSize(new Dimension());
        usersPanel.setBackground(new Color(228, 235, 156));
        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Ink Free", 1, 24));
        idInput = new JTextField(); // Initialize the new JTextField for ID
        idInput.setPreferredSize(new Dimension(200, 25)); // Set the preferred size

        JLabel idLabel = new JLabel("ID:"); // Create a label for the ID field
        idLabel.setFont(new Font("Ink Free", 1, 24)); // Set the font

        idLabel.setPreferredSize(new Dimension(120, 25)); // Set the preferred size for the label

        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow >= 0) {
                    String username = jTable1.getModel().getValueAt(selectedRow,1).toString();
                    String password = jTable1.getModel().getValueAt(selectedRow,2).toString();
                    String id = jTable1.getModel().getValueAt(selectedRow,0).toString();
                    usernameInput.setText(username);
                    passwordInput.setText(password);
                    idInput.setText(id);

                }

            }
        });

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Ink Free", 1, 24));

// Set the preferred size for the labels
        usernameLabel.setPreferredSize(new Dimension(120, 25));
        passwordLabel.setPreferredSize(new Dimension(120, 25));

        jPanel1.setBackground(new Color(45, 81, 40));

        jLabel2.setBackground(new Color(0, 102, 51));
        jLabel2.setFont(new Font("Consolas", 0, 18));
        jLabel2.setForeground(new Color(204, 204, 0));
        jLabel2.setText("SEARCH:");

        jTextField1.setFont(new Font("Candara Light", 2, 12));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(153, 153, 0));
        jButton2.setFont(new Font("Comic Sans MS", 0, 12));
        jButton2.setText("ENTER");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                                        .addComponent(jTextField1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
        );

        jTable1.setBackground(new Color(228, 235, 156));
        jTable1.setFont(new Font("Century Gothic", 1, 12));
        jTable1.setModel(new SetJTable().setUsersTable());
        jScrollPane1.setViewportView(jTable1);

        GroupLayout usersPanelLayout = new GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        usersPanelLayout.setVerticalGroup(
                usersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(usersPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        addButton.setBackground(new Color(45, 81, 40));
        addButton.setFont(new Font("Comic Sans MS", 1, 14));
        addButton.setForeground(new Color(255, 255, 102));
        addButton.setText("ADD");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new Color(45, 81, 40));
        editButton.setFont(new Font("Comic Sans MS", 1, 14));
        editButton.setForeground(new Color(255, 255, 102));
        editButton.setText("EDIT");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new Color(45, 81, 40));
        deleteButton.setFont(new Font("Comic Sans MS", 1, 14));
        deleteButton.setForeground(new Color(255, 255, 102));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(usersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(usernameInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(passwordInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(idInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(editButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(33, 33, 33)))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(usersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

    }

    private void addButtonActionPerformed(ActionEvent evt) {
        // Open AddUserFrame when Add button is clicked
        AddUserFrame addUserFrame = new AddUserFrame();
        addUserFrame.setVisible(true);
        addUserFrame.setLocationRelativeTo(this);
    }

    private void editButtonActionPerformed(ActionEvent evt) {
        ParseDatabase parseDatabase = new ParseDatabase();
        parseDatabase.setConnection();
        String username = usernameInput.getText();
        String password = passwordInput.getText();
        int id = Integer.parseInt(idInput.getText());
        parseDatabase.editUser(id,username,password);
        jTable1.setModel(new SetJTable().setUsersTable());

    }

    private void deleteButtonActionPerformed(ActionEvent evt) {
        ParseDatabase parseDatabase = new ParseDatabase();
        parseDatabase.setConnection();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow >= 0 ){
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
            String id =(String) model.getValueAt(selectedRow,0);
            parseDatabase.deleteUser(Integer.parseInt(id));
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainServer.serverMain.manageUsersPanel.setJTable1(new SetJTable().setUsersTable());
            }
        });
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if(!jTextField1.getText().equals("")) {
            jTable1.setModel(new SetJTable().searchTable(jTextField1.getText()));
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainServer.serverMain.manageUsersPanel.setJTable1(new SetJTable().searchTable(jTextField1.getText()));
                }
            });
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainServer.serverMain.manageUsersPanel.setJTable1(new SetJTable().setUsersTable());
                }
            });
        }
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void setJTable1(DefaultTableModel defaultTableModel){
        jTable1.setModel(defaultTableModel);
    }
}
