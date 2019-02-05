package de.gamechest.common.bungee;

import de.gamechest.common.ChestNick;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * Created by nemmerich on 05.02.2019.
 * <p>
 * Copyright by nemmerich - https://bytelist.de/
 */
public interface BungeeChestNick extends ChestNick {

    public void unnickOnDisconnect(ProxiedPlayer proxiedPlayer);
}
