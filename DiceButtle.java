import java.util.Random;


class DiceButtle{
    public static void main(String args[]){
	
	int Dice1 = 0;
	int Dice2 = 0;
	
	Random rand = new Random();
	Dice1 = rand.nextInt(6) + 1;
	Dice2 = rand.nextInt(6) + 1;

	if((Dice1+Dice2) > 7){
	    System.out.println("You won!");
	}
	else{
	    System.out.println("You lost!");
	}
    }
}
