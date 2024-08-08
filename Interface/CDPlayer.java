package Interface;

public class CDPlayer implements Playable{
   
	@Override
	public void play() {
		System.out.println("CDPlayer is Playing");
		
	}

	@Override
	public void pause() {
		System.out.println("CDPlayer is in pause");
		
	}

	@Override
	public void stop() {
		System.out.println("CDPlayer is stopped");
	}
}
