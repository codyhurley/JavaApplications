import java.sql.*;
import java.awt.*;
import javax.swing.*;




public class Employee extends JPanel {
	
		static JFrame tableFrame;
		ResultSet output;
		
		
		
		String [] columnLabels = {"Employee ID", "Name", "Position", "Hourly Pay Rate"};
		JScrollPane scroll;
		static JTable workerTable;
		
		String name, position;
		int id;
		double hourlyPay;
		
		Employee() throws SQLException {
			
			
			
			Object [][] rowValues = { {id, name, position, hourlyPay} };
					
			workerTable = new JTable(rowValues, columnLabels);
			scroll = new JScrollPane(workerTable);
			tableFrame = new JFrame("Employee Table");
			
			String [] colNames = {"Employee ID", "Name", "Position", "Hourly Pay Rate"};
			
		}
		
		public void gatherInfo() throws SQLException{
			Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/personnel", "root", "");

			try{
			 
				Statement stmt = conn.createStatement();
	       
				String sqlStatement = "SELECT * FROM Employee";

				ResultSet result = stmt.executeQuery(sqlStatement);
				
				do {
				
					id = output.getInt("Employee ID");
					name = output.getString("Name");
					position = output.getString("Position");
					hourlyPay = output.getDouble("Hourly Pay Rate");
					System.out.println(id + "" + name + "" + position + "" + hourlyPay);
				
				conn.close();
				
				
				
				} while (output.next());
				
				
				
	       
			
				}catch(Exception ex){
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		
		
		
	public static void main(String[] args) throws SQLException {
		
		tableFrame = new JFrame("Employee Interface");
		tableFrame.setLayout(new BorderLayout());
		tableFrame.setPreferredSize(new Dimension(500, 500));
		
		new Employee();
		
		tableFrame.add(workerTable);
		tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableFrame.setVisible(true);
		

	}
}