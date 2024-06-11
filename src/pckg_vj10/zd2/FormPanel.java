package pckg_vj10.zd2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JTextField txtField;
    private JComboBox combo;
    private JRadioButton rbtnMnth;
    private JRadioButton rbtnQuart;
    private  JButton btnOK;
    private JButton btnList;
    private JTextField txtGodina;
    private FormEvent formEvent;
    private DataPanel dataPanel;

    public FormPanel(DataPanel dataPanel){
        this.dataPanel = dataPanel;
        this.formEvent = new FormEvent(this);
        createComp();
        layoutComponents();
        activateForm();

    }


    private void createComp() {

        txtField = new JTextField();
        txtField.setColumns(5);
        rbtnMnth = new JRadioButton("Mjesecno placanje");
        rbtnQuart = new JRadioButton("Kvartalno placanje");
        btnOK = new JButton("Izracunaj");
        btnList = new JButton("Prikazi");
        combo = new JComboBox<>();
        for (int  i = 5; i <= 11; i++) {
            combo.addItem(i);
        }
        txtGodina = new JTextField();
        txtGodina.setColumns(5);

        ButtonGroup group = new ButtonGroup();
        group.add(rbtnMnth);
        group.add(rbtnQuart);

    }

    public void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Visina kredita:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Godina otplate:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtGodina, gbc);
        add(Box.createVerticalStrut(50), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Kamatna stopa:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(combo, gbc);
        add(Box.createVerticalStrut(50), gbc);



        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(rbtnMnth, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;



        gbc.gridwidth = 1;

        gbc.anchor = GridBagConstraints.LINE_START;
        add(rbtnQuart, gbc);
        add(Box.createVerticalStrut(58), gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;

        gbc.anchor = GridBagConstraints.LINE_START;
        add(btnOK, gbc);
        add(Box.createHorizontalStrut(20), gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;

        gbc.anchor = GridBagConstraints.LINE_START;
        add(btnList, gbc);

    }

    public void activateForm() {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float kreda = Integer.parseInt(txtField.getText());
                System.out.println(combo.getSelectedItem());
                Object kamat = combo.getSelectedItem();
                Float kamata = Float.parseFloat(kamat.toString());

                int godina = Integer.parseInt(txtGodina.getText());
                int nacin = rbtnMnth.isSelected() ? 0 : 1;

                Calculation calc = new Calculation(kreda, kamata, nacin, godina);

                formEvent.setCals(calc);
                dataPanel.showCalculations(formEvent.getCals());
            }
        });

        btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPanel.showCalculations(formEvent.getCals());
            }
        });
    }

}
