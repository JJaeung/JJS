package ljc_op;

public class SingRoom {
	private SingMachine sMachine;
	private RemoteControl rControl;
	
	public SingRoom()
	{
		//�뷡���� �� ������ ����
		sMachine = new SingMachine();
		rControl = new RemoteControl(sMachine);
	}
	
	//getter setter �߰�
	public SingMachine getsMachine() {
		return sMachine;
	}

	public void setsMachine(SingMachine sMachine) {
		this.sMachine = sMachine;
	}

	public RemoteControl getrControl() {
		System.out.println("�뷡��ν� > �������� �����մϴ�");
		
		return rControl;
	}

	public void setrControl(RemoteControl rControl) {
		this.rControl = rControl;
	}
	
	
}
