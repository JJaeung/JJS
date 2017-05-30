package ljc_op;

public class SingRoom {
	public SingMachine SMachine;
	public RemoteControl RControl;
	
	public SingRoom()
	{
		//노래방기계 및 리모콘 세팅
		SMachine = new SingMachine();
		RControl = new RemoteControl(SMachine);
	}
	
	//리모콘제공()
	public RemoteControl provideRemoteControl()
	{	
		System.out.println("노래방부스 > 리모콘을 제공합니다");
		
		return RControl;
	}
}
