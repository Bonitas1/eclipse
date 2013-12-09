package fuchimi;

public class Paper extends Hand{
	public String toString() {
		return "Paper";
		}
 
	@Override
	public Boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	
	}

	@Override
	protected Boolean looseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return Boolean.FALSE;
	}

	@Override
	protected Boolean looseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean looseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}

}
