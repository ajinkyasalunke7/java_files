class Employee {
    private String empName;
    private int empId;
    private String address;
    private String mailId;
    private String mobileNo;
    protected double basicPay;
   
    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double DA = 0.97 * basicPay;
        double HRA = 0.10 * basicPay;
        return basicPay + DA + HRA;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        double PF = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return calculateGrossSalary() - (PF + staffClubFund);
    }

    // Method to generate pay slip
    public void generatePaySlip() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Subclass for Programmer
class Programmer extends Employee {
    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Team Lead
class TeamLead extends Employee {
    public TeamLead(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Assistant Project Manager
class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Subclass for Project Manager
class ProjectManager extends Employee {
    public ProjectManager(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Main class to test the program
public class EmployeeTest {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ajinkya", 1002, "Pune", "ajinkya@gmail.com", "7788554411", 50000);
        TeamLead teamLead = new TeamLead("Om", 1003, "Pimpri", "om@gmail.com", "8788547859", 60000);
        AssistantProjectManager assistantPM = new AssistantProjectManager("Sai", 1004, "Akurdi", "sai@gmail.com", "6688558899", 70000);
        ProjectManager projectManager = new ProjectManager("Rohan", 1005, "Nigdi", "rohan@gmail.com", "8877995544", 80000);

        // Generate pay slips for each employee
        System.out.println("Programmer Pay Slip: ");
        programmer.generatePaySlip();
        System.out.println();

        System.out.println("Team Lead Pay Slip: ");
        teamLead.generatePaySlip();
        System.out.println();

        System.out.println("Assistant Project Manager Pay Slip: ");
        assistantPM.generatePaySlip();
        System.out.println();

        System.out.println("Project Manager Pay Slip: ");
        projectManager.generatePaySlip();
    }
}