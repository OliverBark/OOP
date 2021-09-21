package com.company;

public class Main {

    public static void main(String[] args) {
        Lamp skrivebord = new Lamp("Desk lamp ", false);
        Lamp loft = new Lamp("Ceiling lamp ", true);
        Lamp kælder = new Lamp("Basement lamp ", false);
        Lamp Diner = new Lamp("Diner lamp "); //overloading.

        skrivebord.flipSwitch();
        loft.flipSwitch();
        kælder.flipSwitch();
        Diner.flipSwitch();

        System.out.println(skrivebord);
        System.out.println(loft);
        System.out.println(kælder);
        System.out.println(Diner);
    }
}
