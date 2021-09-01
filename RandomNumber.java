package Methods;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		//Random Number
		Random ran = new Random();
		int random = ran.nextInt(100);
		
		System.out.println(random);
		
		double dran = ran.nextDouble()+1;
		System.out.println(dran);
		
		//Math ramdom
		double mathRan = Math.random()*100;
		int som = (int) Math.round(mathRan);
		
		System.out.println(som);
	}
}
