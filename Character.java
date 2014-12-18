/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */
public class Character {
	
	private String name;
	private double hp;
	private double dex;
	private Weapon weapon;
	private double strenght;
	private double speed;
	
	public Character(String name, double hp, double dex, Weapon weapon,
			double strenght, double speed) {
		
		this.name = name;
		this.hp = hp;
		this.dex = dex;
		this.weapon = weapon;
		this.strenght = strenght;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}

	public double getHp() {
		return hp;
	}

	public double getDex() {
		return dex;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public double getStrenght() {
		return strenght;
	}

	public double getSpeed() {
		return speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public void setDex(double dex) {
		this.dex = dex;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setStrenght(double strenght) {
		this.strenght = strenght;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Character(){
		
		this.name = "name";
		this.hp = 100;
		this.dex = 100;
		this.weapon = new Weapon();
		this.strenght = 100;
		this.speed = 100;
	}

	public String toString() {
		return "Name: " + name + "\nHP: " + hp + "\nDEX: " + dex
				+ "\nSTRENGHT: " + strenght + "\nSPEED: " + speed;
	}	
	
	
	

	
	
	public Attack
	
	public specialAttack
	
	

}
