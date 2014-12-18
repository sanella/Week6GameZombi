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
		this.setInteligence(inteligence);
	}

	public double getInteligence() {
		return inteligence;
	}

	public void setInteligence(double inteligence) {
		if(inteligence < 0.5){
			this.inteligence = 0.5;
		}
		if (inteligence > 2){
		this.inteligence = 2;
		}
        this.inteligence = inteligence;
	}
	
	
	public double Attack(){
		return super.Attack() * inteligence;
	}
	
	public boolean escChance(Character z){
		return ((inteligence * getSpeed() ) / z.getSpeed() ) >= 1 ? true : false;
	}

}
