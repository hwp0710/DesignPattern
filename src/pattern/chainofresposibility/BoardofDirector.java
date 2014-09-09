package pattern.chainofresposibility;

public class BoardofDirector extends Approver {

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.CHAIRMAN.getValue()) {
			System.out.println("ChairMan is handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
