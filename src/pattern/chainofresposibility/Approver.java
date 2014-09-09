package pattern.chainofresposibility;

public abstract class Approver {

	private Approver successor;

	private String ApproverPosition;

	public abstract void approve(Request request);

	public Approver getSuccessor() {
		return successor;
	}

	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	@SuppressWarnings("unused")
	private void handleRequest(Request request) {
		this.successor.approve(request);
	}

	public String getApproverPosition() {
		return ApproverPosition;
	}

	public void setApproverPosition(String approverPosition) {
		ApproverPosition = approverPosition;
	}

}
