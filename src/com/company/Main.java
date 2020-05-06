package com.company;

import java.math.BigInteger;

public class Main {


    // write your code here
    public static void main(String[] args) {
        BigInteger a = new BigInteger ("9000000000000000000");
        BigInteger b = new BigInteger ("8444444444444444444");
       // BigInteger[] array = {9000000000000000000,8444444444444444444};


        BigInteger sumarg;


        BigInteger sum = a.add(b);
        sumarg = sum.divide(BigInteger.valueOf(2));



        System.out.println(sumarg);

    }

}
