package assignment5;

public class Bomb extends Weapon{

	public void fireWeapon(int power) {
		System.out.println("Kaboom!!! you were blown up with a power of " + power);
	}
	public void fireWeapon() {
		System.out.println("BOOM!! c4 has been deployed ");
	}
	@Override
	public void activate(boolean enable) {
		if(enable == true) {
			System.out.println("Sizzle. The fuze is lit. Run!");			
		}
		else {
			System.out.println("Psst. Pinched out the fuse. No danger now.");
		}
		
	}
	
}
