package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeaponBoss("Sword of death");
        System.out.println("Boss Health: " + boss.getHealth() + " Boss Damage: " + boss.getDamage() + " Boss weapon: "
                + boss.getWeaponBoss());
        boss.setWeaponBoss("Sword of death");
    }
}
