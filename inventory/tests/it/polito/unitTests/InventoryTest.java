package it.polito.unitTests;

import static org.junit.Assert.*;
import it.polito.inventory.Inventory;
import it.polito.inventory.Item;
import it.polito.inventory.ItemAlreadyExists;
import it.polito.inventory.ItemNotAvailable;
import it.polito.inventory.ItemNotExists;
import it.polito.inventory.NegativeQuantity;

import org.junit.*;

public class InventoryTest {
	private Inventory tester;
	
	@Before
	public void setUp() {
		
		Inventory inv = new Inventory( );
		Item i1 =  new Item("A1", 10);
		Item i2 =  new Item("A2", 5);
		Item i3 =  new Item("A3", 0);
		Item i4 =  new Item("A4", 15);

		try {
			inv.addItem(i1);
			inv.addItem(i2);
			inv.addItem(i3);
			inv.addItem(i4);
		} catch (ItemAlreadyExists e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tester = inv;
		
	}
	
	@Test
	public void exactQuantitiesAfterAddingOrSubstructing() {

	   // Tests
	   try {
		assertEquals("Availability of A1 must be 10", 10, tester.availabilityItem("A1"));
		tester.addQtyToItem("A1", 20);
		assertEquals("Availability of A1 after adding 20 must be 30",
				30, tester.availabilityItem("A1"));
		tester.subtractQtyToItem("A1", 10);
		assertEquals("Availability of A1 after subtracting 10 must be 20",
				20, tester.availabilityItem("A1"));
	   } catch (ItemNotExists | ItemNotAvailable e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
	   } catch (NegativeQuantity e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	}
	
	@Test(expected = ItemNotAvailable.class)
	public void quantitiesCloseToZero() 
			throws ItemNotAvailable, ItemNotExists, NegativeQuantity {
	   
		// Tests
	   	tester.subtractQtyToItem("A1", 9);
		assertEquals("Availability of A1 after subtracting 9 must be 1",
				1, tester.availabilityItem("A1"));
		tester.subtractItem("A1");
		assertEquals("Availability of A1 after subtracting 1 must be 0",
				0, tester.availabilityItem("A1"));
		tester.subtractQtyToItem("A1", 15);
	   	
	}
	
	@Test(expected = NegativeQuantity.class)
	public void quantitiesLessThanZero() 
			throws ItemNotAvailable, ItemNotExists, NegativeQuantity {

	   // Tests
	   tester.subtractQtyToItem("A1", 11);
	   
	}


}
