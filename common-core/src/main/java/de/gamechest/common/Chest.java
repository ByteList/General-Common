package de.gamechest.common;

import lombok.Getter;

import java.util.HashMap;

/**
 * Created by ByteList on 06.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public class Chest {

    @Getter
    private static ChestPlugin instance;
    @Getter
    private static final HashMap<String, Rank> permissionRank = new HashMap<String, Rank>() {
        {
            put("command.stop", Rank.MODERATOR);

            put("command.goto", Rank.BUILDER);
            put("command.join", Rank.BUILDER);
            put("command.server", Rank.SUPPORTER);
        }
    };

    public static void setInstance(ChestPlugin plugin) {
        if(instance != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton Chest instance");
        }
        instance = plugin;
    }
}
