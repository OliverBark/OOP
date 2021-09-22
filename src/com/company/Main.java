package com.company;

public class Main {

    public static void main(String[] args) {
        Lamp skrivebord = new Lamp("Desk lamp ", false);
        Lamp loft = new Lamp("Ceiling lamp ", true);
        Lamp kaelder = new Lamp("Basement lamp ", false);
        Lamp Diner = new Lamp("Diner lamp "); //overloading.

        skrivebord.flipSwitch();
        loft.flipSwitch();
        kaelder.flipSwitch();
        Diner.flipSwitch();

        System.out.println(skrivebord);
        System.out.println(loft);
        System.out.println(kaelder);
        System.out.println(Diner);


        Die firstDice = new Die();

        firstDice.roll();

        System.out.println("\nDice roll: "+ firstDice.getFaceValue());

        Person p1 = new Person("\nJohn", 34);
        Person p2 = new Person("Jesper", 42);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 + " har haft fødselsdag, så nu er han " + p1.hasBirthday());
        System.out.println(p2 + " har haft fødselsdag, så nu er han " + p2.hasBirthday());
    }
}
