package BattleshipGame;

import java.util.Scanner;


public class BattleshipGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my Battleship game!");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Main menu: ");
			System.out.println("Press \"1\" to play.");
			System.out.println("Press \"2\" to exit the game.");
			System.out.print("Your decision: ");
			String userDecision = scan.nextLine();
			
			if(userDecision.equals("1")) {
				play();
				
				System.out.println("Do you want to exit? (type yes or no): ");
				
				String exit = scan.nextLine();
				
				if(exit.equals("yes")) {
					System.out.println("Goodbye!");
					break;
				} else {
					continue;
				}	
				
				
			} else {
				break;
				
			}
		}
		scan.close();	
	}

	public static void play() {
		Scanner ayy = new Scanner(System.in);
		
		System.out.print("Write game board dimensions in the form width,height: ");
		String dimensions = ayy.nextLine();
		ayy.close();
		String [] wAh = dimensions.split(",");
		int width = Integer.parseInt(wAh[0]);
		int height =  Integer.parseInt(wAh[1]);
		System.out.println(width + height);	
		
	}

}
