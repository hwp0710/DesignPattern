package pattern.chainofresposibility;

public class Manager extends Approver {

	public Manager() {
		setApproverPosition("Manager");
	}

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.MANAGER.getValue()) {
			System.out.println(request.getPurpose() + " Need " + request.getAmount() + " , " + getApproverPosition() + " is Handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
