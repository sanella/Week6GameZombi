import java.util.Scanner;

// rekla mi je sanela da ne zaboravim main i ev ja stavio main
public class HajmoIgrat {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Player igrac = new Player("Vedad", 100, 0.4, null, 4, 16, 1.7);
	 Zombie prvi = new Zombie();
	 makeZombie(prvi);
	 
	 System.out.println("Sanela ce dodati pricu. Napao te zombie: "+prvi.toString());
	 int decision;
	 System.out.println("Ako zelis napasti ukucaj 1, ako zelis pobjeci ukucaj 2");
	 decision = in.nextInt();
	if ( encounter( igrac, prvi, decision) == false){
		System.out.println("Izgubio si!");
		return;
	} else {
		System.out.println("Pobjeda idemo dalje!");
	}
	
	 
	 
}
	
	public static boolean encounter(Player p, Zombie z, int decision){
		if( decision == 2){
			if( p.escChance(z) == true ){
				System.out.println("Pobjegao!");
				return true;
			} else {
				System.out.println("Moraces da se boris");
				decision = 1;
			}
		}
		if( decision == 1){
			while( z.getHp() > 0 && p.getHp() > 0){
				double attack = 0;
				attack = p.specialAttack();
				System.out.println("Igrac special attack : "+ attack);
			z.takeDamage(attack);
			attack = p.Attack();
			System.out.println("Igrac  attack : "+ attack);
			z.takeDamage(attack );
			
			if(z.getHp() >= 0){
				attack = z.specialAttack();
				System.out.println("Zombi special attack : "+ attack);
			p.takeDamage(attack);
			attack = z.Attack();
			System.out.println("Zombi  attack : "+ attack);
			p.takeDamage(attack );
			}
		}
		}
		return p.getHp() > 0;
	}

    public static Zombie makeZombie(Zombie prvi){
	int randBr = (int)(1 + Math.random() * 5);
	if (randBr == 1){
		prvi = new Emina();
	} if (randBr == 2){
		prvi = new Smoker();
	}
	if(randBr == 3){
		prvi = new Spitter();
	}
	if (randBr == 4) {
		prvi = new Jockey();
	}
	if (randBr == 5){
		prvi = new Charger();
	}
	return prvi;
}
}
