import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Customer object
class Customer {

	// Customer attributes
	String orderNumber;
	String name;
	String contactNumber;
	String streetAddress;
	String suburb;
	String emailAddress;
	String nameOfRestaurantBeingOrderedFrom;
	String locationOfRestaurantBeingOrderedFrom;
	String contactNumberOfRestaurantBeingOrderedFrom;
	String [] listOfMealsBeingOrdered;
	int [] howManyOfEachMealIsBeingOrdered;
	int [] priceOfEachMeal;
	String specialPreperationInstructions;
	int totalAmountToBePaid;
	String driverCollecting;
}

// Restaurant object
class Restaurant {

	// Restaurant attributes
	String nameOfRestaurant;
	String locationOfRestaurant;
	String contactNumberOfRestaurant;
}


public class QuickFood {

	// Method to work out the total amount of the order
	public static int TotalAmount(int [] howManyOfEachMealIsBeingOrdered, int [] priceOfEachMeal ) {

		int sum = 0;

		// For loop that multiplies the number of the specific order by the price of that order and adds it to the sum
		for (int i = 0; i < howManyOfEachMealIsBeingOrdered.length; i++ ) {


			int totalAmountOfEachMeal = howManyOfEachMealIsBeingOrdered[i] * priceOfEachMeal[i];

			sum = sum + totalAmountOfEachMeal;

		}

		return sum;
	}

	// Method that returns a driver in the same location as the restaurant being ordered from
	public static String GetDriverInSameLocationAsRestaurant(String locationOfRestaurantBeingOrderedFrom, List<String> listOfStrings) {
		
		// storing the data in arraylist to array
					String[] array
					= listOfStrings.toArray(new String[0]);
		
		// Splitting the drivers into their individual arrays
					String[] driver1 = array[0].split(",");
					for (int i = 0; i < driver1.length; i++) {
					}

					String[] driver2 = array[1].split(",");
					for (int i = 0; i < driver2.length; i++) {
					}

					String[] driver3 = array[2].split(",");
					for (int i = 0; i < driver3.length; i++) {
					}
					String[] driver4 = array[3].split(",");
					for (int i = 0; i < driver4.length; i++) {
					}
					String[] driver5 = array[4].split(",");
					for (int i = 0; i < driver5.length; i++) {
					}
					String[] driver6 = array[5].split(",");
					for (int i = 0; i < driver6.length; i++) {
					}
					String[] driver7 = array[6].split(",");
					for (int i = 0; i < driver7.length; i++) {
					}
					String[] driver8 = array[7].split(",");
					for (int i = 0; i < driver8.length; i++) {
					}
					String[] driver9 = array[8].split(",");
					for (int i = 0; i < driver9.length; i++) {
					}
					String[] driver10 = array[9].split(",");
					for (int i = 0; i < driver10.length; i++) {
					}
					String[] driver11 = array[10].split(",");
					for (int i = 0; i < driver11.length; i++) {
					}
					String[] driver12 = array[11].split(",");
					for (int i = 0; i < driver12.length; i++) {
					}
					String[] driver13 = array[12].split(",");
					for (int i = 0; i < driver13.length; i++) {
					}
					String[] driver14 = array[13].split(",");
					for (int i = 0; i < driver14.length; i++) {
					}
					String[] driver15 = array[14].split(",");
					for (int i = 0; i < driver15.length; i++) {
					} 
					String[] driver16 = array[15].split(",");
					for (int i = 0; i < driver16.length; i++) {
					}
					String[] driver17 = array[16].split(",");
					for (int i = 0; i < driver17.length; i++) {
					}
					String[] driver18 = array[17].split(",");
					for (int i = 0; i < driver18.length; i++) {
					}
					String[] driver19 = array[18].split(",");
					for (int i = 0; i < driver19.length; i++) {
					}
					String[] driver20 = array[19].split(",");
					for (int i = 0; i < driver20.length; i++) {
					}
					String[] driver21 = array[20].split(",");
					for (int i = 0; i < driver21.length; i++) {
					}
					String[] driver22 = array[21].split(",");
					for (int i = 0; i < driver22.length; i++) {
					}
					String[] driver23 = array[22].split(",");
					for (int i = 0; i < driver23.length; i++) {
					}
					String[] driver24 = array[23].split(",");
					for (int i = 0; i < driver24.length; i++) {
					}
					String[] driver25 = array[24].split(",");
					for (int i = 0; i < driver25.length; i++) {
					} 
					String[] driver26 = array[25].split(","); 
					for (int i = 0; i < driver26.length; i++) {
					}
					String[] driver27 = array[26].split(",");
					for (int i = 0; i < driver27.length; i++) {
					} 
					String[] driver28 = array[27].split(",");
					for (int i = 0; i < driver28.length; i++) {
					}
					String[] driver29 = array[28].split(",");
					for (int i = 0; i < driver29.length; i++) {
					}
					String[] driver30 = array[29].split(",");
					for (int i = 0; i < driver30.length; i++) {
					}
					
					String driverCollecting = null;
					
					// Switch statement that fetches the driver that is in the same location
					switch (locationOfRestaurantBeingOrderedFrom) {
					
					case  " Cape Town":
						driverCollecting = driver1[0];
						break;
					 
					case  " Durban":
						driverCollecting = driver2[0];
						break;
						
					case  " Johannesburg":
						driverCollecting = driver3[0];
						break;
						
					case  " Potchefstroom":
						driverCollecting = driver9[0];
						break;
						
					case  " Springbok":
						driverCollecting = driver11[0];
						break;
						
					case  " Bloemfontein":
						driverCollecting = driver12[0];
						break;
						
					case  " Port Elizabeth":
						driverCollecting = driver13[0];
						break;
						
					case  " Witbank":
						driverCollecting = driver17[0];
						break;
						
						default :
							driverCollecting = "Sorry! Our drivers are too far away from you to be able to deliver to your location.";
					}

		return driverCollecting;
	}

