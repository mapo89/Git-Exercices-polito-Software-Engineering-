package it.polito.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory{
	private Map<String, Item> items = new HashMap<String, Item>();
	
	// adds new descriptor 
	void addItem(Item i) throws ItemAlreadyExists{
		
	}
	
	// returns item with given code
    Item searchItem (String itemCode) throws ItemNotExists {
		return null;
    	
    }
    
    // returns availability of item
    int availabilityItem (String itemCode) throws ItemNotExists {
		return 0;
    	
    }
    
    // subtracts 1 to availability
    void subtractItem (String itemCode) throws ItemNotExists, ItemNotAvailable {
    	
    }
                                                           
    void addQtyToItem(String itemCode, int qty_to_add) {
    	
    }
    
    void  subtractQtyToItem(String itemCode, int qty_to_add) {
    	
    }
}
