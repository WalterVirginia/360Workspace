package ThreadExamples;

import java.util.*;

public class letItBe1 extends Thread {

	public void run() {
		
		String line1;
		
		for(int l=1; l<=1; l++) {
			line1 = "When I find myself in times of sorrow, " +
					"Mother Mary comes to me.";
			System.out.println(line1);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}
