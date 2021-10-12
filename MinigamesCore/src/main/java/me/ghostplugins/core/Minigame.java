import lombok.Getter;
import lombok.Setter;

public abstract class Minigame {
  @Getter
  @Setter
  private ArenaHandler arenaHandler;

  public abstract String toString();
}