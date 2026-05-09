public class CustomerTester {
    public static void main(String[] args) {
    	
    	// Initialize an array of Customer objects to hold 3 customers
    	Customer[] customerArray = new Customer[3];
    	
    	// Create and initialize three Customer objects and assign each customer object to an element of the Customer array
    	customerArray[0] = new BusinessCustomer("Mike", "Holmes", "Business", "Home Depot", 10, 3105.50);;
        customerArray[1] = new RetailCustomer("Dev", "Gelda", "Retail", 11200.00);
        customerArray[2] = new PreferredCustomer("Wei", "Ping", "Preferred", 6456.85, 5);
        
        //Print the header for the program
        System.out.println("Welcome to the Customer tester!");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
        System.out.println("---------------------------------------------------------------------------------------");
        
        // Print each object in the array using the toString() method to demonstrate polymorphism
        for (int i =  0; i < 3; i++) {
            System.out.println(customerArray[i].toString());
        }

        // Print each customer's full name and the incentives they are entitled to
        for (int i =  0; i < 3; i++) {
        	Customer customer = customerArray[i];
            System.out.printf("%s %s  earns a discount incentive of $%,.2f%n", customer.getFirstName(), customer.getLastName(), customer.incentives());
        }
        System.out.println();
        
        // Create three more Customer objects using their subclass types and assign each customer object to an element of the Customer array]
        BusinessCustomer businessCustomer2 = new BusinessCustomer("Tristan", "Lee", "Business", "Starbucks", 15, 9875.25);
        RetailCustomer retailCustomer2 = new RetailCustomer("Carlos", "Beltran", "Retail", 3100.50);
        PreferredCustomer preferredCustomer2 = new PreferredCustomer("Arti", "Patel", "Preferred", 10450.00, 10);
        
        // Print each new Customer object using the toString() method
        System.out.println(businessCustomer2.toString());
        System.out.println(retailCustomer2.toString());
        System.out.println(preferredCustomer2.toString());
        
        
        // Use mutator methods to update the properties of each customer object
        businessCustomer2.setTotalPurchases(8895.00);
        businessCustomer2.setDiscountRate(12);
        retailCustomer2.setTotalPurchases(100500.00);
        preferredCustomer2.setTotalPurchases(14987.24);
        preferredCustomer2.setLastName("Patel-Ruhil");
        preferredCustomer2.setCashBackRate(13);

        // Print each updated Customer object to show the changes
        System.out.println(businessCustomer2.toString());
        System.out.println(retailCustomer2.toString());
        System.out.println(preferredCustomer2.toString());
    }
}
