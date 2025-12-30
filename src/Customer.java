/**
 * Purpose:  Abstract class representing a customer with basic information and methods.
 * @author:  Omar Alkhamissi
 * Date:	 Feb 25, 2024
 */

import java.util.Random;

public abstract class Customer {
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;
    
    // Constructor to initialize customer with first name, last name, and customer level
    public Customer(String firstName, String lastName, String customerLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        setCustomerID();
    }
    
    // Mutators and Accessors
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    /*
     * Method Name: setCustomerID
     * Purpose: Generates a unique customer ID based on the customer's last name and a random number.
     * Accepts: None.
     * Returns: Nothing. Modifies the customerID instance variable directly.
     */
    private void setCustomerID() {
        String idPrefix = lastName.length() >  4 ? lastName.substring(0,  4).toUpperCase() : lastName.toUpperCase() + "XXX";
        idPrefix = idPrefix.substring(0,  4);
        Random random = new Random();
        StringBuilder idSuffix = new StringBuilder();
        for (int i =  0; i <  5; i++) {
            idSuffix.append(random.nextInt(10));
        }
        this.customerID = idPrefix + "-" + idSuffix.toString();
    }
    
    /*
     * Method Name: incentives
     * Purpose: Abstract method to calculate incentives.
     * Accepts: None.
     * Returns: A double value representing the incentives.
     */
    public abstract double incentives();
    
    /*
     * Method Name: toString
     * Purpose: Returns a string representation of the Customer object, including the customer ID, first name, and last name.
     * Accepts: None.
     * Returns: A String object that represents the Customer object.
     */
    @Override
    public String toString() {
        return  String.format("%s, %s %s",customerID, firstName, lastName);
    }
}
