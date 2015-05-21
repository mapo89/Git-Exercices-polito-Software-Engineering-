package it.polito.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory{
	private Map<String, Item> items = new HashMap<String, Item>();
	
	// adds new descriptor 
	void addItem(Item i) throws ItemAlreadyExists {
		
		if (items.putIfAbsent(i.getItemCode(), i) == null) {
			throw new ItemAlreadyExists();
		}
		
	}
	
	// returns item with given code
    Item searchItem (String itemCode) throws ItemNotExists {
		
    	Item i = items.get(itemCode);
		
    	if (i == null) {
			throw new ItemNotExists();
		}
    	
    	return i;
    	
    }
    
    // returns availability of item
    int availabilityItem (String itemCode) throws ItemNotExists {
    	
    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		return i.getAvailability();
    	
    }
    
    // subtracts 1 to availability
    void subtractItem (String itemCode) throws ItemNotExists, ItemNotAvailable {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		if (i.getAvailability() <= 0) {
			throw new ItemNotAvailable();
		}
		
		i.setAvailability(i.getAvailability() - 1);
		
    }
                                                           
    void addQtyToItem(String itemCode, int qty_to_add) throws ItemNotExists {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		i.setAvailability(i.getAvailability() + qty_to_add);
    }
    
    void  subtractQtyToItem(String itemCode, int qty_to_add) 
    		throws ItemNotAvailable, ItemNotExists {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		if (i.getAvailability() <= 0) {
			throw new ItemNotAvailable();
		}
		
		//not check if availability goes under 0!
		i.setAvailability(i.getAvailability() - qty_to_add);
    }

	public Map<String, Item> getItems() {
		return items;
	}
}
