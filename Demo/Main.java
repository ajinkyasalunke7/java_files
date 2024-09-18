package Demo;


public class Main {
	
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