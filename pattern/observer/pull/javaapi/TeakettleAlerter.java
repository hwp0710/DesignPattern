package observer.pull.javaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Sep 4, 2013 2:12:00 PM
 * 
 */

public class TeakettleAlerter implements Observer {
	TemperatureInformer informer;
	TestTeakettle teakettle;
	final double DANGER_TEMP = 115;

	public void embed(TestTeakettle teakettle) {
		this.teakettle = teakettle;
	}

	@Override
	public void update(Observable o, Object arg) {
		informer = (TemperatureInformer) o;
		if (checkIfOverWornTemperature(informer.getTemperature())) {
			System.out.println("di di di di di");
		}
	}

	public boolean checkIfOverWornTemperature(double currentTemperature) {
		boolean result = false;
		if (currentTemperature >= 100) {
			result = true;
		}

		if (currentTemperature >= DANGER_TEMP) {
			result = true;
			System.out.println("oh shit , master is not here , stop the stupid teakettle");
			teakettle.stopHeating();
		}

		return result;
	}
}
