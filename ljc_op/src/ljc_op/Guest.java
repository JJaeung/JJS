package ljc_op;

public class Guest {

	private int coin;
	private String songname;
	
	public Guest()
	{
		coin = 10;
		songname = "김범수-보고싶다";
	}
	
	//부스입장(노래방부스, 노래방기계)
	public void enterRoom(SingRoom SR, SingMachine SM)
	{
		System.out.println("손님 > room1에 입장합니다.");
		
		//코인을 입력한다.
		System.out.println("손님 > machine1, 코인을 입력할게요.");
		SM.insertCoin(coin);
		
		//리모콘을 받는다.
		System.out.println("손님 > room1, 리모콘을 주세요.");
		RemoteControl remocon1 = SR.provideRemoteControl();
		
		//노래가 있는지 확인한다.
		System.out.println("손님 > remocon1, "+ songname + "노래가 있나요?");
		if(remocon1.checkSong(songname))
		{
			//노래를 노래방기계에 예약한다.
			System.out.println("손님 > machine1은 "+ songname +"노래를 예약해주세요");
			SM.reservationSong(songname);
		}
		else
			System.out.println("손님 > 다른 노래를 찾아봐야겠군요.");
		
	}
	
}
