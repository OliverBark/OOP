package com.company;

import java.util.Random;

public class Die {
    private int faceValue;

    public int getFaceValue() {
        return faceValue;

    }

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(6) + 1;
    }
}

