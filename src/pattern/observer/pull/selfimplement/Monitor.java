package pattern.observer.pull.selfimplement;

public interface Monitor {

	public void update(int temperature);

	public void subscribeInformer(Informer informer);
}
