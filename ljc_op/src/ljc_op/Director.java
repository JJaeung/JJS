package ljc_op;

public class Director {

	public static void main(String[] args) {
		
		Director kimPD = new Director();

		//시나리오 시작()
		kimPD.startScene();
		
	}
	
	public void startScene()
	{
		System.out.println("감독 > 시나리오를 시작합니다.");
		
		//노래방 부스 건설()
		SingRoom room1 = new SingRoom();
		System.out.println("감독 > 노래방 부스를 건설합니다.");
		
		//노래방 기계 건설()
		SingMachine machine1 = new SingMachine();
		System.out.println("감독 > 노래방 기계를 건설합니다.");
		
		//손님 세팅()
		Guest minsoo = new Guest();
		System.out.println("감독 > 손님 minsoo씨 등장합니다.");
		
		//부스입장을 시킨다.
		System.out.println("");
		System.out.println("감독 > minsoo씨, room1에 입장해서 예약 해주세요.");
		minsoo.enterRoom(room1, machine1);
		
		
		System.out.println("");
		System.out.println("감독 > 코인노래방 예약 프로세스를 종료합니다.");
		
	}

}
