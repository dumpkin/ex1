package com.dumpkin;



public class GainCompare {

     float gain;
     float etalon;

    public float gainDelta(float value, float etalonValue){

     etalon = etalonValue;
     gain = value-etalonValue;

     return gain;

    }
}
