package shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void addOneItemToEmptyShopppingCart() {
		ShopApp underTest = new ShopApp();
		int check = underTest.getTotalItems();
		assertEquals(1, check);
	}
	
	@Test
	public void addTwoItemsToEmptyShopppingCart() {
		ShopApp underTest = new ShopApp();
		int check = underTest.getTotalItems();
		assertEquals(2, check);
	}
		
	
		
		
		
		
		
	}
	
	
	
	
}
