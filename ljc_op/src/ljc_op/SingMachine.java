package ljc_op;

public class SingMachine {
	private int inCoin;
	
	//�����Է�()
	public void insertCoin(int n)
	{
		inCoin = n;
		System.out.println("�뷡���� > ������ " + n +"�� �Է¹޾ҽ��ϴ�.");
	}
	
	//boolean �뷡����Ȯ��() - ������Ÿ��
	public boolean checkSong(String songName)
	{
		boolean check;//���Ƿ� ������ ����
		check = true;
			
		if(check)
		{
			System.out.println("�뷡���� > �� "+songName+" �뷡�� �ֳ׿�.");
		}
		else
		{
			System.out.println("�뷡���� > �ƴϿ� "+songName+" �뷡�� �����ϴ�.");
		}
			
		return check;
	}
	
	//�뷡����() - ������Ÿ��
	public void reservationSong(String songName)
	{
		System.out.println("�뷡���� > "+songName+"�뷡�� �����մϴ�.");
	}
	
	//�뷡����() - ������Ÿ��
	public void startSong()
	{
		System.out.println("�뷡���� > �뷡�� �����մϴ�.");
	}

}
