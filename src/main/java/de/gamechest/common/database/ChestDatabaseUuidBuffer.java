package de.gamechest.common.database;

import java.util.UUID;

/**
 * Created by ByteList on 06.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public interface ChestDatabaseUuidBuffer {

    public boolean existsPlayer(String name);

    public void createPlayer(String name, UUID uuid);

    public void removePlayer(String name);

    public UUID getUUID(String name);
}
