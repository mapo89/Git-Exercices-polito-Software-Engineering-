package it.polito.integrationTests;

import static org.junit.Assert.assertEquals;
import it.polito.inventory.BadItemCode;
import it.polito.inventory.Inventory;
import it.polito.inventory.ItemNotExists;

import org.junit.Test;

public class InventoryItemTest {
	//e.g. tests change item in order to have the following requirements:
	//item code must be in this format Ax, x in a digit in [0,9]
	//unit test on item than integration tests on itemcode between item and inventory
	Inventory tester = new Inventory();
	
	@Test(expected = BadItemCode.class)
	public void itemCodeShouldBeInProperFormatWhenAdding() 
			throws ItemNotExists, BadItemCode {
		
		assertEquals("Inserting an item with bad item code should raise an exception",
				"", tester.searchItem("1"));
	}
}
