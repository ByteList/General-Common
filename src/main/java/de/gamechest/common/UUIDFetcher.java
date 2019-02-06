package de.gamechest.common;

import de.gamechest.common.database.ChestDatabaseUuidBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by ByteList on 26.03.2017.
 */
public class UUIDFetcher {

    private static HashMap<String, UUID> cache = new HashMap<>();

    /**
     * @param playername The name of the player
     * @return The UUID of the given player
     */
    public static UUID getUUID(String playername) {
        if(cache.containsKey(playername)) {
            return cache.get(playername);
        }

        ChestDatabaseUuidBuffer databaseUuidBuffer = Chest.getInstance().getDatabaseManager().getDatabaseUuidBuffer();

        if(databaseUuidBuffer.existsPlayer(playername)) {
            UUID uuid = databaseUuidBuffer.getUUID(playername);
            cache.put(playername, uuid);
            return uuid;
        }
        return getUnsaveUUID(playername);
    }

    /**
     * Get the uuid from the mojang api servers.
     * Can throw a StringIndexOutOfBoundsException if player uuid does not exist.
     *
     * @param playername The name of the player
     * @return The UUID of the given player
     */
    public static UUID getUnsaveUUID(String playername) {
        if(cache.containsKey(playername)) {
            return cache.get(playername);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String toRead, response;
        int i = 7;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + playername);
            URLConnection urlConnection = url.openConnection();
            int cp;

            if (urlConnection != null) urlConnection.setReadTimeout(60 * 1000);

            if (urlConnection != null && urlConnection.getInputStream() != null) {
                inputStreamReader = new InputStreamReader(urlConnection.getInputStream(), Charset.defaultCharset());
                bufferedReader = new BufferedReader(inputStreamReader);

                while ((cp = bufferedReader.read()) != -1) stringBuilder.append((char) cp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
                if(inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        toRead = stringBuilder.toString();
        stringBuilder = new StringBuilder();

        while(i < 200) {
            if(!String.valueOf(toRead.charAt(i)).equalsIgnoreCase("\"")) stringBuilder.append(String.valueOf(toRead.charAt(i)));
            else break;
            i++;
        }

        response = stringBuilder.toString();
        stringBuilder = new StringBuilder();

        for (i = 0; i <= 31; i++) {
            stringBuilder.append(response.charAt(i));
            if (i == 7 || i == 11 || i == 15 || i == 19) {
                stringBuilder.append("-");
            }
        }

        UUID uuid = UUID.fromString(stringBuilder.toString());
        cache.put(playername, uuid);
        return uuid;
    }
}
