package kr.ac.cnu.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class GamePlayer {
    private String name;
    private Weapone weapone;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void setWeapone(Weapone weapone) {
        this.weapone = weapone;
    }

    public String getName() {
        return this.name;
    }

    public int attack() {
        return weapone.getDamage();
    }

    public void temp(Weapone weapone) {
        weapone.getDamage();
    }
}
