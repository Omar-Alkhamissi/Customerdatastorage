/**
 * Purpose:  Represents a retail customers with additional attributes.
 * @author:  Omar Alkhamissi
 * Date:	 Feb 25, 2024
 */

public class RetailCustomer extends Customer {
    private double totalPurchases;

    // Constructor to initialize RetailCustomer with first name, last name, customer level, and total purchases.
    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
        super(firstName, lastName, customerLevel); // Calling the superclass constructor
        this.totalPurchases = totalPurchases;
    }

    // Mutators and Accessors
    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    /*  
     * Method Name: findDiscountRate
     * Purpose: Determines the discount rate based on total purchases.
     * Accepts: None.
     * Returns: An integer value representing the discount rate.
     */
    public int findDiscountRate() {
        if (totalPurchases > 10000) {
            return 15;  
        } else if (totalPurchases > 5000) {
            return 10;
        } else if (totalPurchases > 1000) {
            return 5;  
        } else {
            return 0;  
        }
    }

    /*  
     * Method Name: incentives
     * Purpose: Calculates the incentives based on total purchases and the discount rate determined by findDiscountRate.
     * Accepts: None.
     * Returns: A double value representing the incentives.
     */
    @Override
    public double incentives() {
        int discountRate = findDiscountRate();
        return totalPurchases * (discountRate / 100.0);
    }

    /*
     * Method Name: toString
     * Purpose: Returns a formatted string representation of the RetailCustomer object, including total purchases, discount rate, and net purchases.
     * Accepts: None.
     * Returns: A String object representing the RetailCustomer object.
     */
    @Override
    public String toString() {
        return String.format("%s\n%s Customer"
			        	   + "%-21s $%,.2f"
			        	   + "%-21s %d%%"
			        	   + "%-21s $%,.2f"
			        	   + "%-21s $%,.2f\n",
						                	super.toString(),
						                  	getCustomerLevel(),
						                  	"\nTotal Purchases:",
						                  	totalPurchases,
						                    "\nDiscount Rate:",
						                    findDiscountRate(),
						                    "\nDiscount Incentive:",
						                    incentives(),
						                    "\nNet Purchases:",
						                    totalPurchases - incentives());
    }
}
