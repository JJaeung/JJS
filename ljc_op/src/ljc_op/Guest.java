package ljc_op;

public class Guest {
	private int coin;
	private String songname;
	private SingRoom GuestSingRoom;//�մ԰� �ν��� 1:1 �������� �������� ���ùް� ���� �� �̱⋚���� ��������� ����
	
	public Guest()
	{
		coin = 10;
		songname = "�ò�����";//�θ� �뷡 ( ���� ����Ʈ�� �Է¹޴� �������� ����)
		GuestSingRoom = new SingRoom();
	}
	
	//�ν�����(�뷡��ν�)
	public void enterRoom(SingRoom SR)
	{
		System.out.println("�մ� > room1�� �����մϴ�.");
		GuestSingRoom = SR;//�մ��� ���� �ν��Ͻ��� set ��Ų��.
		
		//�������� �޴´�.
		System.out.println("�մ� > room1, �������� �ּ���.");
		GuestSingRoom.RControl = GuestSingRoom.provideRemoteControl();
	}
	
	//�����Է�(�뷡��ν�) ~��ġ�� ~��迡 ������ �Է��Ѵٴ� �ǹ�. 
	public void pushCoin()
	{
		//������ �Է��Ѵ�.
		System.out.println("�մ� > room1�� ���, ������ �Է��ҰԿ�.");
		GuestSingRoom.SMachine.insertCoin(coin);
		
		//�뷡�� �ִ��� Ȯ���Ѵ�.
		System.out.println("�մ� > remocon1, "+ songname + " �뷡�� ������ �������ּ���");
		if(!GuestSingRoom.RControl.searchSong(songname))
			System.out.println("�մ� > �ٸ� �뷡�� ã�ƺ��߰ڱ���.");
	}
}
