# CustomerDataStorage

CustomerDataStorage is a Java model project for customer profiles and incentive calculations. It demonstrates inheritance, polymorphism, and customer-type-specific discount behavior.

## Features

- Base `Customer` model with retail, business, and preferred customer subclasses
- Incentive calculations by customer type
- Tester program that demonstrates constructors, accessors, mutators, and polymorphic output

## Tech Stack

- Java
- Eclipse project metadata

## Getting Started

Import the project into Eclipse or compile from the command line:

```bash
javac src/*.java
java -cp src CustomerTester
```

## Project Structure

- `src/Customer.java`: base customer model
- `src/RetailCustomer.java`: retail customer behavior
- `src/BusinessCustomer.java`: business customer behavior
- `src/PreferredCustomer.java`: preferred customer behavior
- `src/CustomerTester.java`: demo entry point
