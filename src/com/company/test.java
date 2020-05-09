//package com.company;
//
//import org.junit.Test;
//import java.util.Scanner;
//import java.io.*;
//
//import java.math.BigInteger;
//
//public  class test {
//    private static BigInteger a1;
//    private static BigInteger b1;
//    private static BigInteger a;
//    private static BigInteger b;
//
//
//    public   static void  main(String[] argc) throws FileNotFoundException {
//        Scanner scnr = new Scanner(System.in);//введем наши числа
//      a = new BigInteger (String.valueOf(scnr.nextBigInteger()));
//      b = new BigInteger (String.valueOf(scnr.nextBigInteger()));
////         test2 (a,b);
//
//       File file = new File ("test.txt");
//        Scanner scnr1 = new Scanner(file);//прочитам их из файла
//        a1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
//         BigInteger b1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
//
//          //  BigInteger b1 = new BigInteger(String.valueOf(scnr1.nextBigInteger()));
////            test3 (a1,b1);
//        }
//
//
//    @Test
//    public  void test2(BigInteger a, BigInteger b){
//           System.out.println(arg(a,b));
//    }
//    @Test
//    public void test3(BigInteger a1, BigInteger b1){
//        System.out.println(arg(a1,b1));
//    }
//
//    @Test
//    public void testa() {
//
//
//        BigInteger a = new BigInteger("9000000000000000000");
//        BigInteger b = new BigInteger("8444444444444444444");
//        System.out.println(arg(a,b));
//
//    }
//
//    private static BigInteger arg(BigInteger a, BigInteger b) {
//
//        BigInteger sum = a.add(b);
//        BigInteger sumarg = sum.divide(BigInteger.valueOf(2));
//
//        return sumarg;
//
//
//    }
//}
//
//
