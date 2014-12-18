package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */


public class Charger extends Zombie{

	
	public Charger(){
		super("Charger", 10, 10, new Weapon(), 10, 10);
	}
	
	public Charger(String name, double hp, double dex, Weapon weapon, double strength, double speed){
        super(name, hp, dex, weapon, strength, speed);
	}
}
