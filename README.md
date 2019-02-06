## General-Common

General-Common is the base from [GameChest/General](https://kvm.bytelist.de/git/GameChest/General). It contains the full General API.

-----


### Maven implementations:


#### Common-Spigot:

```xml
<dependency>
    <groupId>de.gamechest</groupId>
    <artifactId>common-spigot</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

```
Common-Spigot contains the General API for the GameChest Spigot plugin.


#### Common-Bungee:

```xml
<dependency>
    <groupId>de.gamechest</groupId>
    <artifactId>common-bungee</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

```
Common-Bungee contains the General API for the GameChest BungeeCord plugin.


-----

### Example:
This example is using `common-spigot`. The `common-bungee` is built up the same using the BungeeCord-API.

```java
SpigotChestPlugin chestPlugin = SpigotChest.getInstance(); // Getting singleton SpigotChestPlugin instance

UUID uuid = UUIDFetcher.getUUID("ByteList"); // Getting UUID from database if exist or unsave from mojang
Player player = Bukkit.getPlayer(uuid);
String displayname = chestPlugin.getDisplayname(player); // Getting the displayname from the player

if(!chestPlugin.hasRank(uuid, Rank.ADMIN)) { // Checking the rank of the player
    chestPlugin.sendNoPermissionMessage(player); // Sending a standard no permission message to the player
    return;
}

player.sendMessage(ChestPrefix.PREFIX + "§eDein Displayname lautet: " + displayname); // Sending a message with the standard prefix

```