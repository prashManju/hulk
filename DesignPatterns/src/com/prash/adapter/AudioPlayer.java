package com.prash.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter mediaAdpater;

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equals("mp3")) {
			System.out.println("Playing mp3");
			
		}else if(audioType.equals("mp4") || audioType.equals("vlc")) {
			mediaAdpater = new MediaAdapter(audioType);
			mediaAdpater.play(audioType, fileName);
		}
		
	}

}
