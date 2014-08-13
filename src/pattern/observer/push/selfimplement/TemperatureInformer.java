package pattern.observer.push.selfimplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 *
 * @author Kane.Sun
 * @version Sep 4, 2013 4:31:22 PM
 * 
 */

public class TemperatureInformer implements Informer {

	private Random random = new Random();

	private List<Monitor> monitors = new ArrayList<>();;

	private int temperature;

	private boolean isKepHeating = true;

	@Override
	public void registerMonitor(Monitor monitor) {
		monitors.add(monitor);
	}

	@Override
	public void removeMonitor(Monitor monitor) {
		monitors.remove(monitor);
	}

	@Override
	public void notifyMonitor() {
		for (Monitor monitor : monitors) {
			monitor.update(getTemperature());
		}
	}

	public void heat() {
		while (isKepHeating) {
			temperature += random.nextInt(2);
			notifyMonitor();
		}
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void stopHeating() {
		isKepHeating = false;
	}

}
