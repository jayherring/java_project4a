
public class Transaction implements Comparable <Transaction> {
	private String _id;
	private String _buyer;
	private String _seller;
	private double _amount;
	private String _timestamp;
	
	 

	public Transaction (String theId, String theBuyer, 
		    String theSeller, double theAmount, String theTimestamp) {
		_id = theId;
		_buyer = theBuyer;
		_seller = theSeller;
		_amount = theAmount;
		_timestamp = theTimestamp;

	}

	//getters

	public String get_id() {
		return _id;
	}



	public String get_buyer() {
		return _buyer;
	}



	public String get_seller() {
		return _seller;
	}



	public double get_amount() {
		return _amount;
	}



	public String get_timestamp() {
		return _timestamp;
	}
	
	@Override
	public String toString() {
		return String.format("Transaction: %s %s %s %.2f %s",
		    _id, _buyer, _seller, _amount, _timestamp);
	}
	
	public int compareTo(Transaction other) {
		return this.get_buyer( ).compareTo(other.get_buyer( ));
	}
	
	
	

}
