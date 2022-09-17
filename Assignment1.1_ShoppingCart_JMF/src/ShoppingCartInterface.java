/**
 * Interface for the ShoppingCart class that is a list of actions you can take in the class
 * @author James Frayser
 * ShoppingCartInterface.java
 * @version 9/17/2022
 */
public interface ShoppingCartInterface<T> 
{
	/**
	 * Tells how many items are in the cart
	 * @return An int of the number of items in the array
	 */
	public int getCurrentSize();
	
	/**
	 * Will tell you if your shopping cart is empty
	 * @return A boolean, true if it is empty, false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Adds a new item entry to the shopping cart
	 * @param newItem: Object to be added to the cart
	 * @return A boolean, true if it is added, false if it is not
	 */
	public boolean add(T newItem);
	
	/**
	* removes the item last added to the cart
	* @return The array will no longer have that item
	*/
	public T remove();
		
	/**
	* removes an item that you select
	* @param anItem: The object to be removed
	* @return A boolean, true if it has been removed, false if it hasn't
	*/
	public boolean remove(T anItem);
		
	/**
	 * removes every item from the cart
	 */
	public void clear();
		
	/**
	 * tells you how many times a specific item appears in the cart
	 * @param anItem: The object to be counted
	 * @return An int: the number of times an item appears in the cart
	 */
	public int getFrequencyOf(T anItem);
		
	/**
	 * tells you if the cart has a specific item
	 * @param anItem the object that is checked for
	 * @return True if the shopping cart contains the item, or False if not
	 */
	public boolean contains(T anItem);
	
	/**
	 * Takes all items in the cart and makes it an array
	 * @return type T: the array with all of the items in the cart
	 */
	public T[] toArray();
	
	/**
	 * gives a string when called
	 * @return type String
	 */
	public String toString();
		
	/**
	 * tells you the total price of every item in the cart
	 * @return an int: adds up all of the items in the cart
	 */
	public int getTotalPrice();
		
	/**
	 * gives you the price of a specific item in the cart
	 * @param anItem: The item to be priced
	 * @return an int: gives the price for that item in the cart, including duplicates
	 */
	public int getTotalPrice(T anItem);	

}//end interface
