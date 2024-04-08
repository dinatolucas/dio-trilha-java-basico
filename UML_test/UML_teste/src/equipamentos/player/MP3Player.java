package equipamentos.player;

public class MP3Player implements MusicPlayer{
		
		public void play(){
			System.out.println("PLAY MUSIC MP3");
		}
		public void pause(){
			System.out.println("PAUSE MUSIC MP3");
		}
		public void selectSong(String song){
			System.out.println("PLAYING MP3: " + song);
		}
}
