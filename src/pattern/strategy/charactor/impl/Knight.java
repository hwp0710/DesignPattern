package pattern.strategy.charactor.impl;

import pattern.strategy.charactor.Charactor;
import pattern.strategy.weapon.WeaponBehavior;
import pattern.strategy.weapon.impl.Sword;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 9:52:39 AM
 * 
 */

public class Knight extends Charactor {

	public Knight() {
		weaponBehavior = new Sword();
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
