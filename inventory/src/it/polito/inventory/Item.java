package it.polito.inventory;

//descriptor of items in inventory
public class Item {  
	private String itemCode; // aka bar code, unique identifier of item
	private int availability; // number of items available
	private String description; // description of item
	private String name; // name of item

	// creates a new item
	public Item(String itemCode, int quantity){
		this.itemCode = itemCode;
		this.availability = quantity;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}