package ljc_op;

public class SingMachine {
	//�����Է�()
	public void insertCoin(int n)
	{
		System.out.println("�뷡���� > ������ " + n +"�� �Է¹޾ҽ��ϴ�.");
	}
	
	//boolean �뷡����Ȯ��()
	public boolean checkSong(String songname)
	{
		boolean check;
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
	
	//�뷡����()
	public void reservationSong(String songname)
	{
		System.out.println("�뷡���� > "+songname+"�뷡�� �����մϴ�.");
	}

}
