package com.yeyintlwin;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

	private JTextField firstNumber = new JTextField(10);
	private JLabel additionaLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	public CalculatorView() {

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		calcPanel.add(firstNumber);
		calcPanel.add(additionaLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		this.add(calcPanel);
	}

	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalculationSolution() {
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalculationSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));

	}

	void addCalculationListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}

	void setErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
