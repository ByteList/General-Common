package de.gamechest.common.spigot;

import de.gamechest.common.ChestNick;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Created by nemmerich on 05.02.2019.
 * <p>
 * Copyright by nemmerich - https://bytelist.de/
 */
public interface SpigotChestNick extends ChestNick {

    public void nick(Player player);

    public void nick(Player player, String nick);

    public void nickOnConnect(Player player, String nick);

    public void unNick(Player player);

    public void unnickOnDisconnect(Player player);

    public void updateSkin(Player player);

    public void setSkin(UUID uuid, String nick);

    public void resetSkin(UUID uuid);
}
