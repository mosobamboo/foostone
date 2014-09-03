package v2;

public class Monster {

	public Monster(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	
	public String name ;
	
	public int hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void notify(int loss){
		if(this.hp<=0){
			System.out.println("This monster was dead.");
			return;
		}
		this.hp-=loss;
		
		if(this.hp<=0){
			System.out.println("'monster "+this.name+"is killed.");
		}else{
			System.out.println("moster "+this.name+" lost "+loss+" hp");
		}
	}
}
