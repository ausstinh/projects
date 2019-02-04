package assignment4;

import java.util.Random;

public class MainProgram {

	public static void main(String[] args) {
	
		Random randomNumberGenerator = new Random();
		int health1 = randomNumberGenerator.nextInt(100);
		int health2 = randomNumberGenerator.nextInt(100);
		
		Superman superman = new Superman(health1);
		Batman batman = new Batman(health2);
		
		
		System.out.println("Super heros created. Now let's fight");
		
		while(!superman.isDead() && !batman.isDead()) {
			
			//attack each other
			
			superman.attack(batman);
			
			int d = batman.attack(superman);
			int k = batman.useKryptonite();
			superman.setHealth(superman.getHealth() - k);
			
			System.out.println("Superman's health is now " + superman.getHealth());
			superman.flyAway(d);
			
			
			//see if anyone survived
			
			if(superman.isDead()) {
				System.out.println("Superman is dead!!!");
			}
			if(batman.isDead()) {
				System.out.println("Batman is dead!!!");
			}
		}
		
		
		
	}
	
	
}
