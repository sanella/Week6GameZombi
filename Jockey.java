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
		super("Jockey", 200, 0.5, new Weapon(), 5, 13);
	}
	public double Attack(){
		return super.Attack();
	}
	public double specialAttack() {
		if ((int)(Math.random() * 4) == 0) {
			return getStrenght() * getSpeed();
		}
		else {
			return 0;
		}
}
}
