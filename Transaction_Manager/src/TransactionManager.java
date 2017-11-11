
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class TransactionManager {
	
	private HashMap<String, Transaction> _col;
	
	public TransactionManager( ) {
		_col = new HashMap<String, Transaction>( );
	}
	
	// Add new  object to TransactionManager
		public void add(Transaction trans) {
			String transId = trans.get_id( );
			_col.put(transId, trans);
		}
		
		//count (return the number of transactions in the collection)
		public int count(){
			int num_of_trans = _col.size();
			return num_of_trans;
		}
		//get item gets transaction by id
		public ArrayList<Transaction> getItem(String id){
			Map<_col.get_id(), id>;
		}
		
		//displayAll  return array list items in a collection
		public String displayAll() {
			String output ="TransactionManager: \n";
			
			for (Entry<String,Transaction> entry : _col.entrySet()) {
				output +=
					entry.getValue().toString() + "\n";
			
			}
			// sort output by buyer and seller
			 return output;
			}
		
		
		// find all buyers that contain a specified substring.
		public ArrayList<Transaction> findBuyer(String substring) {
			ArrayList<Transaction> output = new ArrayList<Transaction>( );
			
			for(Entry<String, Transaction> entry : _col.entrySet( )) {
				
				Transaction trans = entry.getValue( );
				String buyer = trans.get_buyer( ).toUpperCase( );
				if (buyer.indexOf(substring) > -1) {
					output.add(trans);
					
				}
			}
			
			// Sort objects by name before returning array list.
			Collections.sort(output);
			return output;
		}
		
		// find all sellers that contain a specified substring.
				public ArrayList<Transaction> findSeller(String substring) {
					ArrayList<Transaction> output = new ArrayList<Transaction>( );
					
					for(Entry<String, Transaction> entry : _col.entrySet( )) {
						
						Transaction trans = entry.getValue( );
						String seller = trans.get_seller( ).toUpperCase( );
						if (seller.indexOf(substring) > -1) {
							output.add(trans);
							
						}
					}
					
					// Sort objects by name before returning array list.
					Collections.sort(output);
					return output;
				}
		
		//load
		
		//remove
				
		//save
		
		
		@Override
		public String toString( ) {
			String output = "TransactionManager: \n";
			for (Entry<String, Transaction> entry : _col.entrySet( )) {
				output += entry.getValue( ).toString( ) + "\n";
			}
			return output;
		}
	


}
