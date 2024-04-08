package main;

import java.util.Scanner;

import equipamentos.browser.InternetExplorer;
import equipamentos.browser.WebBrowser;
import equipamentos.iphone.Iphone;
import equipamentos.player.MP3Player;
import equipamentos.player.MusicPlayer;
import equipamentos.player.Walkman;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Iphone iphone = new Iphone();
        iphone.play();
        iphone.pause();
        iphone.selectSong("Charlie Brown Jr.");
        iphone.addNewTab("facebook.com");
        iphone.displayPage("google.com");
        iphone.call("(41)98400-6916");
        iphone.answer();
        iphone.startVoicemail();
        
        sc.close();
    }
}