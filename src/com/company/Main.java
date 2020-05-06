package com.company;
import java.math.BigInteger;
import org.junit.Test;
public class Main {
    @Test
    public static void main(String[] args) {

        BigInteger a = new BigInteger ("9000000000000000000");
        BigInteger b = new BigInteger ("8444444444444444444");

        System.out.println(arg(a,b));

    }

    @Test
    public static void main1(String[] args) {

        BigInteger a = new BigInteger ("9000000000000000000");
        BigInteger b = new BigInteger ("8444444444444444444");

        System.out.println(arg(a,b));

    }

    private static BigInteger arg(BigInteger a, BigInteger b){
//        a = new BigInteger ("9000000000000000000");
//        b = new BigInteger ("8444444444444444444");

        BigInteger sum = a.add(b);
        BigInteger sumarg = sum.divide(BigInteger.valueOf(2));

        return sumarg;


    }
}
