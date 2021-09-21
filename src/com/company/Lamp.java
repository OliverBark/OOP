package com.company;

public class Lamp {
    private boolean onOff;
    private String lampName;
    private String status;


    public Lamp(String lampName, boolean onOff){
        this.lampName = lampName;
        this.onOff = onOff;
    }

    public Lamp(String lampName){
        this.lampName = lampName;
        onOff = false;
    }

    public boolean flipSwitch(){
        boolean yesNo = onOff = !onOff;
        return yesNo;
    }

    public String toString(){
        if (this.onOff){
            status = "Light is on.";
        } else {
            status = "Light is off";
        }
        return  lampName + " the " + status;
    }

}

