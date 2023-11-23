package com.workintech.store.main;

import com.workintech.store.MonsterGame.Troll;

public class Main {
    public static void main(String[] args) {

        Troll troll = new Troll("Troll", 150, 30, false, true);
        System.out.println("Troll Attack Damage: " + troll.attack());
    }
}
