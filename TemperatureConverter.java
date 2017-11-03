import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
public class TemperatureConverter extends JFrame{
	
	Scanner sc = new Scanner(System.in);
	JTextField cField = new JTextField(10);
	JLabel celsiusLabel = new JLabel("Celsius");
	JTextField fField = new JTextField(10);
	JLabel farenheitLabel = new JLabel("Farenheit");
	JButton jbtConvert;
	double celsius;
	double farenheit;
	
	private final int WINDOW_WIDTH = 360; // Window width
	private final int WINDOW_HEIGHT = 110; // Window height
	
	public TemperatureConverter() {
		
		JButton jbtConvert = new JButton("Convert");
		
		JPanel panel = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add (panel);
		panel.add(p2);
		panel.add(p3);
		p2.add(cField);
		p2.add(celsiusLabel);
		p3.add(fField);
		p3.add(farenheitLabel);
		panel.add(jbtConvert);
		
		fField.setEditable(false);
		
		jbtConvert.addActionListener(new Listener());
		
		setVisible(true);
		
		
	}
	
	public class Listener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			celsius = Double.parseDouble(cField.getText());
			farenheit = ((9/5) * celsius) + 32;
			fField.setText(farenheit + "");
			
			
			
		}
	}
	
	public static void main(String[] args) {
		new TemperatureConverter();
	}
	
}
