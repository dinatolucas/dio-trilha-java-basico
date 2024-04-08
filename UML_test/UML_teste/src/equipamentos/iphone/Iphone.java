package equipamentos.iphone;

import equipamentos.browser.WebBrowser;
import equipamentos.player.MusicPlayer;
import equipamentos.telefone.Telephone;

public class Iphone implements WebBrowser, MusicPlayer, Telephone {
	
	public void displayPage(String URL) {
		System.out.println("HOME Iphone: " + URL);
	}
	public void addNewTab(String URL) {
		System.out.println("NEW TAB Iphone: " + URL);
	}
	public void refreshPage() {
		System.out.println("REFRESHING Iphone");
	}
	public void play(){
		System.out.println("PLAY MUSIC Iphone");
	}
	public void pause(){
		System.out.println("PAUSE MUSIC Iphone");
	}
	public void selectSong(String song){
		System.out.println("PLAYING Iphone: " + song);
	}
	public void call(String phoneNumber){
		System.out.println("CALLING Iphone: " + phoneNumber);
	}
	public void answer(){
		System.out.println("ANSWERING Iphone");
	}
	public void startVoicemail(){
		System.out.println("CALLING VOICE MAIL Iphone");
	}

}
