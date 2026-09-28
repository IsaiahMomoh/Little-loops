public class PrimeNumberChecker{

	public int countNumberOfFactorsOf(int number){
		int count = 0;

		for (int checker = 1; checker <= number; checker++){
			if(number % checker == 0) count++;
		}
		return count;			
	}

	public static boolean isPrimeNumber(int numberToCheck){
		PrimeNumberChecker checkerTool = new PrimeNumberChecker();
		int numberOfFactors = checkerTool.countNumberOfFactorsOf(numberToCheck);
		if (numberOfFactors == 2) return true;
		else return false;
	}
	


}