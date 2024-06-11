package pckg_vj10.zd2;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private DataPanel dataPanel;
    private FormPanel formPanel;
    public MainFrame() {
        super("Kalkulator kredita");

        activateApp();
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        createComp();
    }

    private void createComp(){
        dataPanel = new DataPanel();
        formPanel = new FormPanel(dataPanel);
        setLayout(new BorderLayout());
        dataPanel.setSize(200, 500);
        add(dataPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);
    }
    private void activateApp(){



    }

}
