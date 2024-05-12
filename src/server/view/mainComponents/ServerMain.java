package server.view.mainComponents;

import server.view.serverPages.GameSettings;
import server.view.serverPages.manageUsers.ManageUsers;
import javax.swing.*;


public class ServerMain extends JFrame {
    private GameSettings settings;
    private ManageUsers manageUsers;
    private JLabel sideProfileLabel;
    private JLabel mainMenuLabel;
    private server.view.mainComponents.Header serverHeader;
    private server.view.mainComponents.ServerMenu serverMenu;
    private JPanel serverMenuPanel;
    private JPanel shrekImagePanel;
    // End of variables declaration
    /**
     * Creates new form ServerMain
     */
    public ServerMain() {
        initComponents();
        settings = new GameSettings();
        manageUsers = new ManageUsers();

    }

    private void initComponents() {

        serverMenuPanel = new JPanel();
        serverMenu = new ServerMenu();
        shrekImagePanel = new JPanel();
        sideProfileLabel = new JLabel();
        mainMenuLabel = new JLabel();
        serverHeader = new Header();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setLocationByPlatform(true);
        setUndecorated(true);

        serverMenuPanel.setBackground(new java.awt.Color(141, 167, 80));

        serverMenu.setOpaque(true);

        shrekImagePanel.setBackground(new java.awt.Color(153, 153, 0));
        shrekImagePanel.setPreferredSize(new java.awt.Dimension(392, 320));

        sideProfileLabel.setIcon(new ImageIcon("src/server/view/icons/canal_ni_shrek.gif"));
        GroupLayout shrekImagePanelLayout = new GroupLayout(shrekImagePanel);
        shrekImagePanel.setLayout(shrekImagePanelLayout);
        shrekImagePanelLayout.setHorizontalGroup(
                shrekImagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(shrekImagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sideProfileLabel,GroupLayout.PREFERRED_SIZE, 392,GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shrekImagePanelLayout.setVerticalGroup(
                shrekImagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, shrekImagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sideProfileLabel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        mainMenuLabel.setIcon(new ImageIcon("src/server/view/icons/shrek_is_love.gif")); // NOI18N
        GroupLayout serverMenuPanelLayout = new GroupLayout(serverMenuPanel);
        serverMenuPanel.setLayout(serverMenuPanelLayout);
        serverMenuPanelLayout.setHorizontalGroup(
                serverMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(serverMenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(serverMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(shrekImagePanel,GroupLayout.PREFERRED_SIZE, 404,GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serverMenu,GroupLayout.PREFERRED_SIZE, 404,GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(mainMenuLabel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(serverHeader,GroupLayout.Alignment.TRAILING,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        serverMenuPanelLayout.setVerticalGroup(
                serverMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(serverMenuPanelLayout.createSequentialGroup()
                                .addComponent(serverHeader,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(serverMenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(serverMenuPanelLayout.createSequentialGroup()
                                                .addComponent(shrekImagePanel,GroupLayout.PREFERRED_SIZE, 303,GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(serverMenu,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(mainMenuLabel,GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );

        getContentPane().add(serverMenuPanel, java.awt.BorderLayout.CENTER);

        pack();
    }
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {UIManager.setLookAndFeel(info.getClassName());
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

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerMain().setVisible(true);
            }
        });
    }


}
