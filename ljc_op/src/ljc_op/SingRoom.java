package ljc_op;

public class SingRoom {

	private RemoteControl RC;
	
	public SingRoom()
	{
		RC = new RemoteControl();
	}
	
	//set�뷡����()
	//����������(������)
	public RemoteControl provideRemoteControl()
	{
		System.out.println("�뷡��ν� > �������� �����մϴ�");
		
		
		return RC;
		
	}
	
}
