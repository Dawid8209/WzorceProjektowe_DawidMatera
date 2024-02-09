package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private View.CalculatorView theView;
    private Model.CalculatorModel theModel;

    public CalculatorController(View.CalculatorView theView, Model.CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                switch (e.getActionCommand()) {
                    case "+":
                        theModel.addTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "-":
                        theModel.subtractTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "*":
                        theModel.multiplyTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "/":
                        theModel.divideTwoNumbers(firstNumber, secondNumber);
                        break;
                }

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}