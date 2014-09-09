package pattern.chainofresposibility;

public class Manager extends Approver {

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.CHAIRMAN.getValue()) {
			System.out.println("Board of Director is handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
