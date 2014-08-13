package pattern.observer.push.selfimplement;

/**
 *
 *
 * @author Kane.Sun
 * @version Sep 4, 2013 4:31:36 PM
 * 
 */

public class TestTeakerttle {

	public static void main(String... args) {
		TeakettleMoniter monitor = new TeakettleMoniter();
		TemperatureInformer informer = new TemperatureInformer();
		informer.registerMonitor(monitor);
		monitor.subscribeInformer(informer);

		informer.heat();
	}

}
