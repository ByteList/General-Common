package de.gamechest.common;

import de.gamechest.common.database.ChestDatabaseManager;

import java.util.UUID;

/**
 * Created by ByteList on 03.02.2019.
 * <p>
 * Copyright by ByteList - https://bytelist.de/
 */
public interface ChestPlugin {

    public ChestDatabaseManager getDatabaseManager();

    public String getVersion();

    public String randomKey(int length);

    public String randomNumber(int length);

    public boolean hasRank(UUID uuid, Rank rank);

    public boolean equalsRank(UUID uuid, Rank rank);

    public Rank getRank(UUID uuid);

    public boolean isRankToggled(UUID uuid);

    public boolean isCloudEnabled();

    public String getPlayername(UUID uuid);
}
