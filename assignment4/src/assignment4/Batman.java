package assignment4;

import java.util.Random;

public class Batman extends SuperHero {

	public Batman(int health) {
		super("Batman",health);
		
	}
	public int useKryptonite() {
		Random rnd = new Random();
		int i = rnd.nextInt(10);
		if(i<3) {
			System.out.println("Batman used Kryptonite!!");
			
			return 10;
		}
	return 0;
}
}
