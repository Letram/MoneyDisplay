
package moneycalculator;

import moneycalculator.model.Currency;
import moneycalculator.model.Money;


public class Main {


    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.getMoneyDisplay().display(new Money(400, new Currency("USD", "DOLAR", "$")));
        
    }
}
