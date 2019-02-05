package de.gamechest.common.bungee;

import de.gamechest.common.ChestPlugin;
import net.md_5.bungee.api.CommandSender;

import java.util.UUID;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public interface BungeeChestPlugin extends ChestPlugin {

    public String getBanMessage(UUID uuid);

    public void sendNoPermissionMessage(CommandSender sender);
}
