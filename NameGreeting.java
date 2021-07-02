/*import java.util.Random;*/
import java.util.Scanner;

public class NameGreeting{
    public static void main(String args[]){
	/*	int Dice1 = 0;
	int Dice2 = 0;
	int Totalvalue = 0;
	
	System.out.println("Rolling the dice...");
	Random rand = new Random();
	Dice1 = rand.nextInt(6) + 1;
	Dice2 = rand.nextInt(6) + 1;
	Totalvalue = Dice1 + Dice2;

	System.out.println("Die 1: "+ Dice1);
	System.out.println("Die 2: "+ Dice2);
	System.out.println("Total value: "+ Totalvalue);
	*/	
	System.out.println("What is your name?");
	System.out.print("> ");
	
	Scanner scan = new Scanner(System.in);
	String Name = scan.next();

	System.out.println("Hello, " + Name + "!");
    }
}
