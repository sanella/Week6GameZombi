package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */


public class Smoker extends Zombie{
	
	
	public Smoker(){
		super("Smoker", 30, 40, new Weapon(), 90, 10);
	}
	
	public Smoker(String name, double hp, double dex, Weapon weapon, double strength, double speed){
        super(name, hp, dex, weapon, strength, speed);
	}
}