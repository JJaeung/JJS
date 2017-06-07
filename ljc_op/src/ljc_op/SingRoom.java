package ljc_op;

public class SingRoom {
	private SingMachine sMachine;
	private RemoteControl rControl;
	
	public SingRoom()
	{
		//노래방기계 및 리모콘 세팅
		sMachine = new SingMachine();
		rControl = new RemoteControl(sMachine);
	}
	
	//getter setter 추가
	public SingMachine getsMachine() {
		return sMachine;
	}

	public void setsMachine(SingMachine sMachine) {
		this.sMachine = sMachine;
	}

	public RemoteControl getrControl() {
		System.out.println("노래방부스 > 리모콘을 제공합니다");
		
		return rControl;
	}

	public void setrControl(RemoteControl rControl) {
		this.rControl = rControl;
	}
	
	
}
