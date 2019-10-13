package mastermind.distributed;

import mastermind.models.Session;
import mastermind.models.StateValue;
import mastermind.types.FrameType;
import mastermind.utils.TCPIP;

public class SessionProxy implements Session {
	
	private TCPIP tcpip;

	public SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}
	
	@Override
	public StateValue getValueState() {
		this.tcpip.send(FrameType.STATE.name());
		return StateValue.values()[this.tcpip.receiveInt()];
	}

	@Override
	public int getWidth() {
		this.tcpip.send(FrameType.WIDTH.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public String getName() {
		this.tcpip.send(FrameType.GET_TITLE.name());
		return this.tcpip.receiveLine();
	}

	@Override
	public void setName(String name) {
		this.tcpip.send(FrameType.SET_TITLE.name());
		this.tcpip.send(name);
	}

}
