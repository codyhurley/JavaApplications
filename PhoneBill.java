
public abstract class PhoneBill {
	
	private double monthlyRate;
	
	private int callRate;
	
	public PhoneBill(double monthlyRate) {
		
		this.monthlyRate = monthlyRate;
		
	}
	
	public double getMonthlyRate() {
		
		return monthlyRate;
		
	}
	
	
	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	

	public int getCallRate() {
		
		return callRate;
		
	}
	
	
	public void setCallRate(int callRate) {
		this.callRate = callRate;
	}
	
	
	public abstract double calculateBill (int time);

}
