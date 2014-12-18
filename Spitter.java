package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */


public class Spitter extends Zombie {
	
	
	public Spitter(){
		super("Spiter", 40, 30, new Weapon(), 60, 98);
	}
	
	public Spitter(String name, double hp, double dex, Weapon weapon, double strength, double speed){
        super(name, hp, dex, weapon, strength, speed);
	}
}
