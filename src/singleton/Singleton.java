package singleton;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Oct 9, 2013 1:24:24 PM
 * 
 */

public class Singleton {

	// the volatile keyword ensures that multiple threads handle the
	// uniqueInstance variable correctly when it is being initialized to the
	// Singleton instance
	private volatile static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}
}
