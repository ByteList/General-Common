package de.gamechest.common.bungee;

import de.gamechest.common.Chest;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public final class BungeeChest extends Chest {

    public static BungeeChestPlugin getInstance() {
        return (BungeeChestPlugin) Chest.getInstance();
    }
}
