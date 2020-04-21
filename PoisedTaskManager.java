import java.util.Scanner;

public class PoisedTaskManager {
    // Menu Method.
    public static int Menu(){
        // Whitespace.
        System.out.println();
        // Greeting Message.
        System.out.println("Welcome to Poised Project Creator");

        Scanner scanner = new Scanner(System.in);
        // The following allows the user to select from the options below and it will produce a Method based on
        // The users choice.
        System.out.println();
        System.out.println("Please select one of the following options...");
        System.out.println();
        System.out.print("1. Create New Project\n" +
                "2. Update Existing Project\n" +
                "3. Update Contractors Details\n" +
                "4. Finalise Existing Project\n: ");
        int select = scanner.nextInt();
        if (select == 1)
            return NewProject();
        else if (select == 2)
            return EditExistingProject();
        else if (select == 3)
            return EditContractorDetails();
        else if (select == 4)
            return FinaliseProject();
        else
            // Returns the menu Method.
            return Menu();
    }
    // New Project Method.
    public static int NewProject() {
        System.out.println();
        System.out.println("New Project");
        System.out.println("_____________________________________________");

        // Prints all Project Details for user to complete.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Project Details");
        System.out.println("_____________________________________________");
        System.out.println();

        System.out.print("Enter Project Number\n: ");
        int proNum = scanner.nextInt();
        scanner.nextLine();             // Buffer.
        System.out.println();

        System.out.print("Enter Project Name\n: ");
        String proName = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Building Type\n: ");
        String buildType = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Physical Address for the project\n: ");
        String phyAddress = scanner.nextLine();
        System.out.println();

        System.out.print("Enter ERF Number\n: ");
        int proERFNumber = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Total Project Fee\nR ");
        float proTotalFee = scanner.nextFloat();
        System.out.println();

        System.out.print("Total amount Paid to Date\nR ");
        float proTotalToDate = scanner.nextFloat();
        scanner.nextLine();                         // Buffer.
        System.out.println();

        System.out.print("Enter Project Deadline\n: ");
        String proDeadline = scanner.nextLine();
        System.out.println();

        // Prints all Architect details for user to complete.
        System.out.println("____________________________________________");
        System.out.println("Architect Details");
        System.out.println("____________________________________________");
        System.out.println();

        System.out.print("Enter Architect Name\n: ");
        String ArcName = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Architect Phone Number\n: ");
        String ArcPhoneNumber = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Architect Email Address\n: ");
        String ArcEmail = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Physical Address of Architect\n: ");
        String ArcPhyAddress = scanner.nextLine();
        System.out.println();

        // Prints all Contractor Details for user to complete.
        System.out.println("___________________________________________");
        System.out.println("Contractor Details");
        System.out.println("___________________________________________");
        System.out.println();

        System.out.print("Enter Contractors Name\n: ");
        String ContName = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Contractors Phone Number\n: ");
        String ContNumber = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Contractors Email Address\n: ");
        String ContEmail = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Physical Address of Contractor\n: ");
        String ContPhyAddress = scanner.nextLine();
        System.out.println();

        // Prints all Customer Details for User to complete.
        System.out.println("__________________________________________");
        System.out.println("Customer Details");
        System.out.println("__________________________________________");
        System.out.println();

        System.out.print("Enter Customer Name Only\n: ");
        String CustName = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Customer Surname Only\n: ");
        String CustSurname = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Customer Phone Number\n: ");
        String CustNumber = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Customer Email Address\n: ");
        String CustEmail = scanner.nextLine();
        System.out.println();

        System.out.print("Enter Physical Address of Customer\n: ");
        String CustPhyAddress = scanner.nextLine();
        System.out.println();

        // Function that adds a project name if the user forgot to enter one.
        if (proName.equals("")){
            proName = buildType + " " + CustSurname;
        }
        // Calls all the Created Class Functions.
        Poised poised = new Poised(proNum, proName, buildType, phyAddress, proERFNumber,
                proTotalFee, proTotalToDate, proDeadline);

        Architect architect = new Architect(ArcName, ArcPhoneNumber, ArcEmail, ArcPhyAddress);

        Contractor contractor = new Contractor(ContName, ContNumber, ContEmail, ContPhyAddress);

        Customer customer = new Customer(CustName, CustSurname, CustNumber, CustEmail, CustPhyAddress);
        System.out.println();

        // Prints all details the user entered above in a easy to read manner.
        System.out.println("Project details");
        System.out.println(".........................");
        System.out.println(poised);
        System.out.println();

        System.out.println("Architect Details");
        System.out.println(".........................");
        System.out.println(architect);
        System.out.println();

        System.out.println("Contractor Details");
        System.out.println(".........................");
        System.out.println(contractor);
        System.out.println();

        System.out.println("Customer Details");
        System.out.println(".........................");
        System.out.println(customer);
        System.out.println();

        // If the user selects 1 the new project will be added, if the user selects 2 it will return them to the
        // Create new project Method.
        System.out.println("Add Project");
        System.out.print("1. Yes\n" +
                "2. No\n: ");
        int proAdd = scanner.nextInt();

        if (proAdd == 1)
            System.out.println("Project Successfully Added");

        else
            return NewProject();
        // Returns the Menu.
        return Menu();
    }
    // Edit existing project Method.
    public static int EditExistingProject() {
        // WhiteSpace.
        System.out.println();
        System.out.println("Edit Existing Project");
        System.out.println("..........................................");

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        // If the user selects 2 in the Menu Method above the following options will display.
        System.out.print("1. Edit Project Due Date\n" +
                "2. Edit Total Amount Paid to Date\n" +
                "3. Main Menu\n: ");
        int editExistPro = scanner.nextInt();
        scanner.nextLine();                     // Buffer.

        // If the User selects 1 they will be directed to the Deadline Edit Method.
        if (editExistPro == 1)
            return DeadLineEdit();

        // If the User selects 2 they will be directed to the Edit total amount paid to date Method
        else if (editExistPro == 2)
            return (int) AmountPaidToDateEdit();

        else
            // Returns the Menu.
            return Menu();
    }
    // Deadline edit Method.
    public static int DeadLineEdit(){
        // If the user did not create a project yet they wont be allowed to change the deadline date.
        if (Poised.projectDeadline != null){
            System.out.println();
            System.out.println("Current Deadline Date: " + Poised.projectDeadline);
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            // Asks for the new Deadline Date if project has been created already.
            System.out.print("Enter New Project Deadline Date\n: ");
            String NewDeadline = scanner.nextLine();
            System.out.println();

            Poised.projectDeadline = NewDeadline;
            // Prints the new Deadline date.
            System.out.println("New Deadline Date: " + NewDeadline);
            System.out.println();
            System.out.println("Project Deadline Successfully Updated.");
            // Returns Menu.
            return Menu();
        }
        // If no projects are created the below message will appear and return the menu.
        System.out.println();
        System.out.println("No Projects Available");
        return Menu();
    }
    // Total Amount paid to date edit Method.
    public static float AmountPaidToDateEdit() {
        // If the Total Paid to Date is less than the Project Total Fee the function below will run,
        // It will prompt the user to enter a new amount paid and not the total project fee then add that amount,
        // To the project total fee.
        if (Poised.totalToDate < Poised.projectTotalFee){
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter New Amount Paid Not New Total\nR ");
            float NewToDateTotal = scanner.nextFloat();
            NewToDateTotal += Poised.totalToDate;
            Poised.totalToDate = NewToDateTotal;
            System.out.println("New Amount Paid To Date = R " + NewToDateTotal);
            System.out.println();
            System.out.println("New Amount Added Successfully.");
            return Menu();
        }
        // If the Total Paid to date is equal to the project total fee the below message will appear.
        else if (Poised.totalToDate != 0 && Poised.projectTotalFee != 0 && Poised.totalToDate == Poised.projectTotalFee){
            System.out.println("Already Paid in Full");
            return Menu();
        }
        // If No projects have been created the below message will be displayed and return the menu.
        System.out.println();
        System.out.println("No Projects Available");
        return Menu();
    }
    // Edit Contractors Details Method.
    public static int EditContractorDetails() {
        // If no project has been created the user won't be allowed to change the Contractors Details,
        // If the project is already created the existing Contractors details will be displayed and the user will be,
        // prompted to enter the new details and it would be updated.
        if (Contractor.name != null && Contractor.phoneNumber != null && Contractor.email != null &&
                Contractor.physicalAddress != null){
            System.out.println();
            System.out.println("Existing Contractor Details");
            System.out.println("..................................");
            Contractor contractor = new Contractor(Contractor.name, Contractor.phoneNumber, Contractor.email,
                    Contractor.physicalAddress);
            System.out.println(contractor);
            System.out.println();

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("Edit Contractors Details");
            System.out.println();

            System.out.print("Enter Contractors Name\n: ");
            String NewContName = scanner.nextLine();
            System.out.println();

            System.out.print("Enter Contractors Phone Number\n: ");
            String NewContNumber = scanner.nextLine();
            System.out.println();

            System.out.print("Enter Contractors Email Address\n: ");
            String NewContEmail = scanner.nextLine();
            System.out.println();

            System.out.print("Enter Physical Address of Contractor\n: ");
            String NewContPhyAddress = scanner.nextLine();
            System.out.println();
            // Prints the updated contractors details.
            System.out.println("Updated Contractors Details");
            System.out.println("......................................");
            Contractor NewContractor = new Contractor(NewContName, NewContNumber, NewContEmail, NewContPhyAddress);
            System.out.println(NewContractor);
            System.out.println();
            System.out.println("Contractor Details Updated.");

            // Returns Menu.
            return Menu();
        }
        // If no project has been created the below message will appear.
        System.out.println();
        System.out.println("No Projects Available");
        return Menu();

    }
    // Finalise Project Method.
    public static int FinaliseProject() {
        // If the Customer has not met the project fee total, and invoice will be created with the customers details,
        // and display the amount that still needs to be paid and mark the project as Finalised.
        if (Poised.totalToDate < Poised.projectTotalFee) {
            System.out.println();
            System.out.println("Customer Invoice");
            System.out.println("__________________________________________");
            System.out.println("Name: " + Customer.name);
            System.out.println("Surname: " + Customer.surname);
            System.out.println("Phone Number:" + Customer.phoneNumber);
            System.out.println("Email: " + Customer.email);
            System.out.println("Address: " + Customer.physicalAddress);
            System.out.print("Amount Due R ");
            System.out.println(Poised.projectTotalFee - Poised.totalToDate);
            System.out.println("..........................................");
            System.out.println("Project Finalised");
            System.out.println("Date: " + java.time.LocalDate.now());
            return Menu();
        }
        // If the total due to date equals project total fee the below message will display.
        else if (Poised.totalToDate != 0 && Poised.projectTotalFee != 0 && Poised.totalToDate == Poised.projectTotalFee){
            System.out.println();
            System.out.println("Full Amount Settled Already.");
            System.out.println(".............................................");
            System.out.println("Project Finalised");
            System.out.println("Date: " + java.time.LocalDate.now());
            return Menu();
        }
        // If no projects have been created the following message will be displayed.
        System.out.println();
        System.out.println("No Projects Available");
        return Menu();
    }
    // Main Method.
    public static void main(String[] args) {
        // Initiates/Starts the program.
        Menu();
    }
}
