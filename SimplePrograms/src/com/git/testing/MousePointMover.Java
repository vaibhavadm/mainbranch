package com.git.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class MousePointMover {
	public static void main(String[] args) throws AWTException {
		  Robot hal = new Robot();
	        Random random = new Random();
	        while(true){
	            hal.delay(1000 * 10); //10 is the secongs value here
	            int x = random.nextInt() % 640;
	            int y = random.nextInt() % 480;
	            hal.mouseMove(x,y);
	        }
	    }
}
