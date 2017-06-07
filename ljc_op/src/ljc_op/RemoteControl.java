package ljc_op;

public class RemoteControl {
	private SingMachine machine1;
	public RemoteControl(SingMachine m_SM)//생성자에서 바로 노래방 기계를 set 시킨다.
	{
		machine1 = m_SM;
	}
	
	//boolean 노래검색(노래이름) - 노래가 있는지 사용자에게 제목을 입력받아 기계에 시키는 함수
	public boolean searchSong(String songName){
		boolean check;
		System.out.println("리모콘 > 노래방기계 내에서 노래가 있는지 검색합니다.");
		
		if(check = machine1.checkSong(songName))//기계에서 노래유무확인
		{
			System.out.println("리모콘 > 노래방기계, "+songName+"를 예약하세요.");
			machine1.reservationSong(songName);
		}
		else
		{
			System.out.println("리모콘 > 없다고 하네요.");
		}
		
		return check;
	}
	
	//시작버튼누름()
	public void startButton()
	{
		//시작버튼을 누른다
		System.out.println("remocon1 > 노래방기계, 가장 처음 예약된 노래를 시작시켜주세요.");
		machine1.startSong();

	}
}
