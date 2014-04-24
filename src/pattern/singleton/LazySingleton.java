package pattern.singleton;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Oct 9, 2013 1:24:24 PM
 * 
 */

public class LazySingleton {

	private volatile static LazySingleton instance;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}

		return instance;
	}
}
