package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setTitle("Leap Year Checker");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                JOptionPane.showMessageDialog(pnlMain, "Leap year");
                            } else {
                                JOptionPane.showMessageDialog(pnlMain, "Leap year");
                            }
                        } else {
                            JOptionPane.showMessageDialog(pnlMain, "Leap year");
                        }
                    } else {
                        JOptionPane.showMessageDialog(pnlMain, "Not a leap year.");
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(pnlMain, "Please enter a valid year.");
                }
            }
        });
    }
}
