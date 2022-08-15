import java.lang.Math;
public class esPrime {
    public boolean checkPrime (int n){
        int j = 2;
        boolean flag = true;
        if (n <= 1) {
            flag = false;
        }
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
}
