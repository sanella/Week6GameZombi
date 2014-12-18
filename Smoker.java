/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */

public class Smoker extends Zombie {

	public Smoker() {
		super("Smoker", 200, 0.8, new Weapon(), 8, 18);
	}

	public Smoker(String name, double hp, double dex, Weapon weapon,
			double strength, double speed) {
		super(name, hp, dex, weapon, strength, speed);
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
