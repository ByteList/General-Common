package de.gamechest.common;

import java.util.List;
import java.util.UUID;

/**
 * Created by nemmerich on 05.02.2019.
 * <p>
 * Copyright by nemmerich - https://bytelist.de/
 */
public interface ChestNick {

    public void removeFromCache(UUID uuid);

    public boolean isNicked(UUID uuid);

    public String getNick(UUID uuid);

    public String getPlayernameFromNick(String nick);

    public List<String> getNickedPlayers();

    public String getRandomNickName();

}
