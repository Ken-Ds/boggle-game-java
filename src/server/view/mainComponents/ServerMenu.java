package server.view.mainComponents;


import javax.swing.JPanel;
import java.awt.event.ActionEvent;

public class ServerMenu extends JPanel {
    private javax.swing.JButton gameSettingsButton;
    private javax.swing.JPanel gameSettingsButtonPanel;
    private javax.swing.JButton manageUsersButton;
    private javax.swing.JPanel manageUsersButtonPanel;
    // End of variables declaration
    /**
     * Creates new form ServerMenu
     */
    public ServerMenu() {
        initComponents();
        this.setOpaque(false);
    }


    private void initComponents() {

        manageUsersButtonPanel = new javax.swing.JPanel();
        manageUsersButton = new javax.swing.JButton();
        gameSettingsButtonPanel = new javax.swing.JPanel();
        gameSettingsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 51));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        manageUsersButtonPanel.setPreferredSize(new java.awt.Dimension(200, 55));

        manageUsersButton.setBackground(new java.awt.Color(153, 153, 0));
        manageUsersButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        manageUsersButton.setText("MANAGE USERS");
        manageUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUsersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageUsersButtonPanelLayout = new javax.swing.GroupLayout(manageUsersButtonPanel);
        manageUsersButtonPanel.setLayout(manageUsersButtonPanelLayout);
        manageUsersButtonPanelLayout.setHorizontalGroup(
                manageUsersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manageUsersButtonPanelLayout.createSequentialGroup()
                                .addComponent(manageUsersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        manageUsersButtonPanelLayout.setVerticalGroup(
                manageUsersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(manageUsersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        gameSettingsButtonPanel.setPreferredSize(new java.awt.Dimension(200, 55));

        gameSettingsButton.setBackground(new java.awt.Color(153, 153, 0));
        gameSettingsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        gameSettingsButton.setText("GAME SETTINGS");
        gameSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameSettingsButtonPanelLayout = new javax.swing.GroupLayout(gameSettingsButtonPanel);
        gameSettingsButtonPanel.setLayout(gameSettingsButtonPanelLayout);
        gameSettingsButtonPanelLayout.setHorizontalGroup(
                gameSettingsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gameSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        gameSettingsButtonPanelLayout.setVerticalGroup(
                gameSettingsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gameSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gameSettingsButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manageUsersButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(manageUsersButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(gameSettingsButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE))
        );
    }

    private void gameSettingsButtonActionPerformed(ActionEvent evt) {

    }

    private void manageUsersButtonActionPerformed(ActionEvent evt) {

    }
}
