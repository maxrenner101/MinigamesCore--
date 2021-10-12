import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

  private static FileConfiguration config = MinigamesCore.getInstance().getConfig();

  public static int getArenaAmount(Minigame minigame){
    return config.getConfigurationSection(minigame.toString() + ".arenas").getKeys(false).size();
  }

  public static Location getArenaSpawn(Minigame minigame, int id){
    return new Location(
      Bukkit.getWorld(config.getString(minigame.toString() + ".arenas." + id + ".world")),
      config.getDouble(minigame.toString() + ".arenas." + id + ".x"),
      config.getDouble(minigame.toString() + ".arenas." + id + ".y"),
      config.getDouble(minigame.toString() + ".arenas." + id + ".z"),
      config.getInt(miigame.toString()+".arenas." + id + ".yaw"),
      config.getInt(miigame.toString()+".arenas." + id + ".pitch")
    );
  }
    public static Location getLobbySpawn(Minigame minigame){
    return new Location(
      Bukkit.getWorld(config.getString(minigame.toString() + ".arenas.lobby.world")),
      config.getDouble(minigame.toString() + ".arenas.lobby.x"),
      config.getDouble(minigame.toString() + ".arenas.lobby.y"),
      config.getDouble(minigame.toString() + ".arenas.lobby.z"),
      config.getInt(miigame.toString()+".arenas.lobby.yaw"),
      config.getInt(miigame.toString()+".arenas.lobby.pitch")
    );
  }
}