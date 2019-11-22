package chapter6;
import java.security.SecureRandom;

public class GameOfchance {

	public static final SecureRandom dice = new SecureRandom();
	public int rollDice() {
		int firstDie = 1 + dice.nextInt(6);
		int secondDie = 1 + dice.nextInt(6);
		
		int sum = firstDie + secondDie;
		System.out.printf("The rolled dice is %d + %d = %d%n",firstDie,secondDie,sum);
		return sum;
	}

	public void playersStatus() {
		String status = null;
		int point = 0;
		int sum = rollDice();
		
		switch(sum) {
		case 7:
		case 11:
			status = "win";
			break;
		case 2:
		case 3:
		case 12:
			status = "lost";
			break;
			
			default : 
				point  = sum;
				status = "continue";
				break;
		}
		while (status == "continue") {
			sum = rollDice();
		
			if(sum == 7) {
				status = "lost";
			}
			else{
				if(sum == point) {
					status = "win";
					
				}
			}
		}
		
		System.out.println(status);
	}
}


