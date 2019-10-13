package mastermind.models;

public interface Session {
	
	public StateValue getValueState();
	public int getWidth();
	public String getName();
	public void setName(String name);
}
