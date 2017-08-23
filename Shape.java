import java.util.Date;
public class Shape {
	
	String color;
	boolean filled;
	Date dateCreated;
	
	public Shape () {
		
		this.color = color;
		this.filled = filled;
		this.dateCreated = dateCreated;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	
	
}

