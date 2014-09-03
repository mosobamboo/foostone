package v1;

import java.util.Random;

public class Role {
	private Random random = new Random();
	
	public String weapon ;

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public void attack(Monster monster){
		if(monster.hp<=0){
			System.out.println("This monster was dead.");
			return;
		}
		
		if("wood"==this.weapon){
			monster.hp-=20;
			if(monster.hp<=0){
				System.out.println("This monster was dead.");
				return;
			}else{
				System.out.println("moster "+monster.name+" lost "+monster.hp+" hp");
			}
		}else if("iron"==this.weapon){
			monster.hp-=50;
			if(monster.hp<=0){
				System.out.println("This monster was dead.");
				return;
			}else{
				System.out.println("moster "+monster.name+" lost "+monster.hp+" hp");
			}			
		}else if("magic"==this.weapon){
			int loss =(random.nextDouble()<0.5)?100:200;
			monster.hp-=loss;
			if(200==loss){
				System.out.println("Double Attack!");
			}
			if(monster.hp<=0){
				System.out.println("This monster was dead.");
				return;
			}else{
				System.out.println("moster "+monster.name+" lost "+monster.hp+" hp");
			}			
		}
	}
	
}
