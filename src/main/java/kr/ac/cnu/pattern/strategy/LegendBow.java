package kr.ac.cnu.pattern.strategy;

/**
 * Created by rokim on 2017. 5. 29..
 */
public class LegendBow implements Weapone {
    int damage = 100;
    @Override
    public int getDamage() {
        System.out.println("겁나 화려한 이펙트가 나옵니다..");
        return damage;
    }
}
