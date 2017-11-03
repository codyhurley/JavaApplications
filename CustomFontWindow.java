import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CustomFontWindow extends JFrame{
	
	JTextField wordHolder;
	
	JPanel p1;
	
	JRadioButton arialButton;
	JRadioButton timesButton;
	JRadioButton verdanaButton;
	
	ButtonGroup bGroup;
	
	Font f;
	
	JCheckBox boldCheck;
	JCheckBox colorCheck;
	
	private final int WINDOW_WIDTH = 320; // Window width
	private final int WINDOW_HEIGHT = 200; // Window height
	
	
	public CustomFontWindow () {
		
		super("Font Customizer");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f = new Font("Arial", Font.PLAIN, 15);
		
		p1 = new JPanel();
		
		wordHolder = new JTextField(30);
		
		arialButton = new JRadioButton("Arial");
		timesButton = new JRadioButton("Times");
		verdanaButton = new JRadioButton("Verdana");
		
		boldCheck = new JCheckBox("Bold");
		colorCheck = new JCheckBox("Color");
		
		add(p1);
		
		p1.add(wordHolder);
		
		bGroup = new ButtonGroup();
		bGroup.add(arialButton);
		bGroup.add(timesButton);
		bGroup.add(verdanaButton);
		
		p1.add(arialButton);
		p1.add(timesButton);
		p1.add(verdanaButton);
		
		p1.add(boldCheck);
		p1.add(colorCheck);
		
		arialButton.addActionListener(new FontChange());
		timesButton.addActionListener(new FontChange());
		verdanaButton.addActionListener(new FontChange());
		
		boldCheck.addItemListener(new checkbox());
		colorCheck.addItemListener(new checkbox());
		
		setVisible(true);
		
	}
	
	public class FontChange implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == arialButton) {
				wordHolder.setFont(new Font("Arial", Font.PLAIN, 15));
			} else if (e.getSource() == timesButton) {
				wordHolder.setFont(new Font("Times", Font.PLAIN, 15));
			} else if (e.getSource() == verdanaButton) {
				wordHolder.setFont(new Font("Verdana", Font.PLAIN, 15));
			}
			
		}
	
	}
	
	public class checkbox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			
			if (boldCheck.isSelected() == true) {
				wordHolder.setFont(new Font(f.getFontName(), Font.BOLD, f.getSize()));
			} else {
				wordHolder.setFont(new Font(f.getFontName(), Font.PLAIN, f.getSize()));
			}
			
			if (colorCheck.isSelected() == true) {
				wordHolder.setForeground(Color.RED);
			} else {
				wordHolder.setForeground(Color.BLACK);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new CustomFontWindow();
	}
}
