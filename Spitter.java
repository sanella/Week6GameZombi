/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */
	
public class Spitter extends Zombie {

	public Spitter() {
		super("Spiter", 200, 0.6, new Weapon(), 6, 15);
	}

	public Spitter(String name, double hp, double dex, Weapon weapon,
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
