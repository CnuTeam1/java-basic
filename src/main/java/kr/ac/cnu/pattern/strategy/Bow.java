package kr.ac.cnu.pattern.strategy;

/**
 * Created by rokim on 2017. 5. 29..
 */
public class Bow implements Weapone {
    int damage = 10;
    @Override
    public int getDamage() {
        return damage;
    }
}
