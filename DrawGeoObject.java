import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGeoObject extends JFrame {

	private JPanel leftPanel, rightPanel;
	private JCheckBox filled = new JCheckBox ();
	
	JButton drawOval = new JButton ("Draw Oval");
	JButton drawRectangle = new JButton("Draw Rectangle");
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	public DrawGeoObject() {

		setLayout(new GridLayout(1, 2));
		setPreferredSize(new Dimension(500, 800));
		leftPanel = new LeftPanel();
		rightPanel = new RightPanel();
		add(leftPanel);
		add(rightPanel);

		pack();
		setTitle("Draw");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class LeftPanel extends JPanel {
		
		JPanel subPanel1 = new JPanel();
		JPanel subPanel2 = new JPanel();
		JPanel subPanel3 = new JPanel();
		JPanel subPanel4 = new JPanel();
		JPanel subPanel5 = new JPanel();
		JPanel subPanel6 = new JPanel();
			
		JTextField startingX = new JTextField (10);
		JLabel xLabel = new JLabel ("x");
		JTextField startingY = new JTextField (10);
		JLabel yLabel = new JLabel ("y");
		JTextField widthValue = new JTextField (10);
		JLabel widthLabel = new JLabel ("w");
		JTextField heightValue = new JTextField (10);
		JLabel heightLabel = new JLabel ("h");
		
		JLabel fillLabel = new JLabel ("Filled");
		
		
		public LeftPanel() {
			
			setLayout(new GridLayout(6, 1));
			
			add(subPanel1);
			add(subPanel2);
			add(subPanel3);
			add(subPanel4);
			add(subPanel5);
			add(subPanel6);
			
			
			subPanel1.add(xLabel);
			subPanel1.add(startingX);
			
			subPanel2.add(yLabel);
			subPanel2.add(startingY);
			
			subPanel3.add(widthLabel);
			subPanel3.add(widthValue);
			
			subPanel4.add(heightLabel);
			subPanel4.add(heightValue);
			
			subPanel5.add(fillLabel);
			subPanel5.add(filled);
			
			subPanel6.add(drawOval);
			subPanel6.add(drawRectangle);
			
			
			

		}

		private class DrawListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				x = (int) Double.parseDouble(startingX.getText());
				y = (int) Double.parseDouble(startingY.getText());
				width = (int) Double.parseDouble(widthValue.getText());
				height = (int) Double.parseDouble(heightValue.getText());
				
				
			}
		}
		
		
	}

	private class RightPanel extends JPanel {

		

		public RightPanel() {

			setPreferredSize(new Dimension(500, 800));
			setBackground(Color.WHITE);
			
		}
		
		public class OvalListener implements ActionListener {
			public void actionPerformed (ActionEvent e) {
				
				public void paintComponent(Graphics g) {
					super.paintComponent(g);

					g.setColor(Color.BLACK);
			
			
					if (filled.isSelected() == true) {
						g.fillOval(x, y, width, height);
					} else {
						g.drawOval(x, y, width, height);
					}

			repaint();
		}
				
				
		
		}
			public class RectListener implements ActionListener {
				public void actionPerformed (ActionEvent e) {
					
					public void paintComponent(Graphics g) {
						super.paintComponent(g);

						g.setColor(Color.BLACK);
				
				
						if (filled.isSelected() == true) {
							g.fillRect(x, y, width, height);
						} else {
							g.drawRect(x, y, width, height);
						}

				repaint();
			}
					
			

	}

	public static void main(String[] args) {

		new DrawGeoObject();

	}

}