	public static void main(String args[]) throws IOException {

		// list that holds strings of a file
		List<String> listOfStrings
		= new ArrayList<String>();

		// load data from file
		BufferedReader bf;
		try {
			bf = new BufferedReader(
					new FileReader("drivers-info"));

			// read entire line as string
			String line = bf.readLine();

			// checking for end of file
			while (line != null) {
				listOfStrings.add(line);
				line = bf.readLine();
			}

			// closing bufferreader object
			bf.close();

			// Declaring scanner
			Scanner sc = new Scanner(System.in);

			// Welcoming the user
			System.out.println("Welcome to QuickFoods: ");

			// new restaurant object
			Restaurant restaurant1 = new Restaurant();

			// capturing the restaurants details
			System.out.println("Please enter the name of the restaurant: ");

			restaurant1.nameOfRestaurant = sc.nextLine();

			System.out.println("Please enter the location of the restaurant: ");

			restaurant1.locationOfRestaurant = " " + sc.nextLine();

			System.out.println("Please enter the contact number of the restaurant: ");

			restaurant1.contactNumberOfRestaurant = sc.nextLine();

			// capturing the customer's details
			Customer customer1 = new Customer();

			System.out.println("Please enter your order number: ");

			customer1.orderNumber = sc.nextLine();

			System.out.println("Please enter your full name: ");

			customer1.name = sc.nextLine();

			System.out.println("Please enter your contact number: ");

			customer1.contactNumber = sc.nextLine();

			System.out.println("Please enter your street address: ");

			customer1.streetAddress = sc.nextLine();

			System.out.println("Please enter your suburb: ");

			customer1.suburb = sc.nextLine();

			System.out.println("Please enter your email address: ");

			customer1.emailAddress = sc.nextLine();

			customer1.nameOfRestaurantBeingOrderedFrom = restaurant1.nameOfRestaurant;
			customer1.locationOfRestaurantBeingOrderedFrom = restaurant1.locationOfRestaurant;
			customer1.contactNumberOfRestaurantBeingOrderedFrom = restaurant1.contactNumberOfRestaurant;

			System.out.println("Please enter how many different meals you are ordering: ");

			// Declaring int scanner
			Scanner intScanner = new Scanner(System.in);

			int numberOfDifferentMeals = intScanner.nextInt();

			customer1.listOfMealsBeingOrdered = new String [numberOfDifferentMeals];

			int i = 0;

			while  (i < numberOfDifferentMeals) {

				System.out.println("Please enter the name of the meal " + (i + 1) + ": ");

				customer1.listOfMealsBeingOrdered[i] = sc.nextLine(); 

				i++;
			}

			customer1.howManyOfEachMealIsBeingOrdered = new int [numberOfDifferentMeals];

			int x = 0;

			while  ( x < numberOfDifferentMeals) {

				System.out.println("Please enter how many meals of meal " + (x + 1) + " that you would like: ");

				customer1.howManyOfEachMealIsBeingOrdered[x] = intScanner.nextInt();

				x++;
			}

			customer1.priceOfEachMeal = new int [numberOfDifferentMeals];

			int a = 0;

			while ( a < numberOfDifferentMeals) {

				System.out.println("Please enter the price of meal " + (a + 1) + ": ");

				customer1.priceOfEachMeal[a] = intScanner.nextInt();

				a++;
			}

			System.out.println("Please enter any special preperation instructions: ");

			customer1.specialPreperationInstructions = sc.nextLine();

			customer1.totalAmountToBePaid = TotalAmount(customer1.howManyOfEachMealIsBeingOrdered, customer1.priceOfEachMeal);

			customer1.driverCollecting = GetDriverInSameLocationAsRestaurant(customer1.locationOfRestaurantBeingOrderedFrom, listOfStrings);

			// closing scanner
			intScanner.close();

			// closing scanner
			sc.close();

			//writing invoice details to invoice.txt
			try (PrintWriter outPut = new PrintWriter("C:invoice.txt")) {

				// If statement to check if there was a driver in the same location as the restaurant
				if (customer1.driverCollecting.equals("Sorry! Our drivers are too far away from you to be able to deliver to your location.")) {

					// outputs the appropriate response to no drivers being available
					outPut.println(customer1.driverCollecting); 

					//close resource
					outPut.close();

					// Else will outprint to the invoice with the desired format
				} else {

					// Outprinting to the invoice
					outPut.println("Order number " + customer1.orderNumber);
					outPut.println("Customer: " + customer1.name);
					outPut.println("Email: " + customer1.emailAddress);
					outPut.println("Phone number: " + customer1.contactNumber); 
					outPut.println("Loacation: " + customer1.locationOfRestaurantBeingOrderedFrom);
					outPut.println(""); 
					outPut.println("You have ordered the following from " + restaurant1.nameOfRestaurant + " in" + restaurant1.locationOfRestaurant + ":"); 
					outPut.println("");

					int b = 0;

					while (b < numberOfDifferentMeals) {

						outPut.println(customer1.howManyOfEachMealIsBeingOrdered[b] + " x " + customer1.listOfMealsBeingOrdered[b] + " (R" + customer1.priceOfEachMeal[b] + ".00)"); 

						b++;
					}

					outPut.println("");
					outPut.println("Special instructions: " + customer1.specialPreperationInstructions);
					outPut.println("");
					outPut.println("Total: R" + customer1.totalAmountToBePaid + ".00");
					outPut.println("");
					outPut.println(customer1.driverCollecting + "is the nearset to the restaurant and so they will be delivering your order to you at:"); 
					outPut.println("");
					outPut.println(customer1.streetAddress); 
					outPut.println(customer1.suburb);
					outPut.println("");
					outPut.println("If you need to contact the restaurant, their number is " +  restaurant1.contactNumberOfRestaurant); 

					//close resource
					outPut.close();

					System.out.println("Thank you for ordering with Quick Foods, you can view your invoice by looking at invoice.txt.");
				}
			}
			catch (Exception e) {
				System.out.println("Error");
			}

		} catch (FileNotFoundException e1) {
			System.out.println("Error");
		}

	}
}
