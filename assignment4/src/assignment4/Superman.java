package assignment4;

import java.util.Random;

public class Superman extends SuperHero {

	public Superman(int health) {
		super("Superman", health);
		
	}
	public void flyAway(int DamageTaken) {
		Random rnd = new Random();
		int i = rnd.nextInt(10);
		if(i<3) {
			System.out.println("Superman dodged Batman's punch!!");
			
			this.setHealth(this.getHealth() + DamageTaken);
			System.out.println("Superman's raised his health to " + this.getHealth());
		}
	}
}
