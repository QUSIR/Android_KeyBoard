package com.example.liang.myapplication;

/**
 * Created by liang on 2017/1/3.
 */
public class KeyBoard {
    static{

        System.loadLibrary("keyboard_jni");
    }

    public native void Start_KeyBoard();

}
