package states;

public class StateManager {
	public static enum State {
		EVENTDISPLAY,
		CREATEEVENT,
		CREATECATEGORY
	}
	private static State CURRENT_STATE = State.EVENTDISPLAY;
	
	public static void SetState(State newState) {
		CURRENT_STATE = newState;
	}
	
	public static State GetState() {
		return CURRENT_STATE;
	}
}
