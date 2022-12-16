package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 500);
        app.setTitle("Simple Calculator");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    String operation = cbOperations.getSelectedItem().toString();
                    switch (operation) {
                        case "+":
                            tfResult.setText(String.valueOf(num1 + num2));
                            break;
                        case "-":
                            tfResult.setText(String.valueOf(num1 - num2));
                            break;
                        case "*":
                            tfResult.setText(String.valueOf(num1 * num2));
                            break;
                        case "/":
                            tfResult.setText(String.valueOf(num1 / num2));
                            if(num2 == 0) {
                                tfResult.setText("Syntax Error");
                            }
                            break;
                    }

                    if(num2 == 0 && operation.equals("/")) {
                        throw new ArithmeticException("Invalid operation. Please try again.");
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(pnlMain, "Input must be a number.");
                } catch (ArithmeticException exception) {
                    JOptionPane.showMessageDialog(pnlMain, exception.getMessage());
                }
            }
        });
    }
}
