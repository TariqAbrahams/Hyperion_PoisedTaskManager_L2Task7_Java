public class Architect {

    // Attributes
    static String name;
    static String phoneNumber;
    static String email;
    static String physicalAddress;

    // Architect Method.
    public Architect (String name, String phoneNumber, String email, String physicalAddress) {
        Architect.name = name;
        Architect.phoneNumber = phoneNumber;
        Architect.email = email;
        Architect.physicalAddress = physicalAddress;
    }
    // Converts above Method to a String.
    public String toString() {
        String output = "Architect Name: " + name;
        output += "\nArchitect Phone Number: " + phoneNumber;
        output += "\nArchitect Email Address: " + email;
        output += "\nArchitect Physical Address: " + physicalAddress;

        return output;
    }
}

