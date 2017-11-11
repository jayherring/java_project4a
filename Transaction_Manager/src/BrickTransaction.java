
public class BrickTransaction extends Transaction {
	private int _weight;
	private String _type;
	private String _color;
	
	public BrickTransaction (String theId, String theBuyer, 
		    String theSeller, double theAmount, String theTimestamp,int theWeight,String theType, String theColor) {
		super(theId,theBuyer,theSeller,theAmount,theTimestamp);
		_weight = theWeight;
		_type = theType;
		_color = theColor;

	}
	
	public int get_Weight() {
		return _weight;
	}
	
	public String get_Type() {
		return _type;
	}
	
	public String get_Color() {
		return _color;
	}
	
	@Override
	public String toString() {
		return String.format("SilverTransaction: %s %s %s %.2f %s %d %s %s",
		    get_id(), get_buyer(), get_seller(), get_amount(), get_timestamp(),get_Weight(),get_Type(),get_Color());
	}

}
