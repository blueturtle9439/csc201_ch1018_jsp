package ch1018core;

import java.math.BigInteger;

/**
 * Created by mainpcHan on 2017-02-12.
 */
public class bigprimes {


    public static String bigprimes(int count) {

        BigInteger temp = BigInteger.valueOf(Long.MAX_VALUE);
        String ans = "";
        int i = 0;
        while (i < count) {
            temp = temp.nextProbablePrime();
            ans += temp.toString() + ", ";
            i++;

        }

        return ans;


    }
}
