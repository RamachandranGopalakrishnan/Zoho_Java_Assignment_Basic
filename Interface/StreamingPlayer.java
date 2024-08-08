package Interface;

public class StreamingPlayer implements  Playable{

	@Override
	public void play() {
		System.out.println("StreamingPlayer is Playing");
		
	}

	@Override
	public void pause() {
		System.out.println("StreamingPlayer is in pause");
		
	}

	@Override
	public void stop() {
		System.out.println("StreamingPlayer is stopped");
	}
}
