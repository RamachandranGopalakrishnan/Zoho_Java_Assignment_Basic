package Interface;

public class MP3Player implements Playable{

	@Override
	public void play() {
		System.out.println("MP3 is Playing");
		
	}

	@Override
	public void pause() {
		System.out.println("MP3 is in pause");
		
	}

	@Override
	public void stop() {
		System.out.println("MP3 is stopped");
	}
     
}
