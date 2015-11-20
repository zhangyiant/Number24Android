package com.antee.number24;

/**
 * Created by Wenwen on 2015/11/20.
 */
public class Number24Calculator {
    public native String calculate(int a, int b, int c, int d);
    static {
        System.loadLibrary("number24calculator-jni");
    }
}
