package equipamentos.player;

public class Walkman implements MusicPlayer {
	public void play(){
		System.out.println("PLAY MUSIC WALKMAN");
	}
	public void pause(){
		System.out.println("PAUSE MUSIC WALKMAN");
	}
	public void selectSong(String song){
		System.out.println("PLAYING WALKMAN: " + song);
	}

}
