package org.example.pa_303_10_1;

public class Monster implements MonsterInterface{
    String name;
    String attack;

    public Monster(String string) {
        super();
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public void setAttack(String attack) {
        System.out.println(attack);
        this.attack = attack;
    }

    public String attack() {
        String newMonster = "!^_&^$@+%$* I don't know how to attack!";
        return newMonster;
    }}
