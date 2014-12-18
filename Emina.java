package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */


public class Emina extends Zombie {
	
	
	public Emina(){
		super("Emina", 100, 100, new Weapon(), 100, 100);
	}
	

	public Emina(String name, double hp, double dex, Weapon weapon,
			double strength, double speed) {
		super(name, hp, dex, weapon, strength, speed);
	}

}
