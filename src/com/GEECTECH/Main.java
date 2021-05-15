package com.GEECTECH;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
Weapon weapon1 =new Weapon("Боевые","АК 47");

Boss boss =new Boss("Rembo",70,100);

boss.setWeapon(weapon1);

Skeleton zombie1 = new Skeleton("Robert",400,50,30);
Skeleton zombie2 = new Skeleton("Jhon",300,60,40);


  //System.out.println( boss.getName() + " " + boss.getHealth() + " " + boss.getDamage() +" "
  //              + boss.getWeapon().getTypeWeapon() + " " + boss.getWeapon().getNameWeapon() );
        System.out.println(boss.printInfo()+ " "
                + boss.getWeapon().getTypeWeapon()+ " "
                + boss.getWeapon().getNameWeapon());

        System.out.println(zombie1.printInfo());
        System.out.println(zombie2.printInfo());

    }
}
