public class Contractor {

    //Attributes.
    static String name;
    static String phoneNumber;
    static String email;
    static String physicalAddress;

    // Contractor Method.
    public Contractor (String name, String phoneNumber, String email, String physicalAddress) {
        Contractor.name = name;
        Contractor.phoneNumber = phoneNumber;
        Contractor.email = email;
        Contractor.physicalAddress = physicalAddress;
    }
    // Converts Above Method to a String.
    public String toString() {
        String output = "Contractor Name: " + name;
        output += "\nContractor Phone Number: " + phoneNumber;
        output += "\nContractor Email Address: " + email;
        output += "\nContractor Physical Address: " + physicalAddress;

        return output;
    }
}
