import javax.swing.*;
import java.awt.*;
public class TestFigurePanel extends JFrame {
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JPanel p6;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 300;
	
	public void paintX(Graphics g) {
		super.paint(g);
		
		g.drawLine(0, 0, 100, 100);
		g.drawLine(100, 100, 0, 0);
	}
	
	public class panels extends JPanel {
		
		public panels() {
			p1 = new JPanel();
			p2 = new JPanel();
			p3 = new JPanel();
			p4 = new JPanel();
			p5 = new JPanel();
			p6 = new JPanel();
		}
		
		public void paintX(Graphics g) {
			p1.paint(g);
			
			g.drawLine(0, 0, 100, 100);
			g.drawLine(100, 100, 0, 0);
		}
		
		public void paintRec(Graphics g) {
			p2.paint(g);
			
			g.drawRect(0, 0, 100, 100);
		}
		
		public void paintRouRec(Graphics g) {
			p3.paint(g);
			
			g.drawRoundRect(0, 0, 100, 100, 10, 10);
		}
		
		public void paintOval(Graphics g) {
			p4.paint(g);
			
			g.drawOval(0, 0, 100, 100);
		}
		
		public void paintFillRect(Graphics g) {
			p5.paint(g);
			
			g.fillRect(0, 0, 100, 100);
		}
		
		public void paintFillRouRect(Graphics g) {
			p6.paint(g);
			
			g.fillRoundRect(0, 0, 100, 100, 10, 10);
		}
		
		
		
		
	}
	
	public TestFigurePanel() {
		
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 3));
		
		new panels();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		
		p1.add(new panels());
		p2.add(new panels());
		p3.add(new panels());
		p4.add(new panels());
		p5.add(new panels());
		p6.add(new panels());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFigurePanel();
	}
	
}
