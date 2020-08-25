package demo;

import java.util.Arrays;
import java.util.HashSet;


public class Test {
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==j) {
					continue;
				}
				System.out.println("x: "+i+"y: "+j);
			}
		}
	}
}
