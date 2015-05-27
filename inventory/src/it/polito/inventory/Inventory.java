package it.polito.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory{
	private Map<String, Item> items = new HashMap<String, Item>();
	
	// adds new descriptor 
	public void addItem(Item i) throws ItemAlreadyExists {
		
		if (items.putIfAbsent(i.getItemCode(), i) != null) {
			throw new ItemAlreadyExists();
		}
		
	}
	
	// returns item with given code
    public Item searchItem (String itemCode) throws ItemNotExists, BadItemCode {
		
    	Item i = items.get(itemCode);
    	
    	if (itemCode.charAt(0) != 'A') {
    		throw new BadItemCode();
    	}
		
    	if (i == null) {
			throw new ItemNotExists();
		}
    	
    	return i;
    	
    }
    
    // returns availability of item
    public int availabilityItem (String itemCode) throws ItemNotExists {
    	
    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		return i.getAvailability();
    	
    }
    
    // subtracts 1 to availability
    public void subtractItem (String itemCode) throws ItemNotExists, ItemNotAvailable {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		if (i.getAvailability() <= 0) {
			throw new ItemNotAvailable();
		}
		
		i.setAvailability(i.getAvailability() - 1);
		
    }
                                                           
    public void addQtyToItem(String itemCode, int qty_to_add) throws ItemNotExists {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		i.setAvailability(i.getAvailability() + qty_to_add);
    }
    
    public void  subtractQtyToItem(String itemCode, int qty_to_add) 
    		throws ItemNotAvailable, ItemNotExists, NegativeQuantity {

    	Item i = items.get(itemCode);
    	
		if (i == null) {
			throw new ItemNotExists();
		}
		
		if (i.getAvailability() <= 0) {
			throw new ItemNotAvailable();
		}
		
		//not check if availability goes under 0!
		if (qty_to_add > i.getAvailability()) {
			throw new NegativeQuantity();
		}
		i.setAvailability(i.getAvailability() - qty_to_add);
    }

	public Map<String, Item> getItems() {
		return items;
	}
}
