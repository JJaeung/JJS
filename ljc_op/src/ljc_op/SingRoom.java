package ljc_op;

public class SingRoom {
	public SingMachine SMachine;
	public RemoteControl RControl;
	
	public SingRoom()
	{
		//�뷡���� �� ������ ����
		SMachine = new SingMachine();
		RControl = new RemoteControl(SMachine);
	}
	
	//����������()
	public RemoteControl provideRemoteControl()
	{	
		System.out.println("�뷡��ν� > �������� �����մϴ�");
		
		return RControl;
	}
}
