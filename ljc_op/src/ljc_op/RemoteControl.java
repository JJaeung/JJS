package ljc_op;

public class RemoteControl {
	private SingMachine machine1;
	public RemoteControl(SingMachine SM)//�����ڿ��� �ٷ� �뷡�� ��踦 set ��Ų��.
	{
		machine1 = new SingMachine();
		machine1 = SM;
	}
	
	//boolean �뷡�˻�(�뷡�̸�)
	public boolean searchSong(String songname){
		boolean check;
		System.out.println("������ > �뷡���� ������ �뷡�� �ִ��� �˻��մϴ�.");
		
		if(check = machine1.checkSong(songname))//��迡�� �뷡����Ȯ��
		{
			System.out.println("������ > �뷡����, "+songname+"�� �����ϼ���.");
			machine1.reservationSong(songname);
		}
		else
		{
			System.out.println("������ > ���ٰ� �ϳ׿�.");
		}
		
		return check;
	}
}
