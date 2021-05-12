package com.GEECTECH;

public class Main {

    public static void main(String[] args) {
Weapon weapon1 =new Weapon("Боевые","АК 47");

Boss boss =new Boss("Rembo",70,100);

boss.setWeapon(weapon1);
        System.out.println( boss.getName() + " " + boss.getHealth() + " " + boss.getDamage() + " "
                + boss.getWeapon().getTypeWeapon() + " " + boss.getWeapon().getNameWeapon() );
    }
}
