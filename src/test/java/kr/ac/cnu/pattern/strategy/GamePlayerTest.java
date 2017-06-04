package kr.ac.cnu.pattern.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 28..
 */
@Slf4j
public class GamePlayerTest {
    @Test
    public void test() {
        GamePlayer gamePlayer = new GamePlayer("Robin");
        gamePlayer.setWeapone(new LegendBow());




        gamePlayer.temp(new Weapone() {
            @Override
            public int getDamage() {
                return 0;
            }
        });






        log.info("{}이 공격한다. {}", gamePlayer.getName(), gamePlayer.attack());
    }
}