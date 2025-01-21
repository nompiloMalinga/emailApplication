import java.util.Scanner;

public class emailCreationLogic {

    private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength=10;
	private String companySuffix ="peopleschoice.com";
	
	public emailCreationLogic(String firstName,String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department= setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		this.email = firstName.toLowerCase()+ "." + lastName.toLowerCase()+"@"+ department +"." + companySuffix;
	}
	
	private String setDepartment() {
        Scanner input = new Scanner(System.in);
        int depChoice;
        while (true) {
            System.out.println(
                    "Enter the department Codes :\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
            if (input.hasNextInt()) {
                depChoice = input.nextInt();
                if (depChoice == 1) {
                    return "Sales";
                } else if (depChoice == 2) {
                    return "Development";
                } else if (depChoice == 3) {
                    return "Accounting";
                } else if (depChoice == 0) {
                    return "";
                } else {
                    System.out.println("Invalid choice. Please enter a number between 0 and 3.");
                }

            } else {
                System.out.println("Invalid input. Please enter a numeric department code.");
                input.next();
            }
        }
		
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[]password = new char[length];
		for (int i=0;i<length;i++) {
			int rand =(int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	@Override
	public String toString() {
		return "Department :" + this.department + "\n"+
			   "Your password is :" + this.password +"\n" +
			   "Your email is:" + this.email;
	} 


}
