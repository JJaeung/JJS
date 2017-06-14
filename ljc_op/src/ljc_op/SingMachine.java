package ljc_op;

import java.util.LinkedList;
import java.util.Queue;

public class SingMachine {
	private int inCoin;
	private String inSongName[];//노래방 기계 내에 존재하는 노래 목록
	private Queue reservationSongQueue; //기계내에 예약한 노래들이 저장되는 큐

	
	public SingMachine()//생성자에서 노래방기계내에 0~99번의 노래를 만들어둔다
	{
		reservationSongQueue = new LinkedList();
		inSongName = new String[100];
		for(int i=0; i<100; i++)
		{
			inSongName[i] = String.valueOf(i)+"번노래";
		}
	}
	
	//코인입력()
	public void insertCoin(int n)
	{
		inCoin = n;
		System.out.println("노래방기계 > 코인을 " + n +"개 입력받았습니다.");
	}
	
	//boolean 노래유무확인()
	public boolean checkSong(String songName)
	{
		boolean check;//임의로 설정한 변수
		check = false;
		
		for(int i=0; i<100; i++)
		{		
			if(songName.equals(inSongName[i]))
			{
				System.out.println("노래방기계 > 네 "+songName+" 노래가 있네요.");
				check = true;
				return check;
			}
		}
		
		System.out.println("노래방기계 > 아니오 "+songName+" 노래는 없습니다.");
			
		return check;
	}
	
	//노래예약()
	public void reservationSong(String songName)
	{
		reservationSongQueue.offer(songName);//큐에 노래를 넣는다
		System.out.println("노래방기계 > "+songName+"노래를 예약합니다.");
	}
	
	//노래시작()
	public void startSong()
	{
		String nowSong = (String)reservationSongQueue.poll(); 
		System.out.println("노래방기계 > " + nowSong + "을 재생합니다.");
		System.out.println("노래방기계 > 재생한 노래가 끝났습니다.");

	}

}
