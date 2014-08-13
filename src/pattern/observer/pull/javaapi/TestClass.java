package pattern.observer.pull.javaapi;

/**
 * 
 * @author Kane.Sun
 */
public class TestClass {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String... args) throws InterruptedException {
		Teakettle teakttle = new Teakettle();
		Alerter alerter = new Alerter();
		teakttle.addObserver(alerter);
		alerter.sucscribeTeakettle(teakttle);
		teakttle.heat();
	}
}
