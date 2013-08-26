package observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Kane.Sun
 */
public class TestClass {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String... args) {
		try {
			Teakettle teakttle = new Teakettle();
			Alerter alerter = new Alerter();
			teakttle.heat();
		} catch (InterruptedException ex) {
			Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
