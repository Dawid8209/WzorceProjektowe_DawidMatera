package ujd.calculator.View;

import ujd.calculator.Model.*;
import ujd.calculator.Controller.CalculatorController;

public class CalculatorView extends Calculator{
    
        public static void main(String args[]) {
            Calculator calculator = new Calculator();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    calculator.setVisible(true);
                }
        });
    }
}