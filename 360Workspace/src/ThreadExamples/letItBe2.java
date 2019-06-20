package ThreadExamples;

import java.util.*;

public class letItBe2 extends Thread {

	public void run() {
		
		String line2;
		
		for(int l=1; l<=1; l++) {
			line2 = "Speaking words of wisdom: " +
					"Let It Be. ";
			System.out.println(line2);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

