package pattern.observer.pull.javaapi;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Sep 4, 2013 2:21:12 PM
 * 
 */

public class TestTeakettle {

	public static Random random = new Random();

	private boolean isHeat = true;

	public static void main(String... args) {
		TemperatureInformer informer = new TemperatureInformer();
		TeakettleAlerter teakettleAlerter = new TeakettleAlerter();
		TestTeakettle teakettle = new TestTeakettle();
		teakettleAlerter.embed(teakettle);
		teakettle.heat(informer, teakettleAlerter);
	}

	private void heat(TemperatureInformer informer, TeakettleAlerter teakettleAlerter) {

		informer.addObserver(teakettleAlerter);
		DecimalFormat decimalFormat = new DecimalFormat(".#");
		double currentTemp = 90;
		while (isHeat) {
			currentTemp += random.nextDouble();
			informer.changeTemperature(Double.parseDouble(decimalFormat.format(currentTemp)));
			try {
				Thread.sleep(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopHeating() {
		isHeat = false;
	}

}
