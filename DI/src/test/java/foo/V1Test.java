package foo;

import v1.Monster;
import v1.Role;

public class V1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ɹ���  
		Monster monster1 = new Monster("monsterA", 50);  
		Monster monster2 = new Monster("monsterB", 50);  
		Monster monster3 = new Monster("monsterC", 200);  
		Monster monster4 = new Monster("Boss", 1000);  

		//���ɽ�ɫ  
		Role role = new Role();  

		//ľ������  
		role.weapon = "wood";  
		role.attack(monster1);  

		//��������  
		role.weapon = "iron";  
		role.attack(monster2);  
		role.attack(monster3);  

		//ħ������  
		role.weapon = "magic";  
		role.attack(monster3);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  
		role.attack(monster4);  

	}

}
