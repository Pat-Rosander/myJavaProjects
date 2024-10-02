package contactListDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		
		do {
			introGreeting();
			userInput = scnr.nextInt(); //TODO exception handle if user doesnt input an int
			
			
			switch(userInput) {
				case 1:
					System.out.println("Contact list:");
					//TODO
					break;
				case 2:
					System.out.println("Adding a contact:");
					//TODO
					break;
				case 3:
					System.out.println("Deleting a contact:");
					//TODO
					break;
				case 4:
					System.out.println("Selecting a contact:");
					//TODO
					break;
				case 5:
					System.out.println("Exiting contact list, thank you!");
					break;
				default:
					System.out.println("Please enter a valid input");
					break;
			}
		} while(userInput != 5);
	}
	
	public static void introGreeting() {
		System.out.println("Welcome to your contacts list! Please input an option");
		System.out.println("1. Display contact list");
		System.out.println("2. Add new contact");
		System.out.println("3. Delete a contact");
		System.out.println("4. Select a contact");
		System.out.println("5. Quit");
	}
	
}


