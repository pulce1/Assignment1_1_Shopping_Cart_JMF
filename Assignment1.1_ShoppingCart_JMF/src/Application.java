/**
 * Application class that will perform all necessary functions in the shoppingcart class
 * @author jfrayser
 * @version 9/17/2022
 */
public class Application {

	public static void main(String[] args) {
		
		ShoppingCart<Item> cart1 =new ShoppingCart<Item>();
		
		System.out.println("Is the shopping cart empty?: " + cart1.isEmpty());
		System.out.println("How many items are in the bag?: " + cart1.getCurrentSize());
		cart1.remove();//does nothing since the cart is empty
		
		System.out.println("\nYou have added popcorn to the cart");
		Item cartItem1 = new Item("Popcorn", 99);
		cart1.add(cartItem1);
		
		System.out.println("How many items are in the bag?: " + cart1.getCurrentSize());
		
		System.out.println("\nIs the shopping cart empty?: " + cart1.isEmpty());
		
		System.out.println("\nYou have added peanuts to the cart");
		Item cartItem2 = new Item("Peanuts", 299);
		cart1.add(cartItem2);
		
		System.out.println("You have added eggs to the cart");
		System.out.println("You have added eggs to the cart");
		Item cartItem3 = new Item("Eggs", 199);
		cart1.add(cartItem3);
		cart1.add(cartItem3);
		
		System.out.println("You have added jerky to the cart");
		Item cartItem4 = new Item("Jerky", 1500);
		cart1.add(cartItem4);
		
		System.out.println("You have added orange juice to the cart");
		Item anItem5 = new Item("OJ", 275);
		cart1.add(anItem5);
		
		//make an instance of a temporary array as a place holder to print the cart, cannot be used to display the cart's status later on, because it will not have updated
		Object[] array = cart1.toArray();

		System.out.println("\nThe items in the shopping cart are: ");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		
		System.out.printf("\nYour total cart price is: $%d.%02d\n", cart1.getTotalPrice() / 100, cart1.getTotalPrice() % 100);
		
		System.out.println("\nThe current number of items in the bag is: " + cart1.getCurrentSize());
	
		System.out.println("\nRemove last added item?");
		cart1.remove();
		System.out.println("How many items are in the bag?: " + cart1.getCurrentSize());
		
		Object[] array3 = cart1.toArray();

		System.out.println("\nThe items in the shopping cart are: ");
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println(array3[4]);
		
		System.out.println("\nChecking to see if the shopping cart contains popcorn: " + cart1.contains(cartItem1));
		
		System.out.println("\nWould you like to remove Jerky?");
		cart1.remove(cartItem4);
		System.out.println("Does the cart still contain jerky?: " + cart1.contains(cartItem4));
		
		Object[] array2 = cart1.toArray();

		System.out.println("\nThe items in the shopping cart are: ");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		
		System.out.println("\nThe bag has " + cart1.getFrequencyOf(cartItem3) + " Eggs");
		System.out.printf("The total price of all eggs in the bag is $%d.%02d\n", cart1.getTotalPrice(cartItem3) / 100, cart1.getTotalPrice(cartItem3) % 100 );
		System.out.println("\nYou have added eggs to the cart");
		cart1.add(cartItem3);
		System.out.println("The bag has " + cart1.getFrequencyOf(cartItem3) + " Eggs");
		System.out.printf("The total price of all eggs in the bag is $%d.%02d\n", cart1.getTotalPrice(cartItem3) / 100, cart1.getTotalPrice(cartItem3) % 100 );
		
		Object[] array1 = cart1.toArray();

		System.out.println("\nThe items in the shopping cart are: ");
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		System.out.printf("\nYour total cart price is: $%d.%02d\n", cart1.getTotalPrice() / 100, cart1.getTotalPrice() % 100);
		
		System.out.println("\nClear cart?");
		cart1.clear();
		System.out.println("How many items are in the cart?: " + cart1.getCurrentSize());
		System.out.printf("\nYour total cart price is: $%d.%02d\n", cart1.getTotalPrice() / 100, cart1.getTotalPrice() % 100);
		
	}//end main
	
}//end Application class