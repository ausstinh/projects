package assignment7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		
//		Person me = new Person("Austin", "anybody", "20");
//		
//		me.walk();
//		System.out.println("is " + me.getFirstName() + " running? " + me.isRunning());
//		
//		me.run();
//		System.out.println("is " + me.getFirstName() + " running? " + me.isRunning());
//		
//		Person Special = new Person("Kay", "anybody","40");
//		
//		System.out.println("Compare the two: " + me.compareTo(Special));
//		
		Person[] peopleList = new Person[10];
		
		peopleList[0] = new Person("Andrew", "Luck", 23);
		peopleList[1] = new Person("Joe", "Flaco", 22);
		peopleList[2] = new Person("Ben", "Harry", 25);
		peopleList[3] = new Person("Jim", "Wood", 27);
		peopleList[4] = new Person("Ameer", "Wood", 40);
		peopleList[5] = new Person("Otis", "Savage", 31);
		peopleList[6] = new Person("Diego", "Savage", 45);
		peopleList[7] = new Person("Emre", "Rice", 30);
		peopleList[8] = new Person("Gabija", "Rice", 45);
		peopleList[9] = new Person("Ray", "Salazar", 19);
		
		Arrays.sort(peopleList);
		
		for(int i = 0; i <peopleList.length; i ++) {
			System.out.println(peopleList[i]);
		}
	}

}
