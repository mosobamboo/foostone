package foo;

public class V1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Éú³É¹ÖÎï  
		Monster monster1 = new Monster("monsterA", 50);  
		Monster monster2 = new Monster("monsterB", 50);  
		Monster monster3 = new Monster("monsterC", 200);  
		Monster monster4 = new Monster("Boss", 1000);  

		//Éú³É½ÇÉ«  
		Role role = new Role();  

		//Ä¾½£¹¥»÷  
		role.weapon = new WoodSword();  
		role.attack(monster1);  

		//Ìú½£¹¥»÷  
		role.weapon = new IronSword();  
		role.attack(monster2);  
		role.attack(monster3);  

		//Ä§½£¹¥»÷  
		role.weapon = new MagicSword();  
		role.attack(monster3);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  

	}

}
