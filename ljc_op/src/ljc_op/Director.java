package ljc_op;

public class Director {
	public static void main(String[] args) {
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
		System.out.println("���� > minsoo��, room1�� �����ؼ� ���� ���ּ���.");
		minsoo.enterRoom(room1);//ù ����ÿ��� room1�� �Ű������� �Ѱ��� set ��Ų��
		
		//�����Է� �� �뷡������ ��Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, room1�� �뷡���迡 ������ �ְ� �뷡�� �������ּ���.");
		minsoo.pushCoin();
		
		System.out.println("");
		System.out.println("���� > ���γ뷡�� ���� ���μ����� �����մϴ�.");
	}
}
