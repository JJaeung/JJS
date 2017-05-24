package ljc_op;

public class SingRoom {

	private RemoteControl RC;
	
	public SingRoom()
	{
		RC = new RemoteControl();
	}
	
	//set노래방기계()
	//리모콘제공(리모콘)
	public RemoteControl provideRemoteControl()
	{
		System.out.println("노래방부스 > 리모콘을 제공합니다");
		
		
		return RC;
		
	}
	
}
