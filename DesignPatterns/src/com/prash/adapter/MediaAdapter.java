package com.prash.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advMedPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equals("vlc")) {
			
			advMedPlayer = new AdvancedVlcPlayer();
			
		}
		if(audioType.equals("mp4")) {
			
			advMedPlayer = new AdvancedMP4Player();
			
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equals("vlc")) {
			advMedPlayer.playVlc(fileName);
		}
		if(audioType.equals("mp4")) {
			advMedPlayer.playMp4(fileName);
		}
		System.out.println("");
	}

}
