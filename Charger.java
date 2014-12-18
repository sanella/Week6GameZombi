/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */

public class Charger extends Zombie {

	public Charger() {
		super("Charger", 200, 0.2, new Weapon(), 3, 10);
	}

	public Charger(String name, double hp, double dex, Weapon weapon,
			double strength, double speed) {
		super(name, hp, dex, weapon, strength, speed);
	}
	
	public double Attack(){
		return super.Attack();
	}
	
	// By Sanela (izmedju ostalog).
	public double specialAttack() {
		if ((int)(Math.random() * 4) == 0) {
			return getStrenght() * getSpeed();
		}
		else {
			return 0;
		}
}
}