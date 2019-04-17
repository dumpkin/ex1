package com.dumpkin;


import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    float gain;
    float etalon;
    GainCompare result = new GainCompare();

    Scanner in = new Scanner(System.in);

    System.out.println("input etalon for 80: ");
    etalon = in.nextFloat();
    System.out.println("input gain for 80: ");
    gain = in.nextFloat();

    System.out.println(result.gainDelta(gain, etalon));
    in.close();




  }
}
