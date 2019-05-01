import java.util.Random;

public class Randomizer{
	
	public static int HowMany(int min, int max){

			Random rand = new Random();

    	    int randomNum = rand.nextInt((max - min) + 1) + min;

    		return randomNum;
			
			//double randomDouble = Math.random();
			//randomDouble = randomDouble * 5 + 1;
			//int randomInt = (int)randomDouble;
			//return randomInt;

	}
}