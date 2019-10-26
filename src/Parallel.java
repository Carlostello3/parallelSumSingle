import java.util.Random;

/**
 *
 * @author carlostello
 * Single Thread sum
 *
 */


public class Parallel {

	public static void main(String[] args) {
		
		int arrSize = 200000000;
		int [] arrNumber = new int [arrSize];
		int min = 1, max = 10;
		
		Random random = new Random();
		
		
		int counter = 0;
		long startTime = System.nanoTime();
		
		
		System.out.println("Single thread: (Array size of: " + arrSize + ")");
		while (counter < arrSize) {
			int randomNum = random.nextInt((max - min) + 1) + min;
			arrNumber[counter] = randomNum;
			counter++;
		}
		
		int sum = 0;
		for (int i = 0; i < arrNumber.length; i++) {
			sum += arrNumber[i];
		}
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.println("Total time: " + (endTime - startTime) + " milliseconds.");
	}

}
