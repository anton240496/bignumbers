package com.company;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {


  @Test
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scnr = new Scanner(System.in);//введем наши числа
       BigInteger   a = new BigInteger(String.valueOf(scnr.nextBigInteger()));
       BigInteger b = new BigInteger(String.valueOf(scnr.nextBigInteger()));
       System.out.println(arg(a, b));


        File file = new File("test.txt");
        Scanner scnr1 = new Scanner(file);//прочитам их из файла
       BigInteger a1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
        BigInteger b1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
       System.out.println(arg(a1, b1));

       BigInteger a2 = new BigInteger("9000000000000000000");
       BigInteger b2 = new BigInteger("8444444444444444444");
       System.out.println(arg(a2,b2));


    }





    private static BigInteger arg(BigInteger a, BigInteger b) {

        BigInteger sum = a.add(b);
        BigInteger sumarg = sum.divide(BigInteger.valueOf(2));

        return sumarg;

    }
}

