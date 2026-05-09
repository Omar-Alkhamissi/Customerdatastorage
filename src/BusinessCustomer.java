public class BusinessCustomer extends Customer {
    private String companyName;
    private int discountRate;
    private double totalPurchases;
    
    // Constructor to initialize BusinessCustomer with first name, last name, customer level, company name, discount rate, and total purchases.
    public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases) {
        super(firstName, lastName, customerLevel); // Calling the superclass constructor
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }
    
    // Mutators and Accessors
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    
    /* 
     * Method Name: incentives
     * Purpose: Calculates the incentives based on total purchases and discount rate.
     * Accepts: None.
     * Returns: A double value representing the incentives.
     */
    @Override
    public double incentives() {
        return totalPurchases * (discountRate /  100.0); // Converting discount rate to a double and calculating incentives
    }
    /*
     * Method Name: toString
     * Purpose: Returns a formatted string representation of the BusinessCustomer object, including company name, total purchases, discount rate, and net purchases.
     * Accepts: None.
     * Returns: A String object representing the BusinessCustomer object.
     */
    @Override
    public String toString() {
        return String.format("%s\nBusiness Customer for %s"
		        		   + "%-21s $%,.2f"
			        	   + "%-21s %d%%"
			        	   + "%-21s $%,.2f"
			        	   + "%-21s $%,.2f\n",
			        						super.toString(),
				                            companyName,
				                            "\nTotal Purchases:", 
				                            totalPurchases,
				                            "\nDiscount Rate:",
				                            discountRate,
				                            "\nDiscount Incentive:",
				                            incentives(),
				                            "\nNet Purchases:",
				                            totalPurchases - (totalPurchases * (discountRate /  100.0)));
    }


}
