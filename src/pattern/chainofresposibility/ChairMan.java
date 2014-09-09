package pattern.chainofresposibility;

public class ChairMan extends Approver {

	public ChairMan() {
		setApproverPosition("ChairMan");
	}

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.CHAIRMAN.getValue()) {
			System.out.println(request.getPurpose() + " Need " + request.getAmount() + " , " + getApproverPosition() + " is Handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
