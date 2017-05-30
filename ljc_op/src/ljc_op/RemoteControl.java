package ljc_op;

public class RemoteControl {
	private SingMachine machine1;
	public RemoteControl(SingMachine SM)//생성자에서 바로 노래방 기계를 set 시킨다.
	{
		machine1 = new SingMachine();
		machine1 = SM;
	}
	
	//boolean 노래검색(노래이름)
	public boolean searchSong(String songname){
		boolean check;
		System.out.println("리모콘 > 노래방기계 내에서 노래가 있는지 검색합니다.");
		
		if(check = machine1.checkSong(songname))//기계에서 노래유무확인
		{
			System.out.println("리모콘 > 노래방기계, "+songname+"를 예약하세요.");
			machine1.reservationSong(songname);
		}
		else
		{
			System.out.println("리모콘 > 없다고 하네요.");
		}
		
		return check;
	}
}
