package com.company;

import org.junit.Test;
import java.util.Scanner;
import java.io.*;

import java.math.BigInteger;

public  class test {

    @Test
    public   static void  main(String[] argc) throws FileNotFoundException {
        Scanner scnr = new Scanner(System.in);//введем наши числа
        BigInteger a = new BigInteger (String.valueOf(scnr.nextBigInteger()));
        BigInteger b = new BigInteger (String.valueOf(scnr.nextBigInteger()));
         test2 (a,b);

       File file = new File ("test.txt");
        Scanner scnr1 = new Scanner(file);//прочитам их из файла
        while (scnr1.hasNext()) {
            BigInteger a1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
            BigInteger b1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));

          //  BigInteger b1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
            test3 (a1,b1);
        }

    }

    public  static void test2(BigInteger a, BigInteger b){
           System.out.println(arg(a,b));
    }

    public static void test3(BigInteger a1, BigInteger b1){
        System.out.println(arg(a1,b1));
    }

    @Test
    public void testa() {


        BigInteger a = new BigInteger("9000000000000000000");
        BigInteger b = new BigInteger("8444444444444444444");
        System.out.println(arg(a,b));

    }

    private static BigInteger arg(BigInteger a, BigInteger b) {

        BigInteger sum = a.add(b);
        BigInteger sumarg = sum.divide(BigInteger.valueOf(2));

        return sumarg;


    }
}


