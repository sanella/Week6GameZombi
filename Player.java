/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */
public class Player extends Character {
	
	private double inteligence;

	public Player(String name, double hp, double dex, Weapon weapon,
			double strenght, double speed, double inteligence) {
		super(name, hp, dex, weapon, strenght, speed);
		this.inteligence = inteligence;
	}
	
//	public double escChange;

}
