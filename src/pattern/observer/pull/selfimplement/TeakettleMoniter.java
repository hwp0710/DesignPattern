package pattern.observer.pull.selfimplement;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Sep 4, 2013 4:29:33 PM
 * 
 */

public class TeakettleMoniter implements Monitor {

	private Informer informer;

	@Override
	public void update(int temperature) {
		System.out.println("Current temperature is : " + temperature);
		if (temperature > 100) {
			System.out.println("di di di di di di di di di di di");
			informer.stopHeating();
		}
	}

	@Override
	public void subscribeInformer(Informer informer) {
		this.informer = informer;
	}

}
