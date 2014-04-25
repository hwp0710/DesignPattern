package pattern.strategy.charactor;

import pattern.strategy.weapon.WeaponBehavior;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 9:52:09 AM
 * 
 */

public abstract class Charactor {

	protected WeaponBehavior weaponBehavior;

	public abstract void attack();

	public abstract void setWeaponBehavior(WeaponBehavior weaponBehavior);

}
