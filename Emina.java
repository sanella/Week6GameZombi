/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */

public class Emina extends Zombie {

	public Emina() {
		super("Emina", 200, 1, new Weapon(), 10, 20);
	}

	public Emina(String name, double hp, double dex, Weapon weapon,
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