package de.gamechest.common.spigot;

import de.gamechest.common.ChestPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.Metadatable;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public interface SpigotChestPlugin extends ChestPlugin {

    public String getDisplayname(Player player);

    public void sendNoPermissionMessage(CommandSender sender);

    public SpigotChestNick getNick();

    public void setMetadata(Metadatable object, String key, Object value, Plugin plugin);

    public Object getMetadata(Metadatable object, String key, Plugin plugin);

    public JavaPlugin getPlugin();
}
