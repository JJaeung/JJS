package ljc_op;

public class Guest {
	private String songName;//���Ŀ� �θ� �뷡�� ����Ʈ�����̳� �Է��������� �����ִ´�.
	private SingRoom guestSingRoom;//���Ͱ� ���� �������ֱ� ������ �մ��� ���� �˰��־����
	private RemoteControl userRemocon;//�������� �ǳ׹ޱ� ������
	
	public Guest()
	{
		songName = "�ߡߡߡ�";//�����ڿ� �θ� �뷡�� �̸� �Է�
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
		//������ �Է��Ѵ�.
		System.out.println("�մ� > room1�� ���, ������ �Է��ҰԿ�.");
		guestSingRoom.getsMachine().insertCoin(coin);//��迡 ���ؼ��� �մ��� �˾ƾ��ϴ��� ���� �� ��
	}
	
	//�뷡�˻� �� ����()
	public void serchSong()
	{
		//�뷡�� �ִ��� Ȯ���Ѵ�.
		System.out.println("�մ� > remocon1, "+ songName + " �뷡�� ������ �������ּ���");
		if(!userRemocon.searchSong(songName))
			System.out.println("�մ� > �ٸ� �뷡�� ã�ƺ��߰ڱ���.");
	}
	
	//�뷡����()
	public void startSinging()
	{
		//�뷡�� �����Ѵ�.
		System.out.println("�մ� > remocon1, ���۹�ư�� �����Կ�.");
		userRemocon.startButton();

	}
	
}
