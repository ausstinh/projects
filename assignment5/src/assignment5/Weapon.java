package assignment5;

public abstract class Weapon {

	public void fireWeapon(int power) {
		System.out.println("The weapon is fired with a power of " + power);
	}
	
	public abstract void activate(boolean enable);
	
}
