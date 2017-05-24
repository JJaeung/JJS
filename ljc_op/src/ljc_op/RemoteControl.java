package ljc_op;

public class RemoteControl {

	//boolean 노래유무확인()
	public boolean checkSong(String songname){
		boolean check;
		check = true;
		
		if(check)
			System.out.println("리모콘 > 네 노래가 있네요.");
		else
			System.out.println("리모콘 > 아니오 없습니다.");
		
		return check;
	}
}
