package View;

import javax.swing.SwingUtilities;

import Controller.CalculatorController;
import Model.CalculatorModel;
import View.CalculatorView;

public class MVCCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                View.CalculatorView theView = new CalculatorView();
                Model.CalculatorModel theModel = new CalculatorModel();
                Controller.CalculatorController theController = new CalculatorController(theView, theModel);
                theView.setVisible(true);
            }
        });
    }
}