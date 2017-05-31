package ljc_op;

public class Guest {
	private int coin;
	private String songname;
	private SingRoom GuestSingRoom;//손님과 부스가 1:1 대응으로 감독에게 지시받고 들어가는 것 이기떄문에 소유관계로 설정
	
	public Guest()
	{
		coin = 10;
		songname = "시끄러운";//부를 노래 ( 차후 리스트나 입력받는 형식으로 수정)
		GuestSingRoom = new SingRoom();
	}
	
	//부스입장(노래방부스)
	public void enterRoom(SingRoom SR)
	{
		System.out.println("손님 > room1에 입장합니다.");
		GuestSingRoom = SR;//손님의 내부 인스턴스에 set 시킨다.
		
		//리모콘을 받는다.
		System.out.println("손님 > room1, 리모콘을 주세요.");
		GuestSingRoom.RControl = GuestSingRoom.provideRemoteControl();
	}
	
	//코인입력(노래방부스) ~위치의 ~기계에 코인을 입력한다는 의미. 
	public void pushCoin()
	{
		//코인을 입력한다.
		System.out.println("손님 > room1의 기계, 코인을 입력할게요.");
		GuestSingRoom.SMachine.insertCoin(coin);
		
		//노래가 있는지 확인한다.
		System.out.println("손님 > remocon1, "+ songname + " 노래가 있으면 예약해주세요");
		if(!GuestSingRoom.RControl.searchSong(songname))
			System.out.println("손님 > 다른 노래를 찾아봐야겠군요.");
	}
}
