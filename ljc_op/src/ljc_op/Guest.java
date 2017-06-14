package ljc_op;

public class Guest {
	private String songName[];//차후에 부를 노래를 리스트형식이나 입력형식으로 갖고있는다.
	private SingRoom guestSingRoom;//디렉터가 방을 지정해주기 때문에 손님이 방을 알고있어야함
	private RemoteControl userRemocon;//리모콘을 건네받기 때문에
	private int gCoin;//예약 횟수를 정하기 위해
	
	public Guest()
	{
		gCoin = 0;

	}
	
	//부스입장(노래방부스)
	public void enterRoom(SingRoom m_SR)
	{
		System.out.println("손님 > room1에 입장합니다.");
		guestSingRoom = m_SR;
		
		//리모콘을 받는다.
		System.out.println("손님 > room1, 리모콘을 주세요.");
		userRemocon = guestSingRoom.getrControl();
	}
	
	//코인입력(지시받은 코인갯수)
	public void pushCoin(int coin)
	{
		gCoin = coin;
		//코인을 입력한다.
		System.out.println("손님 > room1의 기계, 코인을 입력할게요.");
		guestSingRoom.getsMachine().insertCoin(coin);
	}
	
	//노래검색 및 예약()
	public void serchSong()
	{
		//디렉터가 준 코인 갯수만큼 할당하고, 부를 노래 리스트를 만든다.
		songName = new String[gCoin];
		for(int i=0; i<gCoin; i++)
		{
			songName[i] = String.valueOf(i)+"번노래";
		}
		
		//노래가 있는지 확인한다.
		
		for(int i=0; i<gCoin; i++)
		{
			System.out.println("손님 > remocon1, "+ songName[i] + " 노래가 있으면 예약해주세요");
			if(!userRemocon.searchSong(songName[i]))
				System.out.println("손님 > 다른 노래를 찾아봐야겠군요.");
		}
	}
	
	//노래시작()
	public void startSinging()
	{
		//노래를 시작한다.
		for(int i=0; i<gCoin; i++)
		{
			System.out.println("손님 > remocon1, 시작버튼을 누를게요.");
			userRemocon.startButton();
		}

	}
	
}
