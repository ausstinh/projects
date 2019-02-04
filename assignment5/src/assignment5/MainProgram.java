package assignment5;

public class MainProgram {

	public static void main(String[] args) {
		
		Bomb weapon1 = new Bomb();
		Gun weapon2 = new Gun();
		
		weapon1.fireWeapon(5);
		weapon2.fireWeapon(11);
		weapon2.fireWeapon();
		weapon1.fireWeapon();
		
		weapon1.activate(true);
		weapon1.activate(false);
		
		weapon2.activate(true);
		weapon2.activate(false);
		
		
	}

}
