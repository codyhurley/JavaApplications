import javax.swing.*;
import java.awt.*;

public class ColorPanels {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Color program that has caused SO many migraines...");
		JPanel backdrop = new JPanel();
		JPanel blue = new JPanel();
		JLabel blueLabel = new JLabel("Blue");
		JPanel black = new JPanel();
		JLabel blackLabel = new JLabel("Black");
		JPanel red = new JPanel();
		JLabel redLabel = new JLabel("Red");
		
		frame.setLayout(null);
		backdrop.setLayout(null);
		blue.setLayout(null);
		black.setLayout(null);
		red.setLayout(null);
		
		frame.setSize(600, 400);
		frame.setLocation(100, 100);
		
		
		backdrop.setSize(600, 400);
		backdrop.setLocation(0, 0);
		backdrop.setBackground(Color.WHITE);
		frame.add(backdrop);
		
		
		blue.setSize(70, 70);
		blue.setLocation(90, 30);
		blue.setBackground(Color.BLUE);
		blue.add(blueLabel);
		backdrop.add(blue);
		
		
		black.setSize(70, 70);
		black.setLocation(180, 30);
		black.setBackground(Color.BLACK);
		black.add(blackLabel);
		backdrop.add(black);
		
		
		
		red.setSize(70, 70);
		red.setLocation(270, 30);
		red.setBackground(Color.RED);
		red.add(redLabel);
		backdrop.add(red);
		
		
		
		
		
		
		blue.setSize(300, 300);
		blue.setLocation(30, 50);
		
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
