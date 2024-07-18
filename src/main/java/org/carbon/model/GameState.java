package org.carbon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public record GameState(List<List<Boolean>> grid) {

    public GameState updateCell(int x, int y, boolean newValue) {
        List<List<Boolean>> newGrid = grid.stream()
                .map(ArrayList::new)
                .collect(Collectors.toList());
        newGrid.get(x).set(y, newValue);
        return new GameState(newGrid);
    }

    public boolean getCell(int x, int y) {
        return grid.get(x).get(y);
    }

}
