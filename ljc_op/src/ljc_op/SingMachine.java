package ljc_op;

import java.util.LinkedList;
import java.util.Queue;

public class SingMachine {
	private int inCoin;
	private String inSongName[];//�뷡�� ��� ���� �����ϴ� �뷡 ���
	private Queue reservationSongQueue; //��賻�� ������ �뷡���� ����Ǵ� ť

	
	public SingMachine()//�����ڿ��� �뷡���賻�� 0~99���� �뷡�� �����д�
	{
		reservationSongQueue = new LinkedList();
		inSongName = new String[100];
		for(int i=0; i<100; i++)
		{
			inSongName[i] = String.valueOf(i)+"���뷡";
		}
	}
	
	//�����Է�()
	public void insertCoin(int n)
	{
		inCoin = n;
		System.out.println("�뷡���� > ������ " + n +"�� �Է¹޾ҽ��ϴ�.");
	}
	
	//boolean �뷡����Ȯ��()
	public boolean checkSong(String songName)
	{
		boolean check;//���Ƿ� ������ ����
		check = false;
		
		for(int i=0; i<100; i++)
		{		
			if(songName.equals(inSongName[i]))
			{
				System.out.println("�뷡���� > �� "+songName+" �뷡�� �ֳ׿�.");
				check = true;
				return check;
			}
		}
		
		System.out.println("�뷡���� > �ƴϿ� "+songName+" �뷡�� �����ϴ�.");
			
		return check;
	}
	
	//�뷡����()
	public void reservationSong(String songName)
	{
		reservationSongQueue.offer(songName);//ť�� �뷡�� �ִ´�
		System.out.println("�뷡���� > "+songName+"�뷡�� �����մϴ�.");
	}
	
	//�뷡����()
	public void startSong()
	{
		String nowSong = (String)reservationSongQueue.poll(); 
		System.out.println("�뷡���� > " + nowSong + "�� ����մϴ�.");
		System.out.println("�뷡���� > ����� �뷡�� �������ϴ�.");

	}

}
