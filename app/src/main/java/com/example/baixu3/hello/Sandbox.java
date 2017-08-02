package com.example.baixu3.hello;

import android.graphics.drawable.shapes.RectShape;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Created by baixu3 on 2017/7/23.
 */

public class Sandbox extends RectShape{
    private List<String> mGreeting = new ArrayList<String>();

    public Sandbox()
    {
        //###################################
        // CONSTRUCTORS
        //###################################
    }
    public Sandbox(List<String> mGreeting) {
        this.mGreeting = mGreeting;
    }

    public List<String> getmGreeting() {
        return mGreeting;
    }

    public void setmGreeting(List<String> mGreeting) {
        this.mGreeting = mGreeting;
    }


    @Override
    public boolean hasAlpha() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String greeting : mGreeting)
        {
            stringBuilder.append(greeting+" ");
        }
      //  return "Sandbox{" + "mGreeting=" + mGreeting + '}';
        return stringBuilder.toString().trim();
    }


    public boolean add(String s) {
        System.out.println("Sandbox.add");
        if(!mGreeting.contains(s))
        {
            return mGreeting.add(s);
        }
        else
        {
            return false;
        }

    }



    public static void main(String args[])
    {
        System.out.println("welcome to java");
    }
}
