package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.swing.SwingMoneyDisplay;


public class MainFrame extends JFrame{
    private MoneyDisplay moneyDisplay;

    public MainFrame(){
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        add(label("Hola"), BorderLayout.NORTH);
        add(moneyDisplayPanel());
    }

    public MoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }

    private Component label(String value) {
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(value));
        return jPanel;
    }

    private Component moneyDisplayPanel() {
        SwingMoneyDisplay swingMoneyDisplay = new SwingMoneyDisplay();
        moneyDisplay = swingMoneyDisplay;
        return swingMoneyDisplay;
    }
    
}
