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
		
		//�뷡�� ��� �Ǽ�()
		SingMachine machine1 = new SingMachine();
		System.out.println("���� > �뷡�� ��踦 �Ǽ��մϴ�.");
		
		//�մ� ����()
		Guest minsoo = new Guest();
		System.out.println("���� > �մ� minsoo�� �����մϴ�.");
		
		//�ν������� ��Ų��.
		System.out.println("");
		System.out.println("���� > minsoo��, room1�� �����ؼ� ���� ���ּ���.");
		minsoo.enterRoom(room1, machine1);
		
		
		System.out.println("");
		System.out.println("���� > ���γ뷡�� ���� ���μ����� �����մϴ�.");
		
	}

}
