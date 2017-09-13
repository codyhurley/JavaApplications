
public class LongDistanceBill extends PhoneBill{

	public LongDistanceBill(double monthlyRate) {
		super(monthlyRate);
	}

	@Override
	public double calculateBill(int time) {
		return (getCallRate() * time) + getMonthlyRate();
	}
	
}
