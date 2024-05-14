package server.view.mainComponents;

import server.view.serverPanels.GameSettingsPanel;
import server.view.serverPanels.ManageUsersPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerMain extends JFrame {
    private Header header;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    private ManageUsersPanel manageUsersPanel;
    private GameSettingsPanel gameSettingsPanel;

    public ServerMain() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setTitle("BOGGLE SERVER");

        header = new Header();

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        manageUsersPanel = new ManageUsersPanel();
        gameSettingsPanel = new GameSettingsPanel();

        cardPanel.add(manageUsersPanel, "ManageUsers");
        cardPanel.add(gameSettingsPanel, "GameSettings");

        JPanel sideMenuPanel = createSideMenuPanel();
        JPanel mainPanel = createMainPanel();

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(sideMenuPanel, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(header, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(sideMenuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0))
        );

        pack();
    }

    private JPanel createSideMenuPanel() {
        JPanel sideMenuPanel = new JPanel();
        sideMenuPanel.setBackground(new Color(153, 153, 0));
        sideMenuPanel.setBorder(BorderFactory.createEtchedBorder());
        sideMenuPanel.setPreferredSize(new Dimension(400, 900));

        JLabel titlePanel = new JLabel("BOGGLE SERVER");
        titlePanel.setFont(new Font("Bookman Old Style", Font.BOLD, 36));
        titlePanel.setForeground(new Color(102, 102, 0));

        JPanel serverOptionsPanel = new JPanel();
        serverOptionsPanel.setBackground(new Color(0, 102, 51));
        serverOptionsPanel.setBorder(BorderFactory.createEtchedBorder());

        JButton manageUsersButton = new JButton("MANAGE USERS");
        manageUsersButton.setBackground(new Color(153, 153, 0));
        manageUsersButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        manageUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "ManageUsers");
            }
        });

        JButton gameSettingsButton = new JButton("GAME SETTINGS");
        gameSettingsButton.setBackground(new Color(153, 153, 0));
        gameSettingsButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        gameSettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "GameSettings");
            }
        });

        JButton exitButton = new JButton("EXIT");
        exitButton.setBackground(new Color(153, 153, 0));
        exitButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        exitButton.setPreferredSize(new Dimension(200, 100));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Exit action
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to exit the application?", "Confirm Exit",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        GroupLayout serverOptionsPanelLayout = new GroupLayout(serverOptionsPanel);
        serverOptionsPanel.setLayout(serverOptionsPanelLayout);
        serverOptionsPanelLayout.setHorizontalGroup(
                serverOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(serverOptionsPanelLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(serverOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(manageUsersButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gameSettingsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(113, 113, 113))
        );
        serverOptionsPanelLayout.setVerticalGroup(
                serverOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(serverOptionsPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(manageUsersButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(gameSettingsButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        JPanel sideImagePlaceholderPanel = new JPanel();
        sideImagePlaceholderPanel.setBackground(new Color(102, 102, 0));
        sideImagePlaceholderPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 0)));

        JLabel sideProfileLabel = new JLabel(".");
        sideProfileLabel.setIcon(new ImageIcon("src/server/view/icons/canal.gif"));

        GroupLayout sideImagePlaceholderPanelLayout = new GroupLayout(sideImagePlaceholderPanel);
        sideImagePlaceholderPanel.setLayout(sideImagePlaceholderPanelLayout);
        sideImagePlaceholderPanelLayout.setHorizontalGroup(
                sideImagePlaceholderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideImagePlaceholderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sideProfileLabel, GroupLayout.PREFERRED_SIZE, 403, Short.MAX_VALUE)
                                .addContainerGap())
        );
        sideImagePlaceholderPanelLayout
                .setVerticalGroup(
                        sideImagePlaceholderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(sideProfileLabel, GroupLayout.PREFERRED_SIZE, 309, Short.MAX_VALUE)
                );

        GroupLayout sideMenuPanelLayout = new GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
                sideMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sideMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(serverOptionsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(sideMenuPanelLayout.createSequentialGroup()
                                                .addComponent(sideImagePlaceholderPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, sideMenuPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titlePanel)
                                .addGap(31, 31, 31))
        );
        sideMenuPanelLayout.setVerticalGroup(
                sideMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titlePanel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sideImagePlaceholderPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serverOptionsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        return sideMenuPanel;


    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        mainPanel.add(cardPanel, BorderLayout.CENTER);

        return mainPanel;
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServerMain serverMain = new ServerMain();
                serverMain.setVisible(true);
                serverMain.setLocationRelativeTo(null); // Center the frame

            }
        });
    }
}

