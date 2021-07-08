import java.util.Scanner;
import java.util.Random;

class finalversion{
    public static void main(String args[]){
	
	int Dice1 = 0;
	int Dice2 = 0;
	int Totalvalue;
	
	System.out.println("What is your name?");
	System.out.print("> ");
	
	Scanner scan = new Scanner(System.in);
	String Name = scan.next();

	System.out.println("Hello, " + Name + "!");


	
	System.out.println("Rolling the dice...");
	Random rand = new Random();
	Dice1 = rand.nextInt(6) + 1;
	Dice2 = rand.nextInt(6) + 1;
	Totalvalue = Dice1+Dice2;
	System.out.println("Die 1: "+ Dice1);
	System.out.println("Die 2: "+ Dice2);
	System.out.println("Total value: "+ Totalvalue);
	if((Dice1+Dice2) > 7){
	    System.out.println( Name + " won!");
	}
	else{
	    System.out.println( Name + " lost!");
	}
    }
}
