package fuchimi;

public class Scissors extends Hand {
	public String toString() {
		return "Scissors";
	}

	@Override
	public Boolean beats(Hand hand) {
		return hand.looseAgainst(this);

	}

	@Override
	protected Boolean looseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}

	@Override
	protected Boolean looseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return Boolean.FALSE;
	}

	@Override
	protected Boolean looseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return null;
	}

}
