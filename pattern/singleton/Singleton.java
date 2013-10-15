package singleton;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Oct 9, 2013 1:24:24 PM
 * 
 */

public class Singleton {

	/*
	 * to get more info , just check at here
	 * http://blog.csdn.net/cnyyx/article/details/7482735
	 */

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
