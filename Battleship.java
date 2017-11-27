import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Battleship extends JFrame{
	
	private JPanel turnPanel, fieldPanel, spacePanel, oneShipPanel, twoShipPanel, threeShipPanel;
	
	private int turnsTaken = 0;
	private int hit1 = 0;
	private int hit2 = 0;
	private int hit3 = 0;
	private int miss = 0;
	
	
	public Battleship() {
		
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 600));
		turnPanel = new TurnPanel();
		fieldPanel = new FieldPanel();
		spacePanel = new SpacePanel();
		oneShipPanel = new OneShipPanel();
		twoShipPanel = new TwoShipPanel();
		threeShipPanel = new ThreeShipPanel();
		
		add(turnPanel, BorderLayout.NORTH);
		add(fieldPanel, BorderLayout.CENTER);
		
		pack();
		setTitle("Battleship");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private class TurnPanel extends JPanel {
		
		JButton turnCount = new JButton("Turns Taken: " + turnsTaken + "");
		
		public TurnPanel () {
			
			setPreferredSize(new Dimension(600, 40));
			
			add(turnCount);
		}
		
		
	}
	
	private class FieldPanel extends JPanel {
		
		JPanel space1 = new SpacePanel();
		JPanel space2 = new SpacePanel();
		JPanel space3 = new ThreeShipPanel();
		JPanel space4 = new SpacePanel();
		JPanel space5 = new SpacePanel();
		JPanel space6 = new SpacePanel();
		JPanel space7 = new SpacePanel();
		JPanel space8 = new SpacePanel();
		JPanel space9 = new SpacePanel();
		JPanel space10 = space3;
		JPanel space11 = new SpacePanel();
		JPanel space12 = new TwoShipPanel();
		JPanel space13 = space12;
		JPanel space14 = new SpacePanel();
		JPanel space15 = new SpacePanel();
		JPanel space16 = new SpacePanel();
		JPanel space17 = space3;
		JPanel space18 = new SpacePanel();
		JPanel space19 = new SpacePanel();
		JPanel space20 = new SpacePanel();
		JPanel space21 = new SpacePanel();
		JPanel space22 = new SpacePanel();
		JPanel space23 = new SpacePanel();
		JPanel space24 = new SpacePanel();
		JPanel space25 = new SpacePanel();
		JPanel space26 = new SpacePanel();
		JPanel space27 = new SpacePanel();
		JPanel space28 = new SpacePanel();
		JPanel space29 = new SpacePanel();
		JPanel space30 = new SpacePanel();
		JPanel space31 = new SpacePanel();
		JPanel space32 = new SpacePanel();
		JPanel space33 = new OneShipPanel();
		JPanel space34 = new SpacePanel();
		JPanel space35 = new SpacePanel();
		JPanel space36 = new SpacePanel();
		JPanel space37 = new SpacePanel();
		JPanel space38 = new SpacePanel();
		JPanel space39 = new SpacePanel();
		JPanel space40 = new SpacePanel();
		JPanel space41 = new SpacePanel();
		JPanel space42 = new SpacePanel();
		JPanel space43 = new SpacePanel();
		JPanel space44 = new SpacePanel();
		JPanel space45 = new SpacePanel();
		JPanel space46 = new SpacePanel();
		JPanel space47 = new SpacePanel();
		JPanel space48 = new SpacePanel();
		JPanel space49 = new SpacePanel();
		
		
		public FieldPanel() {
			
			setLayout(new GridLayout(7, 7, 2, 2));
			setPreferredSize(new Dimension(600, 570));
			setLocation(0, 41);
			
			add(space1);
			add(space2);
			add(space3);
			add(space4);
			add(space5);
			add(space6);
			add(space7);
			add(space8);
			add(space9);
			add(space10);
			add(space11);
			add(space12);
			add(space13);
			add(space14);
			add(space15);
			add(space16);
			add(space17);
			add(space18);
			add(space19);
			add(space20);
			add(space21);
			add(space22);
			add(space23);
			add(space24);
			add(space25);
			add(space26);
			add(space27);
			add(space28);
			add(space29);
			add(space30);
			add(space31);
			add(space32);
			add(space33);
			add(space34);
			add(space35);
			add(space36);
			add(space37);
			add(space38);
			add(space39);
			add(space40);
			add(space41);
			add(space42);
			add(space43);
			add(space44);
			add(space45);
			add(space46);
			add(space47);
			add(space48);
			add(space49);
			
			space1.addMouseListener(new MissListener());
			space2.addMouseListener(new MissListener());
			space3.addMouseListener(new HitThreeListener());
			space4.addMouseListener(new MissListener());
			space5.addMouseListener(new MissListener());
			space6.addMouseListener(new MissListener());
			space7.addMouseListener(new MissListener());
			space8.addMouseListener(new MissListener());
			space9.addMouseListener(new MissListener());
			space10.addMouseListener(new HitThreeListener());
			space11.addMouseListener(new MissListener());
			space12.addMouseListener(new HitTwoListener());
			space13.addMouseListener(new HitTwoListener());
			space14.addMouseListener(new MissListener());
			space15.addMouseListener(new MissListener());
			space16.addMouseListener(new MissListener());
			space17.addMouseListener(new HitThreeListener());
			space18.addMouseListener(new MissListener());
			space19.addMouseListener(new MissListener());
			space20.addMouseListener(new MissListener());
			space21.addMouseListener(new MissListener());
			space22.addMouseListener(new MissListener());
			space23.addMouseListener(new MissListener());
			space24.addMouseListener(new MissListener());
			space25.addMouseListener(new MissListener());
			space26.addMouseListener(new MissListener());
			space27.addMouseListener(new MissListener());
			space28.addMouseListener(new MissListener());
			space29.addMouseListener(new MissListener());
			space30.addMouseListener(new MissListener());
			space31.addMouseListener(new MissListener());
			space32.addMouseListener(new MissListener());
			space33.addMouseListener(new HitOneListener());
			space34.addMouseListener(new MissListener());
			space35.addMouseListener(new MissListener());
			space36.addMouseListener(new MissListener());
			space37.addMouseListener(new MissListener());
			space38.addMouseListener(new MissListener());
			space39.addMouseListener(new MissListener());
			space40.addMouseListener(new MissListener());
			space41.addMouseListener(new MissListener());
			space42.addMouseListener(new MissListener());
			space43.addMouseListener(new MissListener());
			space44.addMouseListener(new MissListener());
			space45.addMouseListener(new MissListener());
			space46.addMouseListener(new MissListener());
			space47.addMouseListener(new MissListener());
			space48.addMouseListener(new MissListener());
			space49.addMouseListener(new MissListener());
			
			
			public class MissListener implements MouseListener {
				public void mouseClicked(MouseEvent e) {
					turnsTaken += 1;
					miss = 1;
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			}
			
			public class HitOneListener implements MouseListener {
				public void mouseClicked(MouseEvent e) {
					hit1 = 1;
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			}
			
			public class HitTwoListener implements MouseListener {
				public void mouseClicked(MouseEvent e) {
					turnsTaken += 1;
					hit2 = 1;
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			}
			
			public class HitThreeListener implements MouseListener {
				public void mouseClicked(MouseEvent e) {
					turnsTaken += 1;
					hit3 = 1;
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			}
			
			
			
		}
		
	}
	
	private class SpacePanel extends JPanel {
		
		public SpacePanel() {
			
		}
		
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			
			if (miss == 0) {
				g.setColor(Color.BLUE);
			} else if (miss == 1) {
				g.setColor(Color.WHITE);
			}
		}
		
	}
	
	private class OneShipPanel extends JPanel {
		
		public OneShipPanel() {
			
		}
		
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			
			if (hit1 == 0) {
				g.setColor(Color.BLUE);
			} else if (hit1 == 1) {
				g.setColor(Color.RED);
			}
			
			
			
			repaint();
		}
		
		
		
		
	}
	
	private class TwoShipPanel extends JPanel {
		
			public TwoShipPanel() {
			
			}
		
			public void paintComponent (Graphics g) {
				super.paintComponent(g);
			
				if (hit2 == 0) {
					g.setColor(Color.BLUE);
				} else if (hit2 == 1) {
					g.setColor(Color.RED);
				}
			
			
			
				repaint();
			}
		
		
		
		
	}
	
	
	private class ThreeShipPanel extends JPanel {
		
		public ThreeShipPanel() {
		
		}
	
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
		
			if (hit3 == 0) {
				g.setColor(Color.BLUE);
			} else if (hit3 == 1) {
				g.setColor(Color.RED);
			}
		
		
		
			repaint();
			}
	
	
	
	
	}


	public static void main(String args[]) {
		new Battleship();
	}
	
	
}
