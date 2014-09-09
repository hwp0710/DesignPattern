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
			// even we add synchronized keyword , the following code may be
			// executed twice.so check if instance is null again . to ensure the
			// instance status is up to date , we set instance as volatile
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}

		return instance;
	}
}
