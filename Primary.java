import java.lang.Math;
public class Primary {
    public static boolean esPrime (int n){
        int j = 2;
        boolean flag = true;
        if(j == n) flag = false;
        else{
            while(j <= Math.sqrt(n)){
                if(n % j == 0){
                    return false;
                }
                j++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int primeToDo = 100;
        System.out.println("---We Will Now Print " + primeToDo + " Primes---");
        int primeLeft = primeToDo;
        int i = 2;
        System.out.println(i);
        primeLeft--;
        i = 3;
        while(primeLeft > 0){
            if (esPrime(i)) {
                System.out.println(i);
                primeLeft--;
            }
            i += 2;
        }
        System.out.println("----We Have Printed " + primeToDo + " Primes----");
    }
}