package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */


public class Jockey extends Zombie {

	public Jockey(String name, double hp, double dex, Weapon weapon,
			double strenght, double speed) {
		super(name, hp, dex, weapon, strenght, speed);
	}

	public Jockey() {
	super("Jockey", 50, 50, new Weapon(), 50, 50);
	}

}
