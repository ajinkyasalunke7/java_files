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

