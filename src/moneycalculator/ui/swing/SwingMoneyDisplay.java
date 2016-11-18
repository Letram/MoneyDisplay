
package moneycalculator.ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;


public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
    }

    private Component amount(Money money) {
        return new JLabel(String.valueOf(money.getAmount()));
    }

    private Component currency(Money money) {
        return new JLabel(money.getCurrency().getSymbol());
    }

    @Override
    public void display(Money money) {
        removeAll();
        add(amount(money));
        add(currency(money));
    }

}
