package ljc_op;

public class Guest {
	private String songName[];//���Ŀ� �θ� �뷡�� ����Ʈ�����̳� �Է��������� �����ִ´�.
	private SingRoom guestSingRoom;//���Ͱ� ���� �������ֱ� ������ �մ��� ���� �˰��־����
	private RemoteControl userRemocon;//�������� �ǳ׹ޱ� ������
	private int gCoin;//���� Ƚ���� ���ϱ� ����
	
	public Guest()
	{
		gCoin = 0;

	}
	
	//�ν�����(�뷡��ν�)
	public void enterRoom(SingRoom m_SR)
	{
		System.out.println("�մ� > room1�� �����մϴ�.");
		guestSingRoom = m_SR;
		
		//�������� �޴´�.
		System.out.println("�մ� > room1, �������� �ּ���.");
		userRemocon = guestSingRoom.getrControl();
	}
	
	//�����Է�(���ù��� ���ΰ���)
	public void pushCoin(int coin)
	{
		gCoin = coin;
		//������ �Է��Ѵ�.
		System.out.println("�մ� > room1�� ���, ������ �Է��ҰԿ�.");
		guestSingRoom.getsMachine().insertCoin(coin);
	}
	
	//�뷡�˻� �� ����()
	public void serchSong()
	{
		//���Ͱ� �� ���� ������ŭ �Ҵ��ϰ�, �θ� �뷡 ����Ʈ�� �����.
		songName = new String[gCoin];
		for(int i=0; i<gCoin; i++)
		{
			songName[i] = String.valueOf(i)+"���뷡";
		}
		
		//�뷡�� �ִ��� Ȯ���Ѵ�.
		
		for(int i=0; i<gCoin; i++)
		{
			System.out.println("�մ� > remocon1, "+ songName[i] + " �뷡�� ������ �������ּ���");
			if(!userRemocon.searchSong(songName[i]))
				System.out.println("�մ� > �ٸ� �뷡�� ã�ƺ��߰ڱ���.");
		}
	}
	
	//�뷡����()
	public void startSinging()
	{
		//�뷡�� �����Ѵ�.
		for(int i=0; i<gCoin; i++)
		{
			System.out.println("�մ� > remocon1, ���۹�ư�� �����Կ�.");
			userRemocon.startButton();
		}

	}
	
}
