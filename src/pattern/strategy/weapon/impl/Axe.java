package pattern.strategy.weapon.impl;

import pattern.strategy.weapon.WeaponBehavior;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 10:02:43 AM
 * 
 */

public class Axe implements WeaponBehavior {

	@Override
	public void attack() {
		System.out.println("Axe attack !");
	}

}
