import lombok.Getter;
import org.bukkit.entity.Player;
import java.util.UUID;

public abstract class Arena {
  @Getter
  private ArrayList<UUID> players;

  public void addPlayer(Player player){
    players.add(player.getUniqueId());
  }

  public void removePlayer(Player player){
    players.remove(player.getUniqueId());
  }

  public abstract void startCountdown();

  public abstract void startGame();
}