package ljc_op;

public class SingMachine {
	private int inCoin;
	
	//코인입력()
	public void insertCoin(int n)
	{
		inCoin = n;
		System.out.println("노래방기계 > 코인을 " + n +"개 입력받았습니다.");
	}
	
	//boolean 노래유무확인() - 프로토타입
	public boolean checkSong(String songName)
	{
		boolean check;//임의로 설정한 변수
		check = true;
			
		if(check)
		{
			System.out.println("노래방기계 > 네 "+songName+" 노래가 있네요.");
		}
		else
		{
			System.out.println("노래방기계 > 아니오 "+songName+" 노래는 없습니다.");
		}
			
		return check;
	}
	
	//노래예약() - 프로토타입
	public void reservationSong(String songName)
	{
		System.out.println("노래방기계 > "+songName+"노래를 예약합니다.");
	}
	
	//노래시작() - 프로토타입
	public void startSong()
	{
		System.out.println("노래방기계 > 노래를 시작합니다.");
	}

}
