import java.util.Date;

public class Time {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("At the current execution of this program, the local time is " + d + ".");
		
		System.out.println(" ");
		
		//the program gets the date but does not return the hours, minutes, seconds passed since Unix epoch
		//Get the milliseconds passed from the Unix epoch using System.currentTimeMillis() and assign it to a long variable.
		//Then convert the value to hours, minutes, seconds by dividing it by 1000 to seconds then by 60 to minutes etc.
		
	}

}
