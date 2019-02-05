package de.gamechest.common.spigot;

import de.gamechest.common.ChestPrefix;
import lombok.Getter;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public final class SpigotChest {

    @Getter
    private static SpigotChestPlugin instance;

    public static void setInstance(SpigotChestPlugin plugin) {
        if(instance != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton SpigotChest instance");
        }
        instance = plugin;
    }

}
