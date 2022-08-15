
public class primePrinter {
	public static void printing(int n) {
        System.out.println("---We Will Now Print " + n + " Primes---");
        int primeLeft = n;
        int i = 2;
        System.out.println(i);
        primeLeft--;
        i = 3;
        esPrime esPrimeObject = new esPrime();
        while(primeLeft > 0){
            if (esPrimeObject.checkPrime(i)) {
                System.out.println(i);
                primeLeft--;
            }
            i += 2;
        }
        System.out.println("----We Have Printed " + n + " Primes----");
	}
}
