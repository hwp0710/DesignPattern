package pattern.strategy.weapon.impl;

import pattern.strategy.weapon.WeaponBehavior;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 10:06:14 AM
 * 
 */

public class ShotGun implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("Infinity ammo Destroy Evething !");
	}

}
