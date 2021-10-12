import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;

public class MinigamesCore extends JavaPlugin {

  @Getter
  private static MinigamesCore instance;

  public void onEnable(){
    
    instance = this;

    // minigame manager -> creates minigames -> creates arenas
    new MinigamesManager();
  }
}