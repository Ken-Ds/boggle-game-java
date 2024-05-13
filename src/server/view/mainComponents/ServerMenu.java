package server.view.mainComponents;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerMenu extends JPanel {
    private JButton gameSettingsButton;
    private JPanel gameSettingsButtonPanel;
    private JButton manageUsersButton;
    private JPanel manageUsersButtonPanel;
    // End of variables declaration
    /**
     * Creates new form ServerMenu
     */
    public ServerMenu() {
        initComponents();
        this.setOpaque(false);
    }


    private void initComponents() {

        manageUsersButtonPanel = new JPanel();
        manageUsersButton = new JButton();
        gameSettingsButtonPanel = new JPanel();
        gameSettingsButton = new JButton();

        setBackground(new Color(0, 102, 51));
        setBorder(BorderFactory.createEtchedBorder());

        manageUsersButtonPanel.setPreferredSize(new Dimension(200, 55));
        manageUsersButtonPanel.setBackground(new Color(0, 102, 51));

        manageUsersButton.setBackground(new Color(153, 153, 0));
        manageUsersButton.setFont(new Font("Comic Sans MS", 0, 18)); // NOI18N
        manageUsersButton.setText("MANAGE USERS");
        manageUsersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                manageUsersButtonActionPerformed(evt);
            }
        });

        GroupLayout manageUsersButtonPanelLayout = new GroupLayout(manageUsersButtonPanel);
        manageUsersButtonPanel.setLayout(manageUsersButtonPanelLayout);
        manageUsersButtonPanelLayout.setHorizontalGroup(
                manageUsersButtonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(manageUsersButtonPanelLayout.createSequentialGroup()
                                .addComponent(manageUsersButton, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        manageUsersButtonPanelLayout.setVerticalGroup(
                manageUsersButtonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(manageUsersButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        gameSettingsButtonPanel.setPreferredSize(new Dimension(200, 55));
        gameSettingsButtonPanel.setBackground(new Color(0, 102, 51));
        gameSettingsButton.setBackground(new Color(153, 153, 0));
        gameSettingsButton.setFont(new Font("Comic Sans MS", 0, 18)); // NOI18N
        gameSettingsButton.setText("GAME SETTINGS");
        gameSettingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gameSettingsButtonActionPerformed(evt);
            }
        });

        GroupLayout gameSettingsButtonPanelLayout = new GroupLayout(gameSettingsButtonPanel);
        gameSettingsButtonPanel.setLayout(gameSettingsButtonPanelLayout);
        gameSettingsButtonPanelLayout.setHorizontalGroup(
                gameSettingsButtonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(gameSettingsButton, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        gameSettingsButtonPanelLayout.setVerticalGroup(
                gameSettingsButtonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(gameSettingsButton, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(gameSettingsButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manageUsersButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(manageUsersButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(gameSettingsButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE))
        );
    }

    private void gameSettingsButtonActionPerformed(ActionEvent evt) {

    }

    private void manageUsersButtonActionPerformed(ActionEvent evt) {

    }
}
