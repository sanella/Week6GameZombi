package Igrica;

/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */

public class Zombie extends Character{

	
	public Zombie(){
		super("zoki", 50, 50, new Weapon(), 50, 50);
		
	}
	 public Zombie(String name, double hp, double dex, Weapon weapon, double strength, double speed){
		super(name,hp, dex,weapon,strength,speed);
	 }
	
}
