package Demo;


class Employee{
	private String empName;
	private int empId;
	private String address;
	private String mailId;
	private String mobileNo;
	protected double basicPay;
	
	public Employee(String empName,int empId, String address, String mailId, String mobileNo, double basicPay) {
		this.empName = empName;
		this.empId = empId;
		this.address = address;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.basicPay = basicPay;
	}
	
	public double calculateGrossSalary() {
		double DA = 0.97 * basicPay;
		double HRA = 0.10 * basicPay;
		return basicPay + DA + HRA;
	}
	
	public double calculateNetSalary() {
		double PF = 0.12 * basicPay;
		double staffClubFund = 0.001 * basicPay;
		return calculateGrossSalary() - (PF + staffClubFund);
	}
	
	public void generatePaySlip() {
		System.out.println("Employee name: " + empName);
		System.out.println("Employee Id: " + empId);
		System.out.println("Address: " + address);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Mobile No.: " + mobileNo);
		System.out.println("Basic pay: " + basicPay);
		System.out.println("Gross salary: " + calculateGrossSalary());
		System.out.println("Net salary: " + calculateNetSalary());
	}
}

class Programmer extends Employee{
	public Programmer(String empName,int empId, String address, String mailId, String mobileNo, double basicPay) {
		super(empName, empId, address, mailId, mobileNo, basicPay);
	}
}

class TeamLead extends Employee{
	public TeamLead(String empName,int empId, String address, String mailId, String mobileNo, double basicPay) {
		super(empName, empId, address, mailId, mobileNo, basicPay);
	}
}

class AssistantProjectManager extends Employee{
	public AssistantProjectManager(String empName,int empId, String address, String mailId, String mobileNo, double basicPay) {
		super(empName, empId, address, mailId, mobileNo, basicPay);
	}
}


class ProjectManager extends Employee{
	public ProjectManager(String empName,int empId, String address, String mailId, String mobileNo, double basicPay) {
		super(empName, empId, address, mailId, mobileNo, basicPay);
	}
}



 class EmployeeTest {
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer("Ajinkya", 100, "Pune", "ajinkya@gmail.com", "9999999999", 53200.01);
		TeamLead teamlead = new TeamLead("Om", 101, "Mumbai", "om@gmail.com", "8888888888", 53200.01);
		AssistantProjectManager assistantprojectmanager = new AssistantProjectManager("Sarvesh", 102, "Satara", "sarvesh@gmail.com", "7777777777", 23200.01);
		ProjectManager projectmanager = new ProjectManager("Siddharth", 103, "", "siddharth@gmail.com", "6666666666", 200000.01);
		
		System.out.println("Programmer pay slip: ");
		programmer.generatePaySlip();
		System.out.println();
		
		System.out.println("TeamLead pay slip: ");
		teamlead.generatePaySlip();
		System.out.println();
		
		System.out.println("AssistantProjectManager pay slip: ");
		assistantprojectmanager.generatePaySlip();
		System.out.println();
		
		System.out.println("ProjectManager pay slip: ");
		projectmanager.generatePaySlip();
		System.out.println();
	}
}