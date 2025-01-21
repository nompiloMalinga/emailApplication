import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName ="";
        String lastName ="";

        while (true) {
            System.out.println("Please enter your first name:");
            firstName = input.nextLine();
            if (isAlpha(firstName)) {
                break;
            } else {
                System.out.println("please enter a valid first name(with characters only)");
            }

        }
		while (true) {
            System.out.println("Please enter your last name:");
            lastName = input.nextLine();
            if (isAlpha(lastName)) {
                break;
            } else {
                System.out.println("please enter a valid last name(with characters only)");
            }

        }

		emailCreationLogic  emailApp = new emailCreationLogic (firstName,lastName); 
		System.out.println(emailApp);
        
       input.close();

    }

    public static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

}
