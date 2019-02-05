package de.gamechest.common.bungee;

import de.gamechest.common.ChestPrefix;
import lombok.Getter;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public final class BungeeChest {

    @Getter
    private static BungeeChestPlugin instance;

    public static void setInstance(BungeeChestPlugin plugin) {
        if(instance != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton BungeeChest instance");
        }
        instance = plugin;
    }
}
