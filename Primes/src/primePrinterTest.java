import org.junit.jupiter.api.Test;

class primePrinterTest {
	
	@Test
	void test() {
		System.out.println("This test will have to be semi manual. In two lines it will display the output the program should match.\n");
		System.out.print("---We Will Now Print 26 Primes---\n" 
				+ "2\n"
				+ "3\n"
				+ "5\n"
				+ "7\n"
				+ "11\n"
				+ "13\n"
				+ "17\n"
				+ "19\n"
				+ "23\n"
				+ "29\n"
				+ "31\n"
				+ "37\n"
				+ "41\n"
				+ "43\n"
				+ "47\n"
				+ "53\n"
				+ "59\n"
				+ "61\n"
				+ "67\n"
				+ "71\n"
				+ "73\n"
				+ "79\n"
				+ "83\n"
				+ "89\n"
				+ "97\n"
				+ "101\n"
				+ "----We Have Printed 26 Primes----\n");
		System.out.println("\nThe programs actual output is\n");
		primePrinter.printing(26);
		System.out.print("\nDoes it match?");
	}

}
