package ljc_op;

public class Director {
	private int guestCoin;//�մԿ��� �Է½�ų ������ ����
	public Director()
	{
		guestCoin = 10;
	}
	
	public static void main(String[] args)
	{
		Director kimPD = new Director();

		//�ó����� ����()
		kimPD.startScene();
	}
	
	public void startScene()
	{
		System.out.println("���� > �ó������� �����մϴ�.");
		
		//�뷡�� �ν� �Ǽ�()
		SingRoom room1 = new SingRoom();
		System.out.println("���� > �뷡�� �ν��� �Ǽ��մϴ�.");

		//�մ� ����()
		Guest minsoo = new Guest();
		System.out.println("���� > �մ� minsoo�� �����մϴ�.");
		
		//�ν������� ��Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, room1�� �������ּ���.");
		minsoo.enterRoom(room1);//ù ����ÿ��� room1�� �Ű������� �Ѱ��� set ��Ų��
		
		//�����Է��� ��Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, room1�� �뷡���迡 "+ guestCoin +"���� ������ �־��ּ���.");
		minsoo.pushCoin(guestCoin);
		
		//�뷡�˻� �� ������ ��Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, �θ� �뷡�� �˻��ؼ� �������ּ���.");
		minsoo.serchSong();
		
		//�뷡�� ���۽�Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, ������ �뷡�� �ҷ��ּ���.");
		minsoo.startSinging();
		
		System.out.println("");
		System.out.println("���� > ���γ뷡�� ���� ���μ����� �����մϴ�.");
	}
}
