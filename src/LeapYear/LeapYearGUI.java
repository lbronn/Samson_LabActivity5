package LeapYear;

import javax.swing.*;
import java.awt.event.*;

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
                int year = Integer.parseInt(tfYear.getText());
                if (year % 4 == 0) {
                    JOptionPane.showMessageDialog(pnlMain, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                }
            }
        });

        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //none
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int year = Integer.parseInt(tfYear.getText());
                    if (year % 4 == 0) {
                        JOptionPane.showMessageDialog(pnlMain, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //none
            }
        });
    }
}
