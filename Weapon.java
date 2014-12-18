/**
 * 
 * @author Sanela, Jesenko, Emir, Davor
 *
 */
public class Weapon {

	private double damage;
	private double critical;
	private double ammo;
	
	
	public Weapon(){
		this.damage = 0;
		this.critical = 0;
		this.ammo = 100;
	}
	
	// Uzi constructor
	public Weapon(double damage, double critical, double ammo){
		this.damage = damage;
		this.critical = critical;
		this.ammo = ammo;
	}
	
	// Bone, Katana, Claw, Bite, Saw constructor
	public Weapon(double damage, double critical){
		
		this.damage = damage;
		this.critical = critical;
	}

	

	public double getDamage() {
		return damage;
	}

	public double getCritical() {
		return critical;
	}

	public double getAmmo() {
		return ammo;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public void setCritical(double critical) {
		this.critical = critical;
	}

	public void setAmmo(double ammo) {
		this.ammo = ammo;
	}

	
	public String toString() {
		return "Damage: " + damage + "\nCritical: " + critical
				+ "\nAmmo: " + ammo + "\n";
	}
	
	
	
	
	
}
