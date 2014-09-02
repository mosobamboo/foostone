package foo;

import java.util.Random;

public class MagicSword implements IAttackStrategy {

	private Random random = new Random();
	
	public void AttackTarget(Monster monster) {
		// TODO Auto-generated method stub
		int loss =(random.nextDouble()<0.5)?100:200;
		if(200==loss){
			System.out.println("Double Attack!");
		}
		
		monster.notify(loss);
	}

}
