import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
public class LoanCalculator extends JFrame{
	
	NumberFormat formatter = new DecimalFormat ("#0.00");
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JPanel p6;
	
	JTextField annualIRate;
	JLabel annualLabel;
	JTextField numOfYears;
	JLabel yearLabel;
	JTextField loanAmount;
	JLabel loanLabel;
	JTextField monthlyPay;
	JLabel monthlyLabel;
	JTextField totalPay;
	JLabel totalLabel;
	JButton calculate;
	
	
	double annInterestRate;
	double monthlyInterestRate;
	int yearCount;
	double loanMoney;
	double paymentMonth;
	double paymentTotal;
	
	
	private final int WINDOW_WIDTH = 360; // Window width
	private final int WINDOW_HEIGHT = 400; // Window height
	
	public LoanCalculator() {
		
		super("Loan Calculator");
		setLayout(new GridLayout(6,1));
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		
		
		
		annualIRate = new JTextField(20);
		numOfYears = new JTextField(20);
		loanAmount = new JTextField(20);
		monthlyPay = new JTextField(20);
		totalPay = new JTextField(20);
		calculate = new JButton("Compute Payment");
		
		annualLabel = new JLabel("Annual Interest Rate");
		yearLabel = new JLabel("Number of Years");
		loanLabel = new JLabel("Loan Amount");
		monthlyLabel = new JLabel("Monthly Payment");
		totalLabel = new JLabel("Total Payment");
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		
		p1.add(annualLabel);
		p1.add(annualIRate);
		
		p2.add(yearLabel);
		p2.add(numOfYears);
		
		p3.add(loanLabel);
		p3.add(loanAmount);
		
		p4.add(monthlyLabel);
		p4.add(monthlyPay);
		
		p5.add(totalLabel);
		p5.add(totalPay);
		
		p6.add(calculate);
		
		
		monthlyPay.setEditable(false);
		totalPay.setEditable(false);
		
		calculate.addActionListener(new Listener());
		
		
		
		setVisible(true);
		
	}
	
	public class Listener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			annInterestRate = Double.parseDouble(annualIRate.getText());
			yearCount = (int) Double.parseDouble(numOfYears.getText());
			loanMoney = Double.parseDouble(loanAmount.getText());
			monthlyInterestRate = annInterestRate / 1200;
			paymentMonth =  loanMoney * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, yearCount * 12)));
			paymentTotal = paymentMonth * yearCount * 12;
			
			monthlyPay.setText(formatter.format(paymentMonth) + "");
			totalPay.setText(formatter.format(paymentTotal) + "");

			
			
			
		}
	}
	
	public static void main(String[] args) {
		new LoanCalculator();
	}
	
}
