import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimaryTest {

	@Test
	void test() {
		esPrime primeTesting = new esPrime();
		if(primeTesting.checkPrime(-12) == true) {
			fail("esPrime does not consider negatives");
		}else if(primeTesting.checkPrime(1) == true) {
			fail("esPrime considers 1 a prime");
		}else if(primeTesting.checkPrime(2) == true) {
			fail("esPrime does not consider 2 a prime");
		}else if(primeTesting.checkPrime(111) == true) {
			fail("esPrime returns false positives");
		}else if(primeTesting.checkPrime(7919) == false){
			fail("esPrime returns false negatives");
		}
	}

}
