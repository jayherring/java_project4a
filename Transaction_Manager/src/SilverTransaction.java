
public class SilverTransaction extends Transaction {
	private int _weight;
	private int _purity;

	
	public SilverTransaction (String theId, String theBuyer, 
		    String theSeller, double theAmount, String theTimestamp,int theWeight, int thePurity) {
		super(theId,theBuyer,theSeller,theAmount,theTimestamp);
		_weight = theWeight;
		_purity = thePurity;

	}
	
	public int get_Weight() {
		return _weight;
	}
	
	public int get_Purity() {
		return _purity;
	}
	
	@Override
	public String toString() {
		return String.format("SilverTransaction: %s %s %s %.2f %s %d %d",
		    get_id(), get_buyer(), get_seller(), get_amount(), get_timestamp(),get_Weight(),get_Purity() );
	}

}
