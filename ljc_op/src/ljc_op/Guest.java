package ljc_op;

public class Guest {

	private int coin;
	private String songname;
	
	public Guest()
	{
		coin = 10;
		songname = "�����-����ʹ�";
	}
	
	//�ν�����(�뷡��ν�, �뷡����)
	public void enterRoom(SingRoom SR, SingMachine SM)
	{
		System.out.println("�մ� > room1�� �����մϴ�.");
		
		//������ �Է��Ѵ�.
		System.out.println("�մ� > machine1, ������ �Է��ҰԿ�.");
		SM.insertCoin(coin);
		
		//�������� �޴´�.
		System.out.println("�մ� > room1, �������� �ּ���.");
		RemoteControl remocon1 = SR.provideRemoteControl();
		
		//�뷡�� �ִ��� Ȯ���Ѵ�.
		System.out.println("�մ� > remocon1, "+ songname + "�뷡�� �ֳ���?");
		if(remocon1.checkSong(songname))
		{
			//�뷡�� �뷡���迡 �����Ѵ�.
			System.out.println("�մ� > machine1�� "+ songname +"�뷡�� �������ּ���");
			SM.reservationSong(songname);
		}
		else
			System.out.println("�մ� > �ٸ� �뷡�� ã�ƺ��߰ڱ���.");
		
	}
	
}
