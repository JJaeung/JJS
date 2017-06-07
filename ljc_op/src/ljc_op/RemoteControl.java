package ljc_op;

public class RemoteControl {
	private SingMachine machine1;
	public RemoteControl(SingMachine m_SM)//�����ڿ��� �ٷ� �뷡�� ��踦 set ��Ų��.
	{
		machine1 = m_SM;
	}
	
	//boolean �뷡�˻�(�뷡�̸�) - �뷡�� �ִ��� ����ڿ��� ������ �Է¹޾� ��迡 ��Ű�� �Լ�
	public boolean searchSong(String songName){
		boolean check;
		System.out.println("������ > �뷡���� ������ �뷡�� �ִ��� �˻��մϴ�.");
		
		if(check = machine1.checkSong(songName))//��迡�� �뷡����Ȯ��
		{
			System.out.println("������ > �뷡����, "+songName+"�� �����ϼ���.");
			machine1.reservationSong(songName);
		}
		else
		{
			System.out.println("������ > ���ٰ� �ϳ׿�.");
		}
		
		return check;
	}
	
	//���۹�ư����()
	public void startButton()
	{
		//���۹�ư�� ������
		System.out.println("remocon1 > �뷡����, ���� ó�� ����� �뷡�� ���۽����ּ���.");
		machine1.startSong();

	}
}
