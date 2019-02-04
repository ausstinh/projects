package assignment5;

public class Gun extends Weapon{
	
	
	public void fireWeapon(int power) {
		System.out.println("Bang bang bang you were shot with a power of " + power);
	}
	public void fireWeapon() {
		System.out.println("ratatat tat tat tat. machine gunned! ");
	}
	@Override
	public void activate(boolean enable) {
		if(enable == true) {
			System.out.println("Click. The next bullet is in the chamber and the safety is off!");			
		}
		else {
			System.out.println("Click click. The safety is set, gun is unloaded");
		}
		
	}
	
}
