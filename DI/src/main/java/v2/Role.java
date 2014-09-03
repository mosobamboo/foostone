package v2;

public class Role {

	public IAttackStrategy weapon;

	public IAttackStrategy getWeapon() {
		return weapon;
	}

	public void setWeapon(IAttackStrategy weapon) {
		this.weapon = weapon;
	}
	
	
	public void attack(Monster monster){
		this.weapon.AttackTarget(monster);
	}
	
}
