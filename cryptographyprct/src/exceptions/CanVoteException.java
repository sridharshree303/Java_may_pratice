package exceptions;

public class CanVoteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CanVoteException() {
		super("Age is problem");
	}
	
	public CanVoteException(String message) {
		super(message);
	}
}
