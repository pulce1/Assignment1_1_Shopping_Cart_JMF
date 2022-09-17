/**
 * ShoppingCart class that holds different items and performs actions
 * @author james
 * @version 9/17/2022
 */
public class ShoppingCart<T> implements ShoppingCartInterface<T> {

	private ResizableArrayBag<T> shoppingCartBag;
 	
	/**
	 * an empty cart
	 */
	public ShoppingCart() {
		shoppingCartBag = new ResizableArrayBag<T>();
	}//end shoppingcart
	
	/**
	 * gives the current size of the cart based off of how many items
	 * @return and int: equal to the number of items in the cart
	 */
	public int getCurrentSize() {
		return shoppingCartBag.getCurrentSize();
	}//end getCurrentSize

	/**
	 * tells you if the cart is empty
	 * @return a boolean: true if empty, false if not
	 */
	public boolean isEmpty() {
		return shoppingCartBag.isEmpty();
	}//end isEmpty

	/**
	 * adds a new item to the bag
	 * @return a boolean: true if successful, false if not
	 * @param newItem: the item being added
	 */
	public boolean add(T newItem) {
		return shoppingCartBag.add(newItem);
	}//end add (Specific)

	/**
	 * removes the last item in the bag
	 */
	public T remove() {
		return shoppingCartBag.remove();
	}//end remove
	
	/**
	 * removes a specific item from the bag
	 * @return a boolean: true if it is removed, false if not
	 * @param anItem: The item being removed
	 */
	public boolean remove(T anItem) {
		return shoppingCartBag.remove(anItem);
	}//end remove (Specific)

	/**
	 * completely clears the bag of all items 
	 */
	public void clear() {
		shoppingCartBag.clear();
	}//end clear
	
	/**
	 * tells you how many of one item is in a bag
	 * @return an int: based on the number of times that item appears in the bag
	 * @param anItem: The item being counted
	 */
	public int getFrequencyOf(T anItem) {
		return shoppingCartBag.getFrequencyOf(anItem);
	}//end getFrequencyOf

	/**
	 * tells if the bag has a specific item in it
	 * @return a boolean: true if it is in the bag, false if not
	 * @param anItem: the item being checked for
	 */
	public boolean contains(T anItem) {
		return shoppingCartBag.contains(anItem);
	}//end contains

	/**
	 * makes an array for the cart
	 */
	public T[] toArray() {
		return shoppingCartBag.toArray();
	}//end toArray

	/**
	 * gives the total price for everything in the cart
	 * @return an int: adds the total of all prices in the cart
	 */
	public int getTotalPrice() {
		Object[] shoppingCartArray = shoppingCartBag.toArray();
		int sum=0;
		for (int i = 0; i<shoppingCartArray.length; i++) 
		{
			Item p = (Item) shoppingCartArray[i];
			sum = sum + p.getPrice();
		}
		return sum;		
	}//end getTotalPrice

	/**
	 * gives the price for a specific item (including duplicates)
	 * @param anItem: the item that will be being price checked
	 */
	public int getTotalPrice(T anItem) {
		int sum = ((Item) anItem).getPrice() * getFrequencyOf(anItem);
		return sum; 
		}//end getTotalPrice (Specific)

}//end class
