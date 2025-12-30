/**
 * Purpose:  Represents a preferred customers with additional attributes such as cashback rate.
 * @author:  Omar Alkhamissi
 * Date:	 Feb 25, 2024
 */

public class PreferredCustomer extends RetailCustomer {
    private int cashbackRate;

    // Constructor to initialize PreferredCustomer with first name, last name, customer level, total purchases, and cashback rate.
    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate) {
        super(firstName, lastName, customerLevel, totalPurchases); // Calling the superclass constructor
        this.cashbackRate = cashbackRate;
    }

    // Mutators and Accessors
    public int getCashBackRate() {
        return cashbackRate;
    }

    public void setCashBackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    /*   
     * Method Name: incentives
     * Purpose: Calculates the incentives based on total purchases, discount rate, and cashback rate.
     * Accepts: None.
     * Returns: A double value representing the incentives.
     */
    @Override
    public double incentives() {
        return super.incentives() + (super.incentives() * (cashbackRate /   100.0));
    }

    /*
     * Method Name: toString
     * Purpose: Returns a formatted string representation of the PreferredCustomer object, including cashback rate.
     * Accepts: None.
     * Returns: A String object representing the PreferredCustomer object.
     */
    @Override
    public String toString() {
        return String.format("%s"
        				   + "%-20s %d%%\n",
        								  super.toString(),
				                   		  "Cashback Rate:",
				                   		  cashbackRate);
    }
}
