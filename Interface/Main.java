package Interface;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
            int[] arr= {52,4,6,8,2,1,4,7};
            Sort s=new Sorting();
           s.bubbleSort(arr);
           s.mergeSort(arr, 0, arr.length-1);
            s.quickSort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr));
            
            Playable a=new MP3Player();
            a.play();
            a.stop();
            a.pause();
            
            Playable b=new CDPlayer();
            b.play();
            b.stop();
            b.pause();
            
            Playable c=new StreamingPlayer();
            c.play();
            c.stop();
            c.pause();
	}

}
