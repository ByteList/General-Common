package de.gamechest.common;

import lombok.Getter;

/**
 * Created by ByteList on 06.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public class Chest {

    @Getter
    private static ChestPlugin instance;

    public static void setInstance(ChestPlugin plugin) {
        if(instance != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton Chest instance");
        }
        instance = plugin;
    }
}
