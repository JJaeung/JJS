package ljc_op;

public class SingMachine {
	private int inCoin;
	
	//�����Է�()
	public void insertCoin(int n)
	{
		inCoin = n;
		System.out.println("�뷡���� > ������ " + n +"�� �Է¹޾ҽ��ϴ�.");
	}
	
	//boolean �뷡����Ȯ��() - ���� ������ Ÿ��, �̿����� ���� �ʿ�
	public boolean checkSong(String songname)
	{
		boolean check;//���Ƿ� ������ ����
		check = true;
			
		if(check)
		{
			System.out.println("�뷡���� > �� "+songname+" �뷡�� �ֳ׿�.");
		}
		else
		{
			System.out.println("�뷡���� > �ƴϿ� "+songname+" �뷡�� �����ϴ�.");
		}
			
		return check;
	}
	
	//�뷡����() - ������Ÿ��
	public void reservationSong(String songname)
	{
		System.out.println("�뷡���� > "+songname+"�뷡�� �����մϴ�.");
	}

}
