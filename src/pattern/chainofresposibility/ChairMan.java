package pattern.chainofresposibility;

public class ChairMan extends Approver {

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.MANAGER.getValue()) {
			System.out.println("Manager is handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
