package Lotto;

import java.util.Random;

public class Lotto {
	private int[] number = new int[3];
	
	Random random = new Random();

	public Lotto() 
	{
		for (int i = 0; i<3; i++)
		{
			number[i] = random.nextInt(9) + 1;
		}
	}
	
	public int result() 
	{
		System.out.println("Lotto numbers are:" + number[0] + " + " + number[1] +" + "+ number[2]+" = "+(number[0] + number[1] + number[2]));
		//System.out.print("The result was:");
		return (number[0] + number[1] + number[2]);
	}
}
