package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setTitle("Food Ordering System");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double order = 0;
                if (cPizza.isSelected()) {
                    order += 100;
                }
                if (cBurger.isSelected()) {
                    order += 80;
                }
                if (cFries.isSelected()) {
                    order += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    order += 55;
                }
                if (cTea.isSelected()) {
                    order += 50;
                }
                if (cSundae.isSelected()) {
                    order += 40;
                }
                if (rb5.isSelected()) {
                    order -= 0.05 * order;
                }
                if (rb10.isSelected()) {
                    order -= 0.10 * order;
                }
                if (rb15.isSelected()) {
                    order -= 0.15 * order;
                }
                if (rbNone.isSelected()) {
                    order -= 0;
                }
                JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", order));
            }
        });
    }
}
