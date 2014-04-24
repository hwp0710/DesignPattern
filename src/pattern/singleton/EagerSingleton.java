package pattern.singleton;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 24, 2014 4:38:29 PM
 * 
 */

public class EagerSingleton {

	private EagerSingleton() {
	}

	private static final EagerSingleton SIGLETON_INSTANCE = new EagerSingleton();

	public static EagerSingleton getInstatnce() {
		return SIGLETON_INSTANCE;
	}

}
