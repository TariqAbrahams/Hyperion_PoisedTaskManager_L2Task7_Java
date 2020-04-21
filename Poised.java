public class Poised {

    // Attributes
    static int projectNumber;
    static String projectName;
    static String buildingDesign;
    static String physicalAddress;
    static int ERFNumber;
    static float projectTotalFee;
    static float totalToDate;
    static String projectDeadline;

    // Poised Method.
    public Poised (int projectNumber, String projectName, String buildingDesign, String physicalAddress,
                   int ERFNumber, float projectTotalFee, float totalToDate, String projectDeadline){

        Poised.projectNumber = projectNumber;
        Poised.projectName = projectName;
        Poised.buildingDesign = buildingDesign;
        Poised.physicalAddress = physicalAddress;
        Poised.ERFNumber = ERFNumber;
        Poised.projectTotalFee = projectTotalFee;
        Poised.totalToDate = totalToDate;
        Poised.projectDeadline = projectDeadline;
    }
    // Converts above Method to a String.
    public String toString() {
        String output = "Project Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Design: " + buildingDesign;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nERF Number: " + ERFNumber;
        output += "\nProject Total Fee: R " + projectTotalFee;
        output += "\nTotal amount paid to date: R " + totalToDate;
        output += "\nProject Deadline: " + projectDeadline;

        return output;
    }

}
