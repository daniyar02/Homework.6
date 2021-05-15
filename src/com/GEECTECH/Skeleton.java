package com.GEECTECH;

public class Skeleton extends Boss{

private  int numberOfShotsFired;

    public int getNumberOfShotsFired() {
        return numberOfShotsFired;
    }

    public Skeleton(String name, int health, int damage, int numberOfShotsFired) {
        super(name, health, damage);
    this.numberOfShotsFired = numberOfShotsFired;


    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + getNumberOfShotsFired();
    }
}
