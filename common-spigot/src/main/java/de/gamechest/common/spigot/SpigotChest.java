package de.gamechest.common.spigot;

import de.gamechest.common.Chest;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public final class SpigotChest extends Chest {

    public static SpigotChestPlugin getInstance() {
        return (SpigotChestPlugin) Chest.getInstance();
    }
}
