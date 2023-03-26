package com.game;

public interface GameSpecifications {

    abstract String getComputerPick();
    abstract String getUserPick();
    abstract String getResult(String userPick, String computerPick);

}
