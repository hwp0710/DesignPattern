package pattern.observer.push.selfimplement;

public interface Informer {

	public void registerMonitor(Monitor monitor);

	public void removeMonitor(Monitor monitor);

	public void notifyMonitor();

	public void stopHeating();

}
