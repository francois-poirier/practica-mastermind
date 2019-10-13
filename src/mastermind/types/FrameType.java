package mastermind.types;

public enum FrameType {
	START, 
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE, 
	WINNER, 
	LOOSER, 
	ATTEMPTS, 
	COLORS, 
	PROPOSECOMBINATION, 
	WIDTH,
	NEW_GAME,
	BLACKS,
	WHITES,
	CLOSE,
	GET_TITLE, 
	SET_TITLE,
	NEXT,
	START_NAME,
	TITLES,
	SAVE,
	SAVE_NAMED,
	HAS_NAME,
	EXISTS;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
