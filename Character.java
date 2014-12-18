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

		this.setName(name);
		this.setHp(hp);
		this.setDex(dex);
		this.setWeapon(weapon);
		this.setStrenght(strenght);
		this.setSpeed(speed);
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
		if (hp < 0) {
			this.hp = 0;
		}
		if (hp > 200) {
		this.hp = 200;
		}
		this.hp = hp;
	}

	public void setDex(double dex) {
		if (dex < 0) {
			this.dex = 0;
		}
		if (dex > 1) {
			this.dex = 1;
		}
		this.dex = dex;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setStrenght(double strenght) {

		if (strenght < 0) {
			this.strenght = 0;
		}
		if (strenght > 10) {
			this.strenght = 10;
		}
		this.strenght = strenght;
	}

	public void setSpeed(double speed) {
		if (speed < 0) {
			this.speed = 0;
		}
		if (speed > 20) {
			this.speed = 20;
		}
		this.speed = speed;
	}

	public Character() {

		this.name = "name";
		this.hp = 200;
		this.dex = 1;
		this.weapon = new Weapon();
		this.strenght = 10;
		this.speed = 20;
	}

	public String toString() {
		return "Name: " + name + "\nHP: " + hp + "\nDEX: " + dex
				+ "\nSTRENGHT: " + strenght + "\nSPEED: " + speed;
	}

	public double Attack() {
		double newDex = 0;
		if (dex < 0.5) {
			newDex = Math.random() * dex;
			return newDex * strenght;
		} else {
			return dex * strenght;
		}
	}

	public double specialAttack() {
		if ((int)(Math.random() * 4) == 0) {
			return getStrenght() * getSpeed();
		}
		else {
			return 0;
		}
	
	}
	
	public void takeDamage(double amount){
		this.hp -= amount;
	}

}
