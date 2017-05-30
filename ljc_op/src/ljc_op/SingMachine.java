package ljc_op;

public class SingMachine {
	//코인입력()
	public void insertCoin(int n)
	{
		System.out.println("노래방기계 > 코인을 " + n +"개 입력받았습니다.");
	}
	
	//boolean 노래유무확인()
	public boolean checkSong(String songname)
	{
		boolean check;
		check = true;
			
		if(check)
		{
			System.out.println("노래방기계 > 네 "+songname+" 노래가 있네요.");
		}
		else
		{
			System.out.println("노래방기계 > 아니오 "+songname+" 노래는 없습니다.");
		}
			
		return check;
	}
	
	//노래예약()
	public void reservationSong(String songname)
	{
		System.out.println("노래방기계 > "+songname+"노래를 예약합니다.");
	}

}
