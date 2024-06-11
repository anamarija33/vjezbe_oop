package pckg_vj10.zd1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JPanel left;
    private JPanel right;
    private JTextField textFld;
    private JButton btn;
    private JTextArea area;
    private JScrollPane scp;
    private JButton resetBtn;

    public MainFrame(){
        // naziv postaviti -> koristiti super()
        super("Application with GUI");
        JFrame frame = new JFrame();
        // veličina 500, 450
        setSize(500,450);

        // EXIT_ON_CLOSE
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // prikaz na sredini ekrana
        setLocationRelativeTo(null);
        // spriječiti promijenu dimenzija
        setResizable(false);
        // postaviti vidljivost na true
        setVisible(true);
        // za inicijalizaciju lijevog panela
        // i njegovih komponenti
        initLeft();
        // razmještaj komponenti na lijevom panelu
        layoutLeft();
        // za inicijalizaciju desnog panela
        // i njegovih komponenti
        initRight();
        // razmještaj komponenti na desnom panelu
        layoutRight();
        // za postavljanje lijevog i desnog panela na MainFrame
        // MainFrame koristi BorderLayout
        layoutAll();
        // aktiviranje forme
        activateFrame();
    }

    private void initRight(){
        area = new JTextArea();
        scp = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    private void layoutRight(){
        right = new JPanel();
        Dimension dims = getPreferredSize();
        dims.width = 350;
        setPreferredSize(dims);


        right.setLayout(new BorderLayout());
        right.add(scp, BorderLayout.CENTER);


    }

    private void initLeft(){
        textFld = new JTextField();
        btn = new JButton("Submit text");
        resetBtn = new JButton("Reset");

    }


    private void layoutLeft(){

        left = new JPanel();
        Dimension dims = getPreferredSize();
        dims.width = 150;
        setPreferredSize(dims);

        left.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // label for text field
        gbc.gridy = 0;
        gbc.gridx = 0;


        left.add(new JLabel("Text:  "), gbc);

        gbc.gridy++;
        // now field
        textFld.setColumns(6);
        left.add(textFld, gbc);

        // empty row
        gbc.gridy++;
        Component bx = Box.createVerticalStrut(250);
        left.add(bx, gbc);
        // now button
        gbc.weighty = 0.45;
        gbc.gridy++;


        left.add(btn, gbc);
        // now reset button
        gbc.gridy++;
        left.add(resetBtn, gbc);

    }

    private void layoutAll(){
        setLayout(new BorderLayout());
        // lijevi dodati u WEST
        add(left, BorderLayout.WEST);
        // desni dodati u CENTER
        add(right, BorderLayout.CENTER);

    }

    private void activateFrame(){

        // za btn Submit text
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textFld.getText();
                area.append(text+"\n");
            }
        });



        // za bnt Reset
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.selectAll();
                area.replaceSelection(null);
                area.requestFocus();
            }
        });



    }

}



