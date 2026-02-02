package learn.characters;

import learn.behaviors.WeaponBehavior;

public abstract class Character {
	
	protected WeaponBehavior weapon;
	
	public abstract void fignt();
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
