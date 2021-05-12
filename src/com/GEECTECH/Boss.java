package com.GEECTECH;

public class Boss extends GameEntity{

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }
    private  Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}