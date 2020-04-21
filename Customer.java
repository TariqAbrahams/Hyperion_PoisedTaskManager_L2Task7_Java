public class Customer {

    // Attributes.
    static String name;
    static String surname;
    static String phoneNumber;
    static String email;
    static String physicalAddress;

    // Customer Method
    public Customer (String name, String surname, String phoneNumber, String email, String physicalAddress) {
        Customer.name = name;
        Customer.surname = surname;
        Customer.phoneNumber = phoneNumber;
        Customer.email = email;
        Customer.physicalAddress = physicalAddress;
    }
    // Converts Above Method to a String.
    public String toString() {
        String output = "Customer Name: " + name;
        output += "\nCustomer Surname: " + surname;
        output += "\nCustomer Phone Number: " + phoneNumber;
        output += "\nCustomer Email Address: " + email;
        output += "\nCustomer Physical Address: " + physicalAddress;

        return output;
    }
}
