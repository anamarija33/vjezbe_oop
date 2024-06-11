package pckg_vj10.zd2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DataPanel extends JPanel {
    private JTextField payment;
    private JTextArea txtAr;

    public DataPanel() {
        txtAr = new JTextArea(30, 30);
        txtAr.setEditable(false);
        payment = new JTextField();
        payment.setEditable(false);
        payment.setColumns(30);
        createComp();
    }

    public void createComp() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JScrollPane(txtAr));
        add(payment);

    }

    public void showCalculations(ArrayList<Calculation> calculations) {
        txtAr.setText("");
        for (Calculation calc : calculations) {
            txtAr.append(calc.toString() + "\n\n");
        }
    }

    public void setData(float data) {
        payment.setText(String.valueOf(data));
    }
}

