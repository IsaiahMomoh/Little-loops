public class PrimeNumberCheckDriver{

	public static void main(String [] args){

		PrimeNumberChecker checkerTool = new PrimeNumberChecker();

		System.out.println(checkerTool.countNumberOfFactorsOf(1561));

		System.out.println(PrimeNumberChecker.isPrimeNumber(1561));

	}
}
