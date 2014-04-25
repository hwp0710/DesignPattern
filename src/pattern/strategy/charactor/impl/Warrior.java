package pattern.strategy.charactor.impl;

import pattern.strategy.charactor.Charactor;
import pattern.strategy.weapon.WeaponBehavior;
import pattern.strategy.weapon.impl.Axe;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 10:04:44 AM
 * 
 */

public class Warrior extends Charactor {

	public Warrior() {
		weaponBehavior = new Axe();
	}

	@Override
	public void attack() {
		weaponBehavior.attack();
	}

	@Override
	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

}
