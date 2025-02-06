package com.yeyintlwin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

		this.theView = theView;
		this.theModel = theModel;

		this.theView.addCalculationListener(new CalculateListener());
	}

	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;

			try {

				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setCalculationSolution(theModel.getCalculationValue());

			} catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.setErrorMessage("You Need to Enter 2 Integers.");

			}

		}

	}

}
