package org.carbon.configurations;

import org.carbon.model.GameState;

import java.util.Arrays;
import java.util.List;

public abstract class InitialConfiguration {

    public static GameState getBlinker() {
        List<List<Boolean>> blinker = Arrays.asList(
                Arrays.asList(false, true, false),
                Arrays.asList(false, true, false),
                Arrays.asList(false, true, false)
        );
        return new GameState(blinker);
    }

    public static GameState getToad() {
        List<List<Boolean>> toad = Arrays.asList(
                Arrays.asList(false, false, true, false),
                Arrays.asList(true, false, false, true),
                Arrays.asList(true, false, false, true),
                Arrays.asList(false, true, false, false)
        );
        return new GameState(toad);
    }

    public static GameState getBeacon() {
        List<List<Boolean>> beacon = Arrays.asList(
                Arrays.asList(true, true, false, false),
                Arrays.asList(true, true, false, false),
                Arrays.asList(false, false, true, true),
                Arrays.asList(false, false, true, true)
        );
        return new GameState(beacon);
    }

    public static GameState getGlider() {
        List<List<Boolean>> glider = Arrays.asList(
                Arrays.asList(false, true, false),
                Arrays.asList(false, false, true),
                Arrays.asList(true, true, true)
        );
        return new GameState(glider);
    }

    public static GameState getLWSS() {
        List<List<Boolean>> lwss = Arrays.asList(
                Arrays.asList(false, true, true, true, true),
                Arrays.asList(true, false, false, false, true),
                Arrays.asList(false, false, false, false, true),
                Arrays.asList(true, false, false, true, false)
        );
        return new GameState(lwss);
    }
}