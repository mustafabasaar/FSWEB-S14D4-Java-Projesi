package com.workintech.store.MonsterGame;

public class Troll extends Monster implements Bleedable,Poisanable{
    private boolean canBleed;
    private boolean canPoison;

    public Troll(String name, int hitPoints, double damage, boolean canBleed, boolean canPoison) {
        super(name, hitPoints, damage);
        this.canBleed = canBleed;
        this.canPoison = canPoison;
    }
    public double bleed() {
        if (canBleed) {
            return getDamage() * 0.25;
        } else {
            return 0;
        }
    }
    @Override
    public double poison() {
        if (canPoison) {
            return getDamage() * 0.3;
        } else {
            return 0;
        }
    }

    public  double attack() {
        return getDamage() + bleed() + poison();
    }
}